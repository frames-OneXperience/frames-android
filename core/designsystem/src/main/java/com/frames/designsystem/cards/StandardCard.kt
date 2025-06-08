package com.frames.designsystem.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.frames.designsystem.CardType
import com.frames.domain.entity.Content

@Composable
fun StandardCard(
    content:Content,
    cardType: CardType,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .width(cardType.width.dp)
            .clip(RoundedCornerShape(8.dp))
            .aspectRatio(cardType.aspectRatio)
            .background(Color.Gray)
    ) {
        if (content.posterUrl.isNotEmpty()) {
            AsyncImage(model = ImageRequest.Builder(LocalContext.current)
                    .data(content.posterUrl)
                    .crossfade(true)
                    .build(),
                contentScale = ContentScale.Crop,
                contentDescription = ""
            )
        }
    }
}

