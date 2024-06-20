package com.practice.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.practice.navigation.ui.sampleScreens.screenA
import com.practice.navigation.ui.sampleScreens.screenB
import com.practice.navigation.ui.sampleScreens.screenC

@Composable
fun navigation() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = "screenA"
    ){
        composable(
            route = "screenA"
        ){
            screenA(navController = navController)
        }
        composable(
            route = "screenB"
        ){
            screenB(navController = navController)
        }
        composable(
            route = "screenC"
        ){
            screenC(navController = navController)
        }
    }
}