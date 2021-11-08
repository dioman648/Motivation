package com.example.motivation.presentation.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.motivation.R
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TaskItem() {
        Box(modifier = Modifier
            .fillMaxWidth(1F),
            contentAlignment = Alignment.Center,
        ) {
            CardView()
        }
    }

    @Composable
    fun CardView(){
        Card(
            modifier = Modifier
                .fillMaxWidth(0.9F)
                .background(colorResource(id = R.color.light_grey)),
            shape = RoundedCornerShape(24),
            elevation = 4.dp,
        ) {
            Row {
                Checkbox(
                    modifier = Modifier
                        .padding(8.dp),
                    checked = true,
                    onCheckedChange = {  },
                    enabled = true
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth(1F)
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
                        fontSize = 16.sp,
                        modifier = Modifier
                            .fillMaxWidth(1F),
                        textAlign = TextAlign.Center
                    )
                }
            }
    }
}