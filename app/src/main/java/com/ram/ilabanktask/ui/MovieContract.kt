package com.ram.ilabanktask.ui

import com.ram.ilabanktask.base.UiEffect
import com.ram.ilabanktask.base.UiEvent
import com.ram.ilabanktask.base.UiState
import com.ram.ilabanktask.data.Movie
import com.ram.ilabanktask.data.MovieCategory

data class MovieState(
    val isLoading: Boolean,
    val movies: List<Movie>? = null,
    val categories: List<MovieCategory>? = null
) : UiState()

sealed class MovieEffect : UiEffect() {
    data class HandleError(val error: String) : MovieEffect()
}

sealed class MovieEvent : UiEvent() {
    data class GetMovies(val category: String) : MovieEvent()
    data class SearchMovies(
        val category: String,
        val searchString: String
    ) : MovieEvent()
}
