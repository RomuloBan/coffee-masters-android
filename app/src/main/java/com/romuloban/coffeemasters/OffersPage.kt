package com.romuloban.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.romuloban.coffeemasters.ui.theme.Alternative1
import com.romuloban.coffeemasters.ui.theme.Alternative2

@Preview(showBackground = true, widthDp = 400)
@Composable
private fun Offer_Preview() {
    Offer("My Title 1", "This the description")
}

@Composable
fun Offer(title: String, description: String) {
    Image(painter = painterResource(R.drawable.background_pattern),
        contentDescription = "Background pattern",
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
    )
    Column(
        horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = title,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(Alternative2)
                .padding(16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = description,
            style = MaterialTheme.typography.h6,
            modifier = Modifier
                .background(Alternative2)
                .padding(16.dp)
        )
    }
}