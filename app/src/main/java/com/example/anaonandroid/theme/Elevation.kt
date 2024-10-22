package com.example.anaonandroid.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class AnaElevation(
    val default: Dp
)

val LocalAnaElevation = staticCompositionLocalOf {
    AnaElevation(
        default = Dp.Unspecified
    )
}

val anaElevation = AnaElevation(
    default = 8.dp
)