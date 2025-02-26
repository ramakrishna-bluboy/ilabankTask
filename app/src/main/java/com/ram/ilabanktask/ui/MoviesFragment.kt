package com.ram.ilabanktask.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.ram.ilabanktask.databinding.FragmentMoviesBinding
import kotlinx.coroutines.launch


class MoviesFragment : Fragment() {

    private lateinit var binding: FragmentMoviesBinding
    private val movieViewModel by viewModels<MovieViewModel>()
    private val movieListAdapter by lazy {
        MovieListAdapter()
    }
    private val categoriesAdapter by lazy {
        MovieCategoryCarouselAdapter()
    }

    init {
        collectEffect()
        collectState()
    }

    private fun collectEffect() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                movieViewModel.effect.collect {
                    when (it) {
                        is MovieEffect.HandleError -> {
                            //showErrorDialog(it.error)
                            //needs to handle error
                        }
                    }
                }
            }
        }
    }


    private fun collectState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                movieViewModel.state.collect {
                    if (it.movies != null) {
                        movieListAdapter.submitList(it.movies)
                    }
                    if (it.categories != null) {
                        categoriesAdapter.submitList(it.categories)
                    }
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        with(binding) {

            // Set up ViewPager
            viewPager.adapter = categoriesAdapter
            // Attach TabLayout to ViewPager
            TabLayoutMediator(tabLayout, viewPager) { _, _ -> }.attach()

            viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    movieViewModel.sendEvent(
                        MovieEvent.GetMovies(
                            categoriesAdapter.currentList[position].type
                        )
                    )
                }
            })

            // Set up RecyclerView
            recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
            recyclerView.adapter = movieListAdapter

            searchBar.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    // Call search function when text changes
                    s?.let { query ->
                        movieViewModel.sendEvent(
                            MovieEvent.SearchMovies(
                                categoriesAdapter.currentList[viewPager.currentItem].type,
                                query.toString()
                            )
                        )
                    }
                }

                override fun afterTextChanged(s: Editable?) {}
            })
        }
    }
}
