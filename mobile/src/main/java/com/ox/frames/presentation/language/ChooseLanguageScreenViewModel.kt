package com.ox.frames.presentation.language

import androidx.lifecycle.ViewModel
import com.ox.frames.domain.entities.getLanguages
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ChooseLanguageScreenViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ChooseLanguageScreenUIState())
    val uiState:StateFlow<ChooseLanguageScreenUIState> = _uiState.asStateFlow()

    init {
        _uiState.update {
            it.copy(
                languages = getLanguages()
            )
        }
    }

    fun chooseLanguage(id:Int){
        _uiState.update {
            it.copy(
                languages = it.languages.map { language ->
                    if (language.id == id) {
                        language.copy(isSelected = !language.isSelected)
                    }else{
                        language
                    }
                }
            )
        }
    }
}