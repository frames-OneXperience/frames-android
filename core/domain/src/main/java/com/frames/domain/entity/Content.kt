package com.frames.domain.entity



data class Content(
    val id : Int,
    val title : String,
    val logoUrl : String = "",
    val posterUrl : String,
    val mediaType : String = "",
    val duration : Int = 0,
    val description: String = "",
    val rating : Double = 0.0,
    val languages : List<String> = listOf(),
    val genres : List<String> = listOf(),
    val actors : List<String> = listOf(),
)
