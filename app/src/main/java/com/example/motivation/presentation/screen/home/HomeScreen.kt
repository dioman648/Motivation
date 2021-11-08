package com.example.motivation.presentation.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onNavigateClick: (route: String) -> Unit) {
    Column {
        Text(text = "200",
        modifier = Modifier
            .fillMaxWidth(1F),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(1000) {
                TaskItem()
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}