package com.frames.designsystem.cards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frames.designsystem.CardType
import com.frames.domain.FakeCatalogData
import com.frames.domain.entity.Content


@Composable
fun EpisodeCard(
    content: Content,
    modifier: Modifier = Modifier){

    Column(modifier=Modifier.width(CardType.Landscape.width.dp)) {
        Box(){
            StandardCard(content = content, cardType = CardType.Landscape)
            Row( modifier= Modifier.fillMaxWidth().padding(6.dp).align(Alignment.BottomCenter),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "")
                Text(text = "23m")
            }
        }
        Text(text = content.title,
            style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp),
            modifier = Modifier.padding(top = 6.dp).fillMaxWidth())
        Text(text = "S1 E1238. 8 JUN",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.bodySmall.copy(fontSize = 8.sp),)
    }
}

@Preview
@Composable
fun PreviewEpisodeCard(){
    EpisodeCard(content = FakeCatalogData.getCatalog().sections[0].contents[0])
}