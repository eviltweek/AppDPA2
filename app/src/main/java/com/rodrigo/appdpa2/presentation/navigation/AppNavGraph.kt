package com.rodrigo.appdpa2.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rodrigo.appdpa2.presentation.auth.LoginScreen
import com.rodrigo.appdpa2.presentation.auth.RegisterScreen
import com.rodrigo.appdpa2.presentation.home.HomeScreen

@Composable
fun AppNavGraph(){
    val navController = rememberNavController()

    NavHost(
        navController=navController,
        startDestination = "register")
    {
        composable("register") { RegisterScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("home") { HomeScreen() }
    }

}
