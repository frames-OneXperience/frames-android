package com.frames.designsystem.carousel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.PlayArrow
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.frames.domain.entity.Content


@Composable
fun CarouselSlide(
    content: Content,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier
        .clip(RoundedCornerShape(8.dp))
        .background(Color.DarkGray)
    ) {
        // Banner image
        AsyncImage(
            modifier = modifier,
            model = ImageRequest.Builder(LocalContext.current)
                .data(content.posterUrl)
                .build(),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        // Gradient overlay
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(Color.Transparent, Color.Black),
                )
            ))

        // Banner content
        Column(
            modifier = Modifier.align(Alignment.BottomCenter).padding(16.dp,24.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally)  {
            if(content.logoUrl.isNotEmpty()){
                AsyncImage(
                    modifier = Modifier.height(50.dp),
                    model = ImageRequest.Builder(LocalContext.current)
                    .data(content.logoUrl)
                    .crossfade(true)
                    .build(),
                    contentDescription = "",)
            }else{
                Text(text = content.title, style = MaterialTheme.typography.headlineSmall)
            }
            Text(text = "Action.Horror.Drama.Thriller.Adventure", style = MaterialTheme.typography.bodySmall)
            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {

                // Watch now button
                Button(onClick = {}) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Rounded.PlayArrow, contentDescription = "watch-now")
                        Text(text = "Watch Now")
                    }
                }
                // Add to watchlist button
                Button(onClick = {}) {
                    Icon(imageVector = Icons.Rounded.Add, contentDescription = "add-watch-list")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewCarouselSlide(){
    val content = Content(id = 1, title = "CLOSED PRINCIPAL", posterUrl = "")
    CarouselSlide(content = content ,modifier = Modifier.fillMaxSize())
}