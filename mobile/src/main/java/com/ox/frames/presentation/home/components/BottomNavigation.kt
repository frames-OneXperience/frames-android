package com.ox.frames.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun BottomNavigation(){
    BottomAppBar{
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            BottomNavigationItem(icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "") }, label = "Home",)
            BottomNavigationItem(icon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") }, label = "Search",)
            BottomNavigationItem(icon = { Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "") }, label = "Downloads",)
            BottomNavigationItem(icon = { Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "") }, label = "Songs",)
            BottomNavigationItem(icon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = "") }, label = "Profile",)
        }
    }
}

@Composable
fun BottomNavigationItem(
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit = {},
    label:String = ""
){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        IconButton(onClick = { /*TODO*/ }) {
            icon()
        }
        Text(text = label, style = MaterialTheme.typography.labelSmall)
    }
}