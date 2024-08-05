package com.example.laboratorio4


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio4Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Contenedor("Sebastian Garcia","Ana Laura Tschen")
                }
            }
        }
    }
}



@Composable
fun Contenedor(name1: String, name2: String){
    val imagen = painterResource(R.drawable._2logo_universidad_del_valle_de_guatemala)
    Box(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()
        .border(2.dp, Color.Green, RoundedCornerShape(8.dp)))
    {
        Image(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .alpha(0.2f),
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.None

            )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 255.dp, start = 16.dp, end = 16.dp)
        ) {
            Text(
                text = "Universidad del Valle ",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,

            )
            Text(
                text = "de Guatemala",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,

            )
            Spacer(modifier = Modifier.height(28.dp))
            Text(
                text = "Programacion de plataformas",
                fontSize = 23.sp,


            )
            Text(
                text = "Mobiles, Sección 30",
                fontSize = 23.sp,


            )
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Text(
                    text = "Integrantes",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                )
                Column (horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier

                    .padding(top = 1.dp, start = 32.dp, end = 6.dp)){
                    Text(text = name1)
                    Text(text = name2)

                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row{
                Text(text ="Catedratico",
                fontSize = 20.sp,
                fontWeight= FontWeight.Bold,
                modifier = Modifier.padding(end = 32.dp)

                )

                Text(text = "Juan Carlos Durini")

            }
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Sebastian Garcia Bustamante",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,

            )
            Text(
                text = "22291",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio4Theme {
        Contenedor("Sebastian Garcia","Ana Laura Tschen")
    }
}