 package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ArticleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArticleJetpack(
                        title = stringResource(R.string.title),
                        paragraphOne = stringResource(R.string.paragraph_one),
                        paragraphTwo = stringResource(R.string.paragraph_two),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleJetpack(title: String, paragraphOne: String, paragraphTwo: String,modifier: Modifier = Modifier) {
    Column(modifier) {
        val image = painterResource(R.drawable.bg_compose_background)

        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = paragraphOne,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
        Text(
            text = paragraphTwo,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyBirthdayTheme {
        ArticleJetpack(
            title = stringResource(R.string.title),
            paragraphOne = stringResource(R.string.paragraph_one),
            paragraphTwo = stringResource(R.string.paragraph_two)
        )
    }
}