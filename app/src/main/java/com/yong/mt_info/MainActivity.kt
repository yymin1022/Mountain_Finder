package com.yong.mt_info

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yong.mt_info.ui.theme.MountainTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MountainTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainUI("Android")
                }
            }
        }
    }
}

@Composable
fun MainUI(name: String) {
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
            Text(text = "Hello $name!")
        }
    }
}