package com.frames.domain.entity

data class Content(
    val id : Int,
    val title : String,
    val posterUrl : String,
    val mediaType : String = "",
)
