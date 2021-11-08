package com.example.motivation.presentation.screen.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.motivation.R

@Preview
@Composable
fun TaskItem() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth(0.9F)
    ) {
        val (checkBox, card) = createRefs()

        TaskCard(
            Modifier
                .fillMaxWidth(0.9F)
                .constrainAs(card) {
                    top.linkTo(checkBox.top)
                    start.linkTo(checkBox.start)
                    end.linkTo(parent.end)
                }
                .padding(top = 25.dp)
        )
        //TODO перенести вправо
        CircleCheckBox(modifier = Modifier
            .padding(start = 16.dp)
            .constrainAs(checkBox) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
            .border(border = BorderStroke(4.dp, Color.Black), CircleShape)
        )

    }

}

@Composable
fun CircleCheckBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .size(60.dp)
            .clip(CircleShape)
            .background(color = colorResource(id = R.color.yellow)),
        contentAlignment = Alignment.Center
    ){
        Icon(
            modifier = Modifier
                .size(32.dp)
            ,
            painter = painterResource(id = R.drawable.ic_add),
            contentDescription = null,
        )
    }
}

@Composable
fun TaskCard(modifier: Modifier) {
    Card(
        modifier = modifier,
        backgroundColor = colorResource(id = R.color.primary),
        shape = RoundedCornerShape(percent = 24)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Price",
                textAlign = TextAlign.Center
            )
            Text(text = "Title",
                textAlign = TextAlign.Center

            )
            Text(text = "Schedule",
                textAlign = TextAlign.Center
            )
        }
    }
}

