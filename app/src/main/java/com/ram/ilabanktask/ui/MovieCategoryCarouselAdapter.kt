package com.ram.ilabanktask.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ram.ilabanktask.data.MovieCategory
import com.ram.ilabanktask.databinding.ItemCarouselBinding

class MovieCategoryCarouselAdapter :
    ListAdapter<MovieCategory, MovieCategoryCarouselAdapter.ImageViewHolder>(
        MovieCategoryDiffCallback()
    ) {

    class ImageViewHolder(private val binding: ItemCarouselBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movieCategory: MovieCategory) {
            binding.imageView.contentDescription = movieCategory.title
            binding.imageView.setImageResource(movieCategory.bannerDrawable)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ItemCarouselBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MovieCategoryDiffCallback : DiffUtil.ItemCallback<MovieCategory>() {
        override fun areItemsTheSame(oldItem: MovieCategory, newItem: MovieCategory): Boolean {
            return oldItem.title == newItem.title  // Ensure unique Title for correct diffing
        }

        override fun areContentsTheSame(oldItem: MovieCategory, newItem: MovieCategory): Boolean {
            return oldItem == newItem  // Compares all data fields
        }
    }
}
