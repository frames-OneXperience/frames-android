package com.ox.frames.presentation.intro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IntroScreen(modifier: Modifier = Modifier){
    Scaffold { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            val pagerState = rememberPagerState(pageCount = {4})
            HorizontalPager(state = pagerState,modifier = Modifier.weight(1f)) {

            }
            Button( modifier = Modifier.fillMaxWidth().padding(20.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Continue")
            }
        }
    }
}

@Preview
@Composable
fun previewIntroScreen(){
    IntroScreen();
}