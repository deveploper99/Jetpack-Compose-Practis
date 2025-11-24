package com.example.jetpackbasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

@Preview(showSystemUi = true)
@Composable
fun splashScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),

        ){
            Image(
                painter = painterResource(R.drawable.imagesplas),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
            )
        }


        Spacer(modifier = Modifier.size(40.dp))

        Text(text = "CarMobile",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontFamily = FontFamily.Monospace

            )

        Text(text = "Drive & Save Many",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(57, 59, 64),
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 15.dp)

        )



        Spacer(modifier = Modifier.size(80.dp))

        Box(
            modifier = Modifier
                .size(70.dp)
                .clip(RoundedCornerShape(50.dp))
                .background(color = Color(84, 107, 119)),
            contentAlignment = Alignment.Center



        ) {
            Icon(
                painter = painterResource(R.drawable.right_arrow),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(50.dp)

            )
        }




    }


}