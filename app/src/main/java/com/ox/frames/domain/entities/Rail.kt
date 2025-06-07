package com.ox.frames.domain.entities

data class Rail(
    val id:String,
    val title:String,
    val position:Int? = null,
    val contents : List<Content>)


fun getRail():Rail {
    return Rail(
        id = "1",
        title = "Popular Movies",
        position = 0,
        contents = listOf(
            Content(id = "1", title = "Movie 1", imageUrl = "https://t"),
            Content(id = "2", title = "Movie 2", imageUrl = "https://t"),
        )
    )
}