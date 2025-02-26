package com.ram.ilabanktask.ui


import androidx.lifecycle.viewModelScope
import com.ram.ilabanktask.base.BaseViewModel
import com.ram.ilabanktask.data.DataManager
import kotlinx.coroutines.launch

class MovieViewModel(
) : BaseViewModel<MovieState, MovieEffect, MovieEvent>() {

    private val dataManager by lazy {
        DataManager()
    }

    init {
        loadMovieCategories()
    }

    private fun getMovies(category: String) {
        viewModelScope.launch {
            try {
                setState {
                    copy(
                        isLoading = true
                    )
                }
                val result = dataManager.getMoviesByCategory(category)
                setState {
                    copy(
                        isLoading = false
                    )
                }

                if (result.isNotEmpty()) {
                    setState {
                        copy(
                            movies = result
                        )
                    }
                } else {
                    sendEffect(
                        MovieEffect.HandleError(
                            "No data found"
                        )
                    )
                }
            } catch (e: Exception) {
                sendEffect(
                    MovieEffect.HandleError(
                        "Something went wrong"
                    )
                )
            }
        }
    }

    private fun loadMovieCategories() {
        viewModelScope.launch {
            try {
                setState {
                    copy(
                        isLoading = true
                    )
                }
                val result = dataManager.getMovieCategories()
                setState {
                    copy(
                        isLoading = false
                    )
                }

                if (result.isNotEmpty()) {
                    setState {
                        copy(
                            categories = result
                        )
                    }
                } else {
                    sendEffect(
                        MovieEffect.HandleError(
                            "No data found"
                        )
                    )
                }
            } catch (e: Exception) {
                sendEffect(
                    MovieEffect.HandleError(
                        "Something went wrong"
                    )
                )
            }
        }
    }

    override fun handleEvent(event: MovieEvent) {
        when (event) {
            is MovieEvent.GetMovies -> {
                getMovies(event.category)
            }

            is MovieEvent.SearchMovies -> {
                searchMovies(event.category, event.searchString)
            }
        }
    }

    private fun searchMovies(category: String, searchString: String) {
        viewModelScope.launch {
            try {
                setState {
                    copy(
                        isLoading = true
                    )
                }
                val result = dataManager.filterMoviesByCategory(category, searchString)
                setState {
                    copy(
                        isLoading = false
                    )
                }

                setState {
                    copy(
                        movies = result
                    )
                }

            } catch (e: Exception) {
                sendEffect(
                    MovieEffect.HandleError(
                        "Something went wrong"
                    )
                )
            }
        }
    }

    override fun createInitialState(): MovieState = MovieState(isLoading = false)
}