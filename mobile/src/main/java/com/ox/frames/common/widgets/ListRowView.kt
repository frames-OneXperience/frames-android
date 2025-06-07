package com.ox.frames.common.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.frames.designsystem.CardType
import com.frames.designsystem.cards.StandardCard
import com.frames.domain.entity.Section

@Composable
fun ListRowView(
    section: Section,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(6.dp)) {
        Text(text = section.title)

        val cardType = when(section.cardType){
            "Movies" -> CardType.Portrait
            "Shows" -> CardType.Landscape
            "Directors" -> CardType.Square
            else -> CardType.Portrait
        }

        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items(section.contents){
                StandardCard(cardType = cardType, content = it)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}