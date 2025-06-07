package com.ox.frames.presentation.language

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ox.frames.common.widgets.LanguageCard

@Composable
fun ChooseLanguageScreen(
    languageScreenViewModel: ChooseLanguageScreenViewModel = viewModel(),
    ){
    val state = languageScreenViewModel.uiState.collectAsStateWithLifecycle()
    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Build Your Home Page",style = MaterialTheme.typography.titleMedium)
                Text(text = "Choose your favourite languages",style = MaterialTheme.typography.bodySmall)
                Spacer(modifier = Modifier.height(16.dp))

                LazyVerticalGrid(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    columns = GridCells.Fixed(2),
                ) {
                    items(state.value.languages){ item ->
                        LanguageCard(
                            language = item,
                            modifier = Modifier.height(120.dp), onItemClicked = { id ->
                                languageScreenViewModel.chooseLanguage(id);
                            })
                    }
                }
            }
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)) {
                Text(text = "Continue")
            }
        }
    }
}

//@Preview
//@Composable
//fun previewChooseLanguageScreen(){
//    ChooseLanguageScreen()
//}