package com.ox.frames.common.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter

@Composable
fun HeroBanner(modifier: Modifier = Modifier){
    val pagerState = rememberPagerState(pageCount = {4})
    Box(modifier = modifier.background(color = Color.Black),) {
        HorizontalPager(state = pagerState, modifier = modifier) { page ->
            HeroBannerImage(modifier)
        }
        Row(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.Center) {
            repeat(pagerState.pageCount){ iteration ->
                val color = if(pagerState.currentPage == iteration) Color.DarkGray else Color.LightGray
                Box(modifier = Modifier
                    .padding(2.dp)
                    .clip(CircleShape)
                    .background(color)
                    .size(8.dp))
            }
        }
    }
}

@Composable
private fun GradientOverlay(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            Brush.verticalGradient(
                listOf(Color.Transparent, Color.Black),
            )
        ))
}

@Composable
fun HeroBannerImage(modifier: Modifier = Modifier){
    Column(modifier = modifier
        .padding(bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Box(modifier = Modifier.weight(1f)) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = rememberAsyncImagePainter(model = "https://image.tmdb.org/t/p/original/hQYEA4Ty1RlxsToWMYLE2RzSc0N.jpg" ),
                contentScale = ContentScale.Crop,
                contentDescription = "",
            )
            GradientOverlay()
        }

        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(text = "CLOSED PRINCIPLE", style = MaterialTheme.typography.titleLarge)
            Text(text = "Hindi . Drama . Actions . Comedy", style = MaterialTheme.typography.bodyMedium)
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Subscribe to Watch")
                }
                Button(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.Add, contentDescription = "")
                }
            }
        }
    }
}