package com.example.anaonandroid.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Created by Julsapargi Nursam on 10/09/22
 * Mobile Engineer - Android
 */

@Immutable
data class AnaColors(
    val text: Color,
    val background: Color,
    val hint: Color,
    val green: Color,
    val red600: Color
)

val LocalAnaColors = staticCompositionLocalOf {
    AnaColors(
        text = Color.Unspecified,
        background = Color.Unspecified,
        hint = Color(0xFFADADAD),
        green = Color(0xFF45C37B),
        red600 = Color(0xFFE53935)
    )
}

val anaColors = AnaColors(
    text = Color.Black,
    background = Color(0xFFFFFFFF),
    hint = Color(0xFFADADAD),
    green = Color(0xFF45C37B),
    red600 = Color(0xFFE53935)
)
