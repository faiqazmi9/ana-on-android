package com.example.anaonandroid.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.anaonandroid.R

/**
 * Created by Julsapargi Nursam on 10/09/22
 * Mobile Engineer - Android
 */

val Ubuntu = FontFamily(
    Font(R.font.ubuntu_regular),
    Font(R.font.ubuntu_medium, FontWeight.Medium),
    Font(R.font.ubuntu_bold, FontWeight.Bold),
    Font(R.font.ubuntu_light_xml, FontWeight.Light)
)

@Immutable
data class AnaTypography(
    val headline: TextStyle,
    val subtitle: TextStyle,
    val body: TextStyle,
    val caption: TextStyle,
    val button: TextStyle,
    val label: TextStyle,
    val placeholder: TextStyle
)

val LocalAnaTypography = staticCompositionLocalOf {
    AnaTypography(
        headline = TextStyle.Default,
        subtitle = TextStyle.Default,
        body = TextStyle.Default,
        caption = TextStyle.Default,
        button = TextStyle.Default,
        label = TextStyle.Default,
        placeholder = TextStyle.Default
    )
}

val anaTypography = AnaTypography(
    headline = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    subtitle = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    body = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    caption = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    button = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    label = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    placeholder = TextStyle(
        fontFamily = Ubuntu,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)