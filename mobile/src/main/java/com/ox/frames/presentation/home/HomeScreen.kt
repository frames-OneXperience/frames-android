package com.ox.frames.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.frames.domain.FakeCatalogData
import com.frames.domain.entity.Section
import com.ox.frames.common.widgets.HeroBanner
import com.ox.frames.common.widgets.ListRowView
import com.ox.frames.presentation.home.components.ApplicationTopBar
import com.ox.frames.presentation.home.components.BottomNavigation
import com.ox.frames.presentation.home.components.NavigationDrawer

@Composable
fun HomeScreen(
    onDetailClicked : () -> Unit = {}
){
    NavigationDrawer {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black),  bottomBar = { BottomNavigation()}){ innerPadding ->



            LazyColumn(modifier = Modifier.padding(innerPadding)) {
                item {
                    HeroBanner(modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp))
                }

                items(FakeCatalogData.getCatalog().sections){
                    Box(modifier = Modifier.padding(16.dp,0.dp)) {
                        ListRowView(section = it)
                    }
                }
            }





//                ListRowView(modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 16.dp, bottom = 16.dp))
//                ListRowView(modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 16.dp, bottom = 16.dp))
//                ListRowView(modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 16.dp, bottom = 16.dp))
//                ListRowView(modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 16.dp, bottom = 16.dp))
            }

    }
}