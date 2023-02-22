package com.yong.mt_info

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yong.mt_info.ui.theme.MountainTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MountainTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ListUI(this)
                }
            }
        }
    }
}

@Composable
fun ListUI(ctx: Context) {
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
            Button(
                modifier = Modifier.fillMaxWidth()
                    .height(60.dp)
                    .padding(10.dp),
                onClick = {
                    ctx.startActivity(Intent(ctx, DetailActivity::class.java))
                }
            ) {
                Text("Go to Detail Activity")
            }
        }
    }
}