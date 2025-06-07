package com.ox.frames.domain.entities

data class Collection(
    val id:String,
    val title:String,
    val rails: List<Rail>? = null
)
