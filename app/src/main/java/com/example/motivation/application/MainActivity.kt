package com.example.motivation.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.motivation.R
import com.example.motivation.presentation.Screen
import com.example.motivation.presentation.screen.create_task.CreateScreen
import com.example.motivation.presentation.screen.home.HomeScreen
import com.example.motivation.presentation.theme.MotivationTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    val onNavigateClick = { route: String ->
        navController.navigate(route)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            MotivationTheme {
                Surface(color = MaterialTheme.colors.background) {

                    NavHost(navController = navController, startDestination = Screen.HomeScreen){
                        composable(Screen.HomeScreen){
                            HomeScreen(onNavigateClick)
                        }
                        composable(Screen.CreateScreen){
                            CreateScreen(onNavigateClick)
                        }
                    }
                }
            }
        }
    }

}
