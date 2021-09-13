package com.example.motivation.presentation.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun HomeScreen() {
    Content()
    Box(
        modifier =
        Modifier.fillMaxSize(1F),
        Alignment.BottomEnd
    ) {
        Column() {
            Fab()
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth(1F),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Balance()
        TaskList()
    }
}

@Composable
fun Fab() {
    FloatingActionButton(
        onClick = { /*do something*/ },
        elevation = FloatingActionButtonDefaults.elevation(8.dp),
        shape = RoundedCornerShape(100F),
        backgroundColor = Color.Red,
        modifier = Modifier.padding(8.dp),
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Localized description")
    }
}

@Composable
fun TaskList() {
    Spacer(modifier = Modifier.height(16.dp))
    LazyColumn() {
        items(count = 15) {
            Spacer(modifier = Modifier.height(16.dp))
            Task()
        }
    }
}

@Composable
fun Task() {
    var isCompleted by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth(0.9F),
        shape = RoundedCornerShape(24),
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .background(Color.LightGray),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.8F)
            ) {
                Text(
                    text = "Title",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth(1F),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Description",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth(1F),
                    textAlign = TextAlign.Center
                )
            }
            Checkbox(
                modifier = Modifier
                    .padding(8.dp),
                checked = isCompleted, onCheckedChange = {
                    isCompleted = !isCompleted
                })
        }
    }
}

@Composable
fun Balance() {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9F),
        shape = RoundedCornerShape(24)
    ) {
        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth(1F)
                    .background(Color.LightGray),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "100", fontSize = 24.sp)
                Text(text = " Р", fontSize = 24.sp)
            }
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .background(Color.LightGray)
            ) {
                LinearProgressIndicator(
                    progress = 0.4F,
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .height(16.dp)
                )
                Text(
                    text = "40%",
                    color = Color.White,
                    fontSize = 12.sp
                )
            }
        }

    }
}