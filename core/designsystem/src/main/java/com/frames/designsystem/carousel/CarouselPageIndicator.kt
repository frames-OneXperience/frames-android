package com.frames.designsystem.carousel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CarouselPageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int = 0,
    currentPage : Int = 0
){
    Row(modifier = modifier) {
        repeat(pageSize) { index ->
            val color = if(index == currentPage) MaterialTheme.colorScheme.primary else Color.LightGray
            Box(modifier = Modifier
                .padding(2.dp)
                .clip(CircleShape)
                .background(color)
                .size(8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewCarouselPageIndicator(){
    CarouselPageIndicator(pageSize = 5, currentPage = 2)
}