package com.example.motivation.presentation.screen.create_task

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.motivation.presentation.Screen

@Composable
fun CreateScreen(onNavigateClick: (String) -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(1F),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "Create Screen",
            modifier = Modifier.clickable {
                onNavigateClick(Screen.HomeScreen)
            })
    }
}