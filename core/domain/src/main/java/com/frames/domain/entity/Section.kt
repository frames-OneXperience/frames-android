package com.frames.domain.entity

data class Section(
    val id : Int,
    val title : String,
    val cardType: String,
    val contents : List<Content>
)
