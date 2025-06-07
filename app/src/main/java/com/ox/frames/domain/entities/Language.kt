package com.ox.frames.domain.entities

data class Language(
    val id:Int,
    val name:String,
    val imageUrl:String,
    val isSelected:Boolean = false
)


fun getLanguages():List<Language>{
    return listOf(
        Language(id = 1, name = "Kannada",imageUrl = "https://t", isSelected = false),
        Language(id = 2, name = "English",imageUrl = "https://t", isSelected = false),
        Language(id = 3, name = "Hindi",imageUrl = "https://t", isSelected = false),
        Language(id = 4, name = "Marathi",imageUrl = "https://t", isSelected = false),
        Language(id = 5, name = "Telugu",imageUrl = "https://t", isSelected = false),
        Language(id = 6, name = "Tamil",imageUrl = "https://t", isSelected = false),
        Language(id = 7, name = "Bengali",imageUrl = "https://t", isSelected = false),
        Language(id = 8, name = "French",imageUrl = "https://t", isSelected = false),
    )
}