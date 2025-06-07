package com.ox.frames.presentation.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowCircleDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ox.frames.domain.entities.BottomNavigationItem
import com.ox.frames.presentation.downloads.DownloadsScreen
import com.ox.frames.presentation.home.HomeScreen
import com.ox.frames.presentation.search.SearchScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(modifier: Modifier = Modifier){
    val navController = rememberNavController()
    Scaffold(bottomBar = { MainBottomNavigation(navController)}) {
        Box(modifier = modifier.fillMaxSize()){

            NavHost(navController = navController, startDestination = "Home" ){
                composable(route = "Home") {
                    HomeScreen()
                }
                composable(route = "Search"){
                    SearchScreen()
                }
                composable(route = "Downloads"){
                    DownloadsScreen()
                }
            }
        }
    }
}

@Composable
fun MainBottomNavigation(navController: NavController){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val items = listOf(
        BottomNavigationItem(label = "Home", icon = Icons.Default.Home, route = "Home"),
        BottomNavigationItem(label = "Search",icon = Icons.Default.Search, route = "Search"),
        BottomNavigationItem(label = "Downloads",icon = Icons.Default.ArrowCircleDown, route = "Downloads"),
        BottomNavigationItem(label = "Latest", icon = Icons.Default.PlayCircleOutline, route = "Latest"),
        BottomNavigationItem(label = "Profile", icon = Icons.Filled.AccountCircle, route = "Profile")
    )
    BottomAppBar {
        var selectedIndex by rememberSaveable {
            mutableStateOf(0)
        }
        Row( modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            items.forEachIndexed { index,item ->
                MainBottomNavigationItem(
                    icon = item.icon,
                    label = item.label,
                    selected = currentRoute == item.route,
                    onClick = {
                        selectedIndex = index
                        navController.navigate(item.route)
                    }
                )
            }
        }
    }
}

@Composable
fun MainBottomNavigationItem(
    modifier: Modifier = Modifier,
    icon:ImageVector,
    label:String = "",
    selected : Boolean = false,
    onClick : () -> Unit = {}
){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        IconButton(onClick = { onClick() }) {
            Icon(imageVector = icon, contentDescription = label,
                tint = if(selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onBackground)
        }
        Text(text = label, style = MaterialTheme.typography.labelSmall.copy(
            color = if(selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onBackground
        ))
    }
}