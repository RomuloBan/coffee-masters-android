package com.romuloban.coffeemasters

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.romuloban.coffeemasters.ui.theme.Alternative1
import com.romuloban.coffeemasters.ui.theme.Alternative2

@Preview(showBackground = true, widthDp = 400)
@Composable
fun Offer() {
    Column(
        horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "My Title",
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(Alternative2)
                .padding(16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Description",
            style = MaterialTheme.typography.h6,
            modifier = Modifier
                .background(Alternative2)
                .padding(16.dp)
        )
    }
}