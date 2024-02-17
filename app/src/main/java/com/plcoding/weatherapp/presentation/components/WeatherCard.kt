package com.plcoding.weatherapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.weatherapp.presentation.ui.theme.DarkBlue
import com.plcoding.weatherapp.R

@Preview(showSystemUi = true)
@Composable
fun WeatherCard() {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(10.dp),
        backgroundColor = DarkBlue
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = "Today 15:00",
                color = Color.White,
                textAlign = TextAlign.Right,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                fontWeight = FontWeight.Light
            )

            Image(painter = painterResource(id = R.drawable.ic_cloudy),
                contentDescription = "",
                alignment = Alignment.Center,
                modifier = Modifier.size(200.dp)
            )

            Text(text = "31.7 C",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "OverCast",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
            Spacer(modifier = Modifier.height(10.dp))

            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp)) {

                Humidity(R.drawable.ic_pressure, "1014hpa")
                Humidity(R.drawable.ic_drop, "30%")
                Humidity(R.drawable.ic_wind,"14km/h")
            }

        }
    }
}

@Composable
fun Humidity(icon:Int, text:String) {
    Row {
        Icon(painter = painterResource(id = icon),
            tint = Color.White,
            contentDescription = "",
            modifier = Modifier.size(30.dp))
        Text(text = text, modifier = Modifier.offset(x=4.dp),
            color = Color.White,
            fontWeight = FontWeight.Light)
    }
}