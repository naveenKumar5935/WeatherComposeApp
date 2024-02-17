package com.plcoding.weatherapp.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.weatherapp.R

@Preview
@Composable
fun WeeklyWeatherCard() {

    Column {
        Text(text = "Today",
            fontWeight = FontWeight.Light,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(15.dp,10.dp,0.dp,0.dp))

        LazyRow(modifier = Modifier.padding(15.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,content = {
            item {
                abc("00:00",R.drawable.ic_sunny,"20.2 C",Color.Yellow)
                abc("01:00",R.drawable.ic_sunny,"19.9 C",Color.Yellow)
                abc("02:00",R.drawable.ic_cloudy,"19.4 C",Color.White)
                abc("03:00",R.drawable.ic_cloudy,"20.2 C",Color.White)
                abc("04:00",R.drawable.ic_cloudy,"19.1 C",Color.White)
                abc("05:00",R.drawable.ic_sunny,"19.9 C",Color.Yellow)
                abc("06:00",R.drawable.ic_cloudy,"19.4 C",Color.White)
                abc("07:00",R.drawable.ic_cloudy,"20.2 C",Color.White)

            }
        })


    }

}

@Composable
fun abc(time:String,icon:Int,temperature:String, tint:Color) {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        Text(text = time, color = Color.White, fontWeight = FontWeight.Light)
        Icon(painter = painterResource(id = icon),
            tint = tint,
            contentDescription = "",
            modifier = Modifier.size(30.dp)
                .offset(y=4.dp))
        Text(text = temperature, color = Color.White, fontWeight = FontWeight.Light,
            modifier = Modifier.offset(y=4.dp))
    }
}