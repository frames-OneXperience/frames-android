package com.ox.frames.common.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import coil3.size.Scale


@Composable
fun ImageCard(modifier: Modifier = Modifier){
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data("https://img.freepik.com/premium-photo/movie-poster-design_841014-8784.jpg?w=360")
            .scale(Scale.FILL)
            .crossfade(true)
            .build(),
        contentDescription = "",
        modifier = modifier)
}


@Preview
@Composable
fun PreviewImageCard(){
    ImageCard(modifier = Modifier.size(150.dp))
}