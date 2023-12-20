package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DonePage()
                }
            }
        }
    }
}

@Composable
fun DonePage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.weight(1F)
        ) {
            ComposeCard(
                title = stringResource(id = R.string.first_title),
                description = stringResource(id = R.string.first_description),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1F),
                textColor = Color.Black
            )
            ComposeCard(
                title = stringResource(id = R.string.second_title),
                description = stringResource(id = R.string.second_description),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1F),
                textColor = Color.Black
            )
        }
        Row(
            modifier = Modifier.weight(1F)
        ) {
            ComposeCard(
                title = stringResource(id = R.string.third_title),
                description = stringResource(id = R.string.third_description),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1F),
                textColor = Color.Black
            )
            ComposeCard(
                title = stringResource(id = R.string.fourth_title),
                description = stringResource(id = R.string.fourth_description),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1F),
                textColor = Color.Black
            )
        }
    }
}

@Composable
fun ComposeCard(
    title: String,
    description: String,
    color: Color,
    modifier: Modifier = Modifier,
    textColor: Color
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center,
            color = textColor
        )
        Text(
            text = description,
            textAlign = TextAlign.Center,
            color = textColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        DonePage(modifier = Modifier
            .fillMaxWidth())
    }
}