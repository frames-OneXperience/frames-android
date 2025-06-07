package com.ox.frames.presentation.downloads

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.PlayCircleOutline
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil3.compose.rememberAsyncImagePainter
import com.ox.frames.domain.entities.Content

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DownloadsScreen(
    modifier: Modifier = Modifier,
    onHomeButtonClicked : ()-> Unit = {},
    viewModel: DownloadsScreenViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
){
    val uiState = viewModel.uiState.collectAsStateWithLifecycle()
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Downloads") })
        }
    ) { innerPadding ->
        Box(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()){

            // Display progress indicator if the contents is loading
            if(uiState.value.isLoading){
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }

            // Display downloaded list if the contents is not empty
            if(uiState.value.content.isNotEmpty()){
                DownloadsList(
                    modifier = Modifier.padding(8.dp),
                    items = uiState.value.content)
            }else{
                if(uiState.value.isLoading.not()) {
                    DownloadEmptyList(
                        modifier = Modifier.align(Alignment.Center),
                        onHomeButtonClicked = onHomeButtonClicked
                    )
                }
            }
        }
    }
}



@Composable
fun DownloadEmptyList(
    modifier: Modifier = Modifier,
    onHomeButtonClicked : ()-> Unit = {}
){
    Column(
        modifier = modifier.padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(imageVector = Icons.Default.Face, contentDescription = "downloads-icon")
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "No Downloads Available",
            style = MaterialTheme.typography.titleMedium.copy(textAlign = TextAlign.Center)
        )
        Text(
            text = "Explore and download your favourite movies and shows to watch on the go",
            style = MaterialTheme.typography.bodySmall.copy(textAlign = TextAlign.Center)
        )
        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { onHomeButtonClicked() }) {
            Text(text = "Go to Home")
        }
    }
}

@Composable
fun DownloadsList(
    modifier: Modifier = Modifier,
    items:List<Content>){
    LazyColumn(modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)) {
        items(items){
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Box(modifier = Modifier
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(Color.LightGray)
                    .size(150.dp, 84.dp),
                ){
                    Image(painter = rememberAsyncImagePainter(model = it.imageUrl),
                        contentScale = ContentScale.Crop,
                        contentDescription = "")
                    IconButton(
                        modifier = Modifier.align(Alignment.BottomStart),
                        onClick = { /*TODO*/ }) {
                        Icon(
                            modifier = Modifier.size(40.dp),
                            imageVector = Icons.Rounded.PlayCircleOutline,
                            tint = Color.White,
                            contentDescription = "")
                    }
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = it.title)
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                        Icon(modifier = Modifier.size(16.dp),
                            imageVector = Icons.Filled.Schedule,
                            contentDescription = "",
                            tint = Color.LightGray)
                        Text(text = it.duration, style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.LightGray
                        ))
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = it.size,style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.LightGray
                        ))
                    }
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "")
                }
            }
        }
    }
}



@Preview
@Composable
fun PreviewDownloadsScreen(){
    DownloadsScreen()
}

