package com.rodrigo.appdpa2.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rodrigo.appdpa2.presentation.auth.LoginScreen
import com.rodrigo.appdpa2.presentation.auth.RegisterScreen
import com.rodrigo.appdpa2.presentation.home.HomeScreen
import com.rodrigo.appdpa2.presentation.permissions.GalleryPermissionsScreen

@Composable
fun AppNavGraph(){
    val navController = rememberNavController()

    NavHost(
        navController=navController,
        startDestination = "register")
    {
        composable("register") { RegisterScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("home") {
            DrawerScaffold(navController) { //hace que herede el menu de navegacion
                HomeScreen()
            }
        }
        composable("permissions") {
            DrawerScaffold(navController) { //hace que herede el menu de navegacion
                GalleryPermissionsScreen()
            }
        }
    }

}
