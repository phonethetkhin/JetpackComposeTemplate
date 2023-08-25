package com.example.jetpackcomposetemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetemplate.ui.theme.JetpackComposeTemplateTheme
import com.example.jetpackcomposetemplate.ui.ui_resource.navigation.NavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTemplateTheme {
                MainComposable()
            }
        }
    }
}

@Composable
fun MainComposable() {
    val navController = rememberNavController()

    NavGraph(
        navController
    )
}