package com.rodrigo.appdpa2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.rodrigo.appdpa2.presentation.auth.LoginScreen
import com.rodrigo.appdpa2.presentation.auth.RegisterScreen
import com.rodrigo.appdpa2.presentation.navigation.AppNavGraph
import com.rodrigo.appdpa2.ui.theme.AppDPA2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppDPA2Theme {
                AppNavGraph()
            }
        }
    }
}