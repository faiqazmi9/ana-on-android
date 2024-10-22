package com.example.anaonandroid.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anaonandroid.theme.AnaTheme

/**
 * Created by Julsapargi Nursam on 09/10/22
 * Mobile Engineer - Android
 */

@Composable
fun AnaButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(32.dp),
    backgroundColor: Color = AnaTheme.colors.green,
    text: String,
    textColor: Color = Color.White,
    enable: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .size(48.dp),
        shape = shape,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        enabled = enable,
    ) {
        TextButton(
            text = text,
            textColor = textColor
        )
    }
}

@Composable
fun AnaOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = AnaTheme.colors.green,
    enable: Boolean = true,
    shape: Shape = RoundedCornerShape(32.dp),
    strokeColor: Color = AnaTheme.colors.green
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp),
        enabled = enable,
        shape = shape,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Unspecified
        ),
        border = ButtonDefaults.outlinedButtonBorder().copy(
            brush = SolidColor(strokeColor),
            width = 1.dp
        ),
    ) {
        TextButton(
            text = text,
            textColor = textColor
        )
    }
}

@Composable
private fun TextButton(
    text: String,
    textColor: Color
) {
    Text(
        text = text,
        style = AnaTheme.typography.button,
        fontSize = 16.sp,
        color = textColor
    )
}

@Preview
@Composable
private fun AnaButtonFillPreview() {
    AnaTheme {
        AnaButton(
            onClick = { },
            text = "Button",
            backgroundColor = AnaTheme.colors.green
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun AnaOutlineButtonFillPreview() {
    AnaTheme {
        AnaOutlinedButton(
            onClick = { },
            text = "Button",
            strokeColor = AnaTheme.colors.green
        )
    }
}