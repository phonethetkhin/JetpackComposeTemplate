package com.example.jetpackcomposetemplate.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.jetpackcomposetemplate.ui.ui_resource.theme.Blue
import ir.kaaveh.sdpcompose.ssp


//UIs
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
) {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Blue),
                title = {
                    Text(
                        "Home",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.ssp,
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {

                }
            )
        }
    ) {
        HomeScreenContent(navController, it.calculateTopPadding().value)

    }

}

@Composable
fun HomeScreenContent(navController: NavController, topMargin: Float) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            "Hello World",
            fontSize = 20.ssp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }

}


