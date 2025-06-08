package com.frames.designsystem.carousel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.frames.domain.entity.Content

@Composable
fun Carousel(
    modifier: Modifier = Modifier,
    contents: List<Content> = listOf(),
    initialPage: Int = 0
) {
    val pagerState = rememberPagerState(
        initialPage = initialPage, pageCount = { contents.size })

    Box( modifier = modifier.fillMaxWidth().aspectRatio(1f)) {
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) { page ->
            val content = contents[page]
            CarouselSlide(content = content,modifier = Modifier.fillMaxSize())
        }
        // Carousel bottom page indicator
        CarouselPageIndicator(
            modifier = Modifier.align(Alignment.BottomCenter),
            pageSize = contents.size,
            currentPage = pagerState.currentPage
        )
    }
}

@Preview
@Composable
fun PreviewCarousel(){
    Carousel()
}