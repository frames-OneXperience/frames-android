package com.ox.frames.presentation.detail

import android.widget.RatingBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.ChipColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.ox.frames.common.widgets.ImageCard
import com.ox.frames.common.widgets.StarRating

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContentDetailScreen(
    onHomeClicked : ()-> Unit
){
    val genres = listOf("Action","Adventure","Fantasy")
    Scaffold(
        topBar = { TopAppBar(title = { /*TODO*/ },
            scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
            navigationIcon = { Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = "")})}
    ) { innerPadding ->
        Box(modifier = Modifier
            .padding(innerPadding)
            .verticalScroll(rememberScrollState())) {
            Column {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)
                    .background(color = Color.Black)
                    ) {

                    ImageCard(modifier = Modifier.fillMaxSize())

                    Column(
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Row(horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.Bottom) {
                            AssistChip(onClick = { }, label = {
                                Text(text = "2016")
                            })

                            Row(verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Column(horizontalAlignment = Alignment.End) {
                                    StarRating()
                                    Text(text = "38876 VOTES")
                                }
                                Text(text = "975",
                                    style = MaterialTheme.typography.headlineLarge
                                )
                            }
                        }
                        Text(
                            text = "Official Reviews",
                            style = MaterialTheme.typography.titleLarge)

                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(6.dp),
                    modifier = Modifier.padding(20.dp,5.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                        Icon(
                            modifier = Modifier.size(10.dp),
                            imageVector = Icons.Rounded.FavoriteBorder,
                            contentDescription = "" ,
                            tint = Color.Yellow)
                        Text(text = "2h 13min")
                    }
                    for (genre in genres){
                        AssistChip(onClick = { }, label = {
                            Text(text = genre)
                        })
                    }
                }

                Column(modifier = Modifier.padding(20.dp,5.dp)) {
                    Text(text = "STORYLINE", style = MaterialTheme.typography.bodyLarge)
                    Text(text = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.")
                }
                
                Row(
                    modifier = Modifier.padding(20.dp,5.dp),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "PLAY TRAILER")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "RATE MOVIE")
                    }
                }
                Column(modifier = Modifier.padding(20.dp,5.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(text = "Related Content")
                    LazyRow(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                        items(5){
                            ImageCard(modifier = Modifier.size(150.dp,225.dp))
                        }
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun PreviewContentDetailsScreen(){
    ContentDetailScreen {

    }
}