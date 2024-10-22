package com.example.anaonandroid.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.material3.TextFieldDefaults.BorderBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anaonandroid.R
import com.example.anaonandroid.theme.AnaTheme

/**
 * Created by Julsapargi Nursam on 10/09/22
 * Mobile Engineer - Android
 */

@Composable
fun AnaTextField(
    modifier: Modifier = Modifier,
    label: String,
    placeholder: String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text,
    errorMessage: String? = null,
    @DrawableRes trailingIcon: Int? = null,
    trailingIconOnClick: (() -> Unit)? = null,
    singleLine: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    enable: Boolean = true
) {

    val isError = remember {
        mutableStateOf(false)
    }

    // Get Focussed
    val focus = remember { mutableStateOf(false) }

    // Set isError
    isError.value = errorMessage != null

    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(3.dp)
    ) {
        Text(
            text = label,
            style = AnaTheme.typography.label,
            color = if (focus.value && !isError.value) {
                AnaTheme.colors.green
            } else {
                colors(
                    errorMessage = errorMessage
                )
            }
        )

        BasicTextField(
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged {
                    if (focus.value != it.isFocused) {
                        focus.value = it.isFocused
                    }
                },
            value = value,
            onValueChange = onValueChange,
            textStyle = AnaTheme.typography.placeholder.copy(
                color = AnaTheme.colors.text
            ),
            cursorBrush = SolidColor(AnaTheme.colors.green),
            keyboardOptions = keyboardOptions.copy(
                keyboardType = keyboardType
            ),
            enabled = enable,
            singleLine = singleLine,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            keyboardActions = keyboardActions,
            decorationBox = { innerTextField ->
                TextFieldDefaults.OutlinedTextFieldDecorationBox(
                    value = value,
                    innerTextField = innerTextField,
                    enabled = enable,
                    singleLine = singleLine,
                    visualTransformation = visualTransformation,
                    interactionSource = interactionSource,
                    placeholder = {
                        Text(
                            text = placeholder,
                            style = AnaTheme.typography.placeholder,
                            color = AnaTheme.colors.hint
                        )
                    },
                    trailingIcon = if (trailingIcon != null) {
                        {
                            IconButton(
                                onClick = {
                                    trailingIconOnClick?.invoke()
                                },
                            ) {
                                Icon(
                                    painter = painterResource(id = trailingIcon),
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }
                        }
                    } else {
                        null
                    },
                    border = {
                        BorderBox(
                            enabled = enable,
                            isError = isError.value,
                            interactionSource = interactionSource,
                            colors = TextFieldDefaults.textFieldColors(
                                disabledIndicatorColor = colors(errorMessage = errorMessage),
                                errorIndicatorColor = colors(errorMessage = errorMessage),
                                focusedIndicatorColor = AnaTheme.colors.green
                            ),
                            shape = RoundedCornerShape(24.dp),
                            focusedBorderThickness = 1.dp,
                            unfocusedBorderThickness = 1.dp
                        )
                    },
                )
            }
        )

        if (errorMessage != null) {
            Text(
                modifier = Modifier
                    .padding(
                        start = 16.dp
                    ),
                text = errorMessage,
                style = AnaTheme.typography.caption,
                fontSize = 10.sp,
                color = AnaTheme.colors.red600
            )
        }
    }
}

@Composable
private fun colors(errorMessage: String?) = if (errorMessage != null) {
    AnaTheme.colors.red600
} else {
    AnaTheme.colors.hint
}

@Preview(
    name = "AnaTextFieldDefault",
    showBackground = true,
)
@Composable
private fun PreviewAnaTextField() {
    AnaTheme {
        AnaTextField(
            label = "Label",
            placeholder = "Placeholder",
            value = "",
            onValueChange = {

            }
        )
    }
}

@Preview(
    name = "AnaTextFieldDefaultTrailingIcon",
    showBackground = true,
)
@Composable
private fun PreviewAnaTextFieldTrailingIcon() {
    AnaTheme {
        AnaTextField(
            label = "Label",
            placeholder = "Placeholder",
            value = "",
            onValueChange = {

            },
            trailingIcon = R.drawable.ic_baseline_calendar_today_24
        )
    }
}

@Preview(
    name = "AnaTextFieldDefaultError",
    showBackground = true,
)
@Composable
private fun PreviewAnaTextFieldError() {
    AnaTheme {
        AnaTextField(
            label = "Label",
            placeholder = "Placeholder",
            value = "",
            onValueChange = {

            },
            errorMessage = "Value Empty"
        )
    }
}