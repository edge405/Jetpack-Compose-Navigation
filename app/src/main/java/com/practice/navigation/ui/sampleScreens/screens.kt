package com.practice.navigation.ui.sampleScreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun screenA(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Screen A",
            fontSize = 64.sp
        )
        Spacer(
            modifier = Modifier.height(65.dp)
        )
        Button(onClick = {
            navController.navigate("screenB")
        }) {
            Text(
                text = "Go to screen B",
                fontSize = 40.sp
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun screenAPreview() {
    val navController = rememberNavController()
    screenA(navController)
}

@Composable
fun screenB(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Screen B",
            fontSize = 64.sp
        )
        Spacer(
            modifier = Modifier.height(65.dp)
        )
        Button(onClick = {
            navController.navigate("screenC")
        }) {
            Text(
                text = "Go to screen C",
                fontSize = 40.sp
            )
        }
    }
}

@Composable
fun screenC(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Screen C",
            fontSize = 64.sp
        )
        Spacer(
            modifier = Modifier.height(65.dp)
        )
        Button(onClick = {
            navController.navigate("screenA"){
                popUpTo("screenA"){
                    inclusive = true
                }
            }
        }) {
            Text(
                text = "Go to screen A",
                fontSize = 40.sp
            )
        }
    }
}