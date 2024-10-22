package com.example.anaonandroid.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.toSize
import com.example.anaonandroid.R
import com.example.anaonandroid.theme.AnaTheme

/**
 * Created by Julsapargi Nursam on 09/10/22
 * Mobile Engineer - Android
 */

@Composable
fun AnaTextFieldDropDown(
    modifier: Modifier = Modifier,
    items: List<String>,
    label: String,
    placeholder: String,
    onSelected: (Int) -> Unit
) {
    var value by remember {
        mutableStateOf("")
    }
    var expanded by remember { mutableStateOf(false) }
    val mTextFieldSize = remember { mutableStateOf(Size.Zero) }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.TopEnd)
            .onGloballyPositioned {
                mTextFieldSize.value = it.size.toSize()
            }
    ) {
        AnaTextField(
            label = label,
            placeholder = placeholder,
            value = value,
            onValueChange = {
                value = it
            },
            trailingIcon = if (!expanded) {
                R.drawable.ic_baseline_arrow_drop_down_24
            } else {
                R.drawable.ic_baseline_arrow_drop_up_24
            },
            trailingIconOnClick = {
                expanded = true
            },
            enable = false
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            },
            modifier = Modifier
                .requiredWidth(
                    width = with(LocalDensity.current) {
                        mTextFieldSize.value.width.toDp()
                    }
                )
        ) {
            items.forEachIndexed { index, item ->
                DropdownMenuItem(
                    onClick = {
                        onSelected.invoke(index)
                        expanded = false
                        value = items[index]
                    }
                ) {
                    Text(
                        text = item,
                        style = AnaTheme.typography.caption
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun AnaTextFieldDropDownPreview() {
    AnaTheme {
        AnaTextFieldDropDown(
            items = listOf("A", "B", "C"),
            label = "Urutan",
            placeholder = "Angka",
            onSelected = { }
        )
    }
}