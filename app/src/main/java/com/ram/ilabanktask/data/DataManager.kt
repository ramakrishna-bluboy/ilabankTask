package com.ram.ilabanktask.data

import com.ram.ilabanktask.R

class DataManager() {
    fun getMovies(): List<Movie> {
        return MockMovieData.getMovies()
    }

    private fun getMovieCategoryImage(key: String): Int {
        return when (key) {
            "Action" -> R.drawable.action
            "Science Fiction" -> R.drawable.sciencefiction
            "Thriller" -> R.drawable.thriller
            "Horror" -> R.drawable.horror
            else -> R.drawable.movie
        }
    }

    fun getMovieCategories(): List<MovieCategory> {
        return MockMovieData.getMovies().groupBy { it.type }.map {
            MovieCategory(
                it.key,
                it.key,
                getMovieCategoryImage(it.key)
            )
        }
    }

    fun getMoviesByCategory(category: String): List<Movie> {
        return MockMovieData.getMovies().filter { it.type == category }
    }

    fun filterMoviesByCategory(category: String, searchString: String): List<Movie> {
        return MockMovieData.getMovies().filter {
            it.type == category && it.title.contains(searchString, true)
        }
    }
}