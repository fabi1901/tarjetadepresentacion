package com.example.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFD0E8D0)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Fit
            )


            Text(
                text = "Jennifer Doe",
                fontSize = 34.sp,
                color = Color.Black
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 16.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(48.dp))


            ContactInfo(icon = Icons.Filled.Phone, contactText = "+11 (123) 123 456 789")
            ContactInfo(icon = Icons.Filled.Share, contactText = "@AndroidDev")
            ContactInfo(icon = Icons.Filled.Email, contactText = "jen.doe@android.com")
        }
    }
}

@Composable
fun ContactInfo(icon: androidx.compose.ui.graphics.vector.ImageVector, contactText: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {

        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))


        Text(
            text = contactText,
            fontSize = 18.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TarjetaDePresentacionTheme {
        BusinessCard()
    }
}


