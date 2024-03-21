package com.example.composearticle

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopImage(title = getString(R.string.title), firstParagraph = getString(R.string.first_paragraph), secondParagraph = getString(R.string.second_paragraph))
                }
            }
        }
    }
}

@Composable
fun TopImage(modifier: Modifier = Modifier, title: String, firstParagraph: String, secondParagraph: String) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(modifier) {
        Image(
            painter = image,
            contentDescription = "background",
            modifier = Modifier
                .fillMaxWidth()
        )

        Text(
            text = title,
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = firstParagraph,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = secondParagraph,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}


