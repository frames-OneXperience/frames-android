package com.frames.designsystem

sealed class CardType(val aspectRatio: Float, val width: Int) {
    data object Landscape : CardType(aspectRatio = 1.7f, width = 190)
    data object Square : CardType(aspectRatio = 1f, width = 100)
    data object Portrait : CardType(aspectRatio = 0.7f, width = 120)
}