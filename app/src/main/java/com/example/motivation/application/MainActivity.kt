package com.example.motivation.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.motivation.presentation.Screen
import com.example.motivation.presentation.screen.create_task.CreateScreen
import com.example.motivation.presentation.screen.main.MainScreen
import com.example.motivation.presentation.theme.MotivationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotivationTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
                        composable(Screen.HomeScreen.route){
                            MainScreen(navController)
                        }
                        composable(Screen.CreateScreen.route){
                            CreateScreen()
                        }
                    }
                }
            }
        }
    }

}
