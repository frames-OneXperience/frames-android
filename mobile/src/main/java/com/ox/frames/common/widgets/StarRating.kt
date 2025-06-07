package com.ox.frames.common.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StarRating(maxRating: Int = 5,rating: Int = 3){
    Row {
        for (i in 1..maxRating){
            Icon(
                modifier = Modifier.size(10.dp),
                imageVector = Icons.Rounded.Star,
                contentDescription = "",
                tint = if (i <= rating) androidx.compose.ui.graphics.Color.Yellow else androidx.compose.ui.graphics.Color.Gray
            )
        }
    }
}

@Preview
@Composable
fun PreviewStarRating(){
    StarRating()
}