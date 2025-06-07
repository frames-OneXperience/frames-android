package com.ox.frames.common.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ListRowView(modifier: Modifier = Modifier){
    Column(modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = "Popular Movies")
        LazyRow(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
            items(10){
                Surface(
                    modifier = Modifier.size(125.dp,175.dp),
                    color = Color.White,
                    shape = RoundedCornerShape(8.dp)) {

                }
            }
        }
    }
}