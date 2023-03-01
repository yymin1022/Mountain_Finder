package com.yong.mt_info

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yong.mt_info.ui.theme.MountainTheme

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MountainTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DetailUI()
                }
            }
        }
    }
}

@Composable
fun DetailUI() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mountain Finder") }
            )
        }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            DetailImageView()
            DetailBasicTextView()
            DetailInfoTextView()
        }
    }
}

@Composable
fun DetailBasicTextView() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("This is Title")
        Text("This is Height")
        Text("This is Management Facility")
        Text("This is Location")
    }
}

@Composable
fun DetailInfoTextView() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("This is Detail Info of Mountain")
    }
}

@Composable
fun DetailImageView() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("This is Image")
    }
}