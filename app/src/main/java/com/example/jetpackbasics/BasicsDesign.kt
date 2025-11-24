package com.example.jetpackbasics

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)

@Composable
fun ClickableTextExample() {
    //main Container
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(159, 159, 159, 255))

    ) {


        //text for rassek Hassan
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .height(100.dp)
                .background(color = Color(0, 151, 183)),
               verticalArrangement = Arrangement.Center

        ){
            Row (
                modifier = Modifier,
            ) {
               Image(
                   painter = painterResource(R.drawable.menu),
                   contentDescription = null,
                   contentScale = ContentScale.Crop,
                   modifier = Modifier
                       .size(40.dp)
                       .padding(top = 2.dp)
               )

            }
        }

        Spacer(modifier = Modifier.size(20.dp))


        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(Color.Cyan)
        ){

             Box(
                 modifier = Modifier
                     .weight(1f)
                     .fillMaxSize()
                     .background(color=Color.Red)

             ) {  }

            Spacer(modifier = Modifier.size(20.dp))


            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color=Color.Blue)

            ) {  }


            Spacer(modifier = Modifier.size(20.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color=Color.Black)

            ) {

                Text(text = "Rasse Hassan Naim Khane ",
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(start = 10.dp)
                )
            }
        }



    }
}









