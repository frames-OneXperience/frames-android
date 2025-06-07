package com.ox.frames.presentation.downloads

import androidx.lifecycle.ViewModel
import com.ox.frames.domain.entities.Content
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DownloadsScreenViewModel : ViewModel() {
    private val _uiState  = MutableStateFlow(DownloadScreenUIState())
    val uiState = _uiState.asStateFlow()
    init {
        _uiState.update {
            it.copy(isLoading = false, content = listOf(
                Content("01","Srarastu Shubhamastu", imageUrl = "https://akamaividz2.zee5.com/image/upload/w_611,h_344,c_scale,f_webp,q_auto:eco/resources/0-1-6z5660403/list/0000000049a49b0a72474c49a98ef53b97e3c03615.jpg"),
                Content("01","Puttakkana Makkalu", imageUrl = "https://akamaividz2.zee5.com/image/upload/w_525,h_296,c_scale,f_webp,q_auto:eco/resources/0-1-6z5660371/list/0000000013409143d580a964bcd884c6d8659fb3f55.jpg"),
                Content("01","Nagamandala", imageUrl = "https://akamaividz2.zee5.com/image/upload/w_525,h_296,c_scale,f_webp,q_auto:eco/resources/0-1-6z5663223/list/NaagamandalaEp360Episode01122024kneaa100bfe6674ad5988a4fdbca0a06ef.jpg"),
                Content("01","Srarastu Shubhamastu", imageUrl = "https://akamaividz2.zee5.com/image/upload/w_525,h_296,c_scale,f_webp,q_auto:eco/resources/0-1-6z5660406/list/00000000182ed3f80beed824a4098b76841d1434abc.jpg")))
        }
    }
}