package com.ram.ilabanktask.data

object MockMovieData {
    fun getMovies(): List<Movie> {
        return listOf(
            // Action Movies
            Movie(
                "Action",
                "The Dark Knight",
                "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_SX300.jpg",
                "Batman faces the Joker in a psychological and physical battle to save Gotham.",
                "2008"
            ),
            Movie(
                "Action",
                "Gladiator",
                "https://m.media-amazon.com/images/M/MV5BMDliMmNhNDEtODUyOS00MjNlLTgxODEtN2U3NzIxMGVkZTA1L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg",
                "A betrayed Roman general fights for justice as a gladiator in the Colosseum.",
                "2000"
            ),
            Movie(
                "Action",
                "Mad Max: Fury Road",
                "https://m.media-amazon.com/images/M/MV5BMjMwNDkxMTgzOF5BMl5BanBnXkFtZTgwNTkwNTQ3NjM@._V1_SX300.jpg",
                "In a post-apocalyptic world, Max helps a group of rebels escape a tyrannical warlord.",
                "2015"
            ),
            Movie(
                "Action",
                "John Wick",
                "https://m.media-amazon.com/images/M/MV5BMTU2NjE4NTczOF5BMl5BanBnXkFtZTgwODc4NTM4MTE@._V1_SX300.jpg",
                "A retired hitman seeks vengeance for his stolen car and the killing of his dog.",
                "2014"
            ),
            Movie(
                "Action",
                "Die Hard",
                "https://m.media-amazon.com/images/M/MV5BZjRlNDUxZjAtOGQ4OC00OTNlLTgxNmQtYTBmMDgwZmNmNjkxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
                "A NYPD officer fights terrorists in a Los Angeles skyscraper.",
                "1988"
            ),
            Movie(
                "Action",
                "The Matrix",
                "https://m.media-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg",
                "A hacker discovers reality is a simulation and joins a rebellion against the machines.",
                "1999"
            ),

            // Science Fiction Movies
            Movie(
                "Science Fiction",
                "Inception",
                "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_SX300.jpg",
                "A thief with the ability to enter people's dreams attempts to pull off the ultimate heist.",
                "2010"
            ),
            Movie(
                "Science Fiction",
                "Interstellar",
                "https://m.media-amazon.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg",
                "A team of astronauts travel through a wormhole in search of a new home for humanity.",
                "2014"
            ),
            Movie(
                "Science Fiction",
                "The Terminator",
                "https://m.media-amazon.com/images/M/MV5BMTg1NzYwNDE4OF5BMl5BanBnXkFtZTgwMDkzOTQzMDE@._V1_SX300.jpg",
                "A cyborg assassin is sent back in time to kill a woman whose unborn son will lead the resistance.",
                "1984"
            ),
            Movie(
                "Science Fiction",
                "Blade Runner 2049",
                "https://m.media-amazon.com/images/M/MV5BNjQxNDEzMDM1N15BMl5BanBnXkFtZTgwNzcwMzM2MzI@._V1_SX300.jpg",
                "A young blade runner discovers a long-buried secret that leads him to track down former blade runner Rick Deckard.",
                "2017"
            ),

            // Thriller Movies
            Movie(
                "Thriller",
                "The Silence of the Lambs",
                "https://m.media-amazon.com/images/M/MV5BNjNhZTk0ZmEtNjJhMi00YzFlLWE1MmEtYzM1M2ZmMGMwMTU4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg",
                "An FBI cadet seeks the help of a cannibalistic serial killer to catch another murderer.",
                "1991"
            ),
            Movie(
                "Thriller",
                "Se7en",
                "https://m.media-amazon.com/images/M/MV5BOTUwODM5MTctZjczMi00OTk4LTg3NWUtNmVhMTAzNTNjYjcyXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg",
                "Two detectives hunt a serial killer using the seven deadly sins as his motives.",
                "1995"
            ),
            Movie(
                "Thriller",
                "Joker",
                "https://m.media-amazon.com/images/M/MV5BMjA5NzI4MTcxNV5BMl5BanBnXkFtZTgwMTMwNzM5NzM@._V1_SX300.jpg",
                "A mentally troubled stand-up comedian embarks on a downward spiral that leads to chaos.",
                "2019"
            ),
            Movie(
                "Thriller",
                "Gone Girl",
                "https://m.media-amazon.com/images/M/MV5BMTkzNzM2MjYzOV5BMl5BanBnXkFtZTgwNzU1NzE3MjE@._V1_SX300.jpg",
                "A man becomes the prime suspect in the disappearance of his wife.",
                "2014"
            ),

            // Horror Movies
            Movie(
                "Horror",
                "Psycho",
                "https://m.media-amazon.com/images/M/MV5BNTQwNDM1YzItNDAxZC00NWY2LTk0M2UtNDIwNWI5OGUyNWUxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
                "A secretary on the run checks into a remote motel run by a man with a dark secret.",
                "1960"
            ),
            Movie(
                "Horror",
                "The Shining",
                "https://m.media-amazon.com/images/M/MV5BYThmY2U3YzktMGU3NS00NTgxLTk0NzMtMGEzNjA5OWU4OTdlXkEyXkFqcGdeQXVyMTE5NTc5NzM@._V1_SX300.jpg",
                "A family caretaker at an isolated hotel succumbs to madness and terrorizes his family.",
                "1980"
            ),
            Movie(
                "Horror",
                "Get Out",
                "https://m.media-amazon.com/images/M/MV5BMjMwNjQ2MTQ4Ml5BMl5BanBnXkFtZTgwMTc3MjU4MTI@._V1_SX300.jpg",
                "A young Black man uncovers disturbing secrets when visiting his white girlfriend's family.",
                "2017"
            ),
            Movie(
                "Horror",
                "A Quiet Place",
                "https://m.media-amazon.com/images/M/MV5BMTAxNTc5MTcwMDVeQTJeQWpwZ15BbWU4MDEwNzM4NDcz._V1_SX300.jpg",
                "A family must live in silence to avoid mysterious creatures that hunt by sound.",
                "2018"
            )
        )
    }
}