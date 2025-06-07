package com.ox.frames.presentation.language

import com.ox.frames.domain.entities.Language

data class ChooseLanguageScreenUIState(
    val isLoading:Boolean = false,
    val languages:List<Language> = emptyList(),
    val error:String = ""
)