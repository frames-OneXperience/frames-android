package com.ox.frames.common.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.ox.frames.domain.entities.Language

@Composable
fun LanguageCard(
    modifier: Modifier = Modifier,
    language: Language,
    onItemClicked:(id:Int)->Unit = {},
    ){
    Card(modifier = modifier, border = BorderStroke(1.dp, Color.White), onClick = {
        onItemClicked(language.id)
    }) {
        Box{
            AsyncImage(model = ImageRequest.Builder(LocalContext.current)
                .data("https://t3.ftcdn.net/jpg/05/00/81/96/360_F_500819621_7bRfuKkKyaRYU6aJ1Sa9RBCPdscka6Iq.jpg")
                .crossfade(true)
                .build()
                , contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)
            Icon(
                imageVector = Icons.Rounded.FavoriteBorder,
                contentDescription = "",
                modifier = Modifier.padding(20.dp),
                tint = if(language.isSelected) Color.Yellow else Color.White
            )

            Text(text = language.name,
                Modifier.align(Alignment.BottomStart).padding(20.dp))
        }
    }
}

//@Preview
//@Composable
//fun PreviewLanguageCard(){
//    LanguageCard(modifier = Modifier
//        .height(200.dp)
//        .width(100.dp))
//}