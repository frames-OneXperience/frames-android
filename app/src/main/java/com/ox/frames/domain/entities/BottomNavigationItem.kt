package com.ox.frames.domain.entities

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val route:String,
    val icon: ImageVector,
    val label: String,
    val selected: Boolean = false
)
