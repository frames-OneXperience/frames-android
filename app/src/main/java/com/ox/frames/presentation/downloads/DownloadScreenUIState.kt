package com.ox.frames.presentation.downloads

import com.ox.frames.domain.entities.Content

data class DownloadScreenUIState(
    val isLoading:Boolean = false,
    val error : String = "",
    val content : List<Content> = emptyList()
)
