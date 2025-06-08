package com.ox.frames.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.frames.designsystem.carousel.Carousel
import com.frames.domain.FakeCatalogData
import com.ox.frames.common.widgets.ListRowView
import com.ox.frames.presentation.home.components.BottomNavigation
import com.ox.frames.presentation.home.components.NavigationDrawer

@Composable
fun HomeScreen() {
    NavigationDrawer {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = { BottomNavigation() }) { innerPadding ->
            LazyColumn(modifier = Modifier.padding(innerPadding)) {
                // Render hero banner
                item {
                    Carousel(modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f),
                        contents = FakeCatalogData.getBannerData())
                }

                // Render rails
                items(FakeCatalogData.getCatalog().sections) {
                    Box(modifier = Modifier.padding(16.dp, 0.dp)) {
                        ListRowView(section = it)
                    }
                }
            }
        }
    }
}