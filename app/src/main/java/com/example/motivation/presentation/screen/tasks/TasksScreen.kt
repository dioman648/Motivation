package com.example.motivation.presentation.screen.tasks

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TasksScreen() {
    Box(
        modifier = Modifier.fillMaxSize(1F),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "Tasks Screen")
    }
}