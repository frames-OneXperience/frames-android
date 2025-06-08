package com.frames.domain

import com.frames.domain.entity.Collection
import com.frames.domain.entity.Content
import com.frames.domain.entity.Section

object FakeCatalogData {

    fun getBannerData(): List<Content> {
        return listOf(
            Content(
                id = 1,
                title = "CLOSED PRINCIPAL",
                posterUrl = "https://image.tmdb.org/t/p/original/yjmNvpKgAcMtFoWI4fpXSLWkQPP.jpg",
                logoUrl = "https://image.tmdb.org/t/p/original/spoRLizrRY700o1cNzZosgh0h4u.png"
            ),

            Content(
                id = 1,
                title = "CLOSED PRINCIPAL",
                posterUrl = "https://image.tmdb.org/t/p/original/hqcexYHbiTBfDIdDWxrxPtVndBX.jpg",
                logoUrl = "https://image.tmdb.org/t/p/original/odWeQ9wSbEOTwEpln0IdwTwWClJ.png"
            ),Content(
                id = 1,
                title = "CLOSED PRINCIPAL",
                posterUrl = "https://image.tmdb.org/t/p/original/4YZpsylmjHbqeWzjKpUEF8gcLNW.jpg",
                logoUrl = ""
            ),
        )
    }

    fun getCatalog(): Collection {
        return Collection(
            screenTitle = "Home", sections = listOf(
                Section(
                    1, "Kannada Movies", cardType = "Movies", contents = listOf(
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/original/yjmNvpKgAcMtFoWI4fpXSLWkQPP.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/yFHHfHcUgGAxziP1C3lLt0q2T4s.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/yqsCU5XOP2mkbFamzAqbqntmfav.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uX6FaNE86a4Xnf1mFFEryvjqB1D.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/t48miSSfe7COqgbgMyRIyPVTBoM.jpg"
                        ),
                    )
                ),
                Section(
                    1, "Hollywood Movies", cardType = "Shows", contents = listOf(
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/original/4O8s9kF6pW5xxSidsyz71nHB3Du.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/original/nuOzdMOXCRQpg5BUHVFxlfkKFpM.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/original/rA1AnWYE5UztbQ4VgrB1iQ2WiLN.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/original/dp1M8TPrlA6H6KWW6rhVapjOHvd.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/original/vmFH1zfIL8fImWu1WFSPct936ge.jpg"
                        ),
                    )
                ),
                Section(
                    1, "Bollywood Movies", cardType = "Movies", contents = listOf(
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/original/ppIsqcy4VTcb9rcCm1yBJhGvnSY.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/original/nuh0QZGeh3qsUzISOrNRh3acpxj.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mKp4euM5Cv3m2U1Vmby3OGwcD5y.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/yZOdrJDl2GwREoigC0y40kMosxj.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/t48miSSfe7COqgbgMyRIyPVTBoM.jpg"
                        ),
                    )
                ),
                Section(
                    1, "Bollywood Directors", cardType = "Directors", contents = listOf(
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/egEyy7m35EF1OrBs0ik7YGEadpC.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/sglKcvdU3e8hTy1kOghEbT0GdHS.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/7ybrvqJd9xNPm2RWO3PtzN5ioBv.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/cwXIJIHnBqzwpwvl4Tie4mud02q.jpg"
                        ),
                        Content(
                            id = 1,
                            "Wednesday",
                            posterUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/oXtWkS6QpXBfIKvyIjHAMKlA3um.jpg"
                        ),
                    )
                ),
            )
        )
    }
}