package com.ox.frames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ox.frames.presentation.detail.ContentDetailScreen
import com.ox.frames.presentation.downloads.DownloadsScreen
import com.ox.frames.presentation.home.HomeScreen
import com.ox.frames.presentation.language.ChooseLanguageScreen
import com.ox.frames.presentation.main.MainScreen
import com.ox.frames.ui.theme.FramesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FramesTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Detail" ){
                    composable(route = "ChooseLanguage") {
                        ChooseLanguageScreen()
                    }
                    composable(route = "Home"){
                       MainScreen()
                    }
                    composable(route = "Detail"){
                       ContentDetailScreen(onHomeClicked = { navController.navigate("Home") })
                    }
                    composable(route = "Downloads"){
                        DownloadsScreen()
                    }
                }
            }
        }
    }
}