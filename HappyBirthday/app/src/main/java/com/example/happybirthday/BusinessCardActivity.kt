package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class BusinessCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background){
                    ContactCard()
                }
            }
        }
    }
}

@Composable
fun ContactCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_android),
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Jennifer Doe",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        ContactItem(Icons.Filled.Phone, "+11 (123) 444 555 666")
        ContactItem(Icons.Filled.Share, "@AndroidDev")
        ContactItem(Icons.Filled.Email, "jen.doe@android.com")
    }
}

@Composable
fun ContactItem(icon: ImageVector, text: String) {
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
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            fontSize = 16.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    HappyBirthdayTheme {
        ContactCard()
    }
}