package com.ox.frames.domain.entities

data class Content(
    val id:String,
    val title:String,
    val imageUrl:String,
    val duration:String = "50 min",
    val size:String = "200 mb"
    )
