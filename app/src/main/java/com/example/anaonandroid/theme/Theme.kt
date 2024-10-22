package com.example.anaonandroid.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

/**
 * Created by Julsapargi Nursam on 10/09/22
 * Mobile Engineer - Android
 */

@Composable
fun AnaTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalAnaColors provides anaColors,
        LocalAnaTypography provides anaTypography,
        LocalAnaElevation provides anaElevation
    ) {
        MaterialTheme(
            content = content
        )
    }
}

object AnaTheme {
    val colors: AnaColors
        @Composable
        get() = LocalAnaColors.current

    val typography: AnaTypography
        @Composable
        get() = LocalAnaTypography.current

    val elevation: AnaElevation
        @Composable
        get() = LocalAnaElevation.current
}