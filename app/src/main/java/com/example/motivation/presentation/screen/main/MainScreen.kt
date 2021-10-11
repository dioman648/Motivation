package com.example.motivation.presentation.screen.main

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.motivation.application.extension.capitalize
import com.example.motivation.presentation.Screen
import com.example.motivation.presentation.screen.tasks.TasksScreen
import com.example.motivation.presentation.screen.today.TodayScreen

@Composable
    fun MainScreen(mainNavController: NavHostController) {
        val navController = rememberNavController()

        val screens = listOf(
            Screen.TodayScreen,
            Screen.TasksScreen
        )

        Scaffold(bottomBar = {
            BottomNavigation {
                val currentBackStackEntry = navController.currentBackStackEntryAsState()
                val currentScreen = currentBackStackEntry.value?.destination
                screens.forEach { screen ->
                    BottomNavigationItem(
                        selected = currentScreen?.hierarchy?.any { it.route == screen.route } == true,
                        icon = { Icon(imageVector = Icons.Default.Star, contentDescription = null )},
                        label = {
                            Text(text = screen.route.capitalize())
                        },
                        onClick = {
                            navController.popBackStack()
                            navController.navigate(screen.route)
                        }
                    )
                }
            }
        }) {
            NavHost(navController = navController, startDestination = Screen.TodayScreen.route ){
                composable(Screen.TodayScreen.route){
                    TodayScreen(mainNavController)
                }
                composable(Screen.TasksScreen.route){
                    TasksScreen()
                }
            }
        }
    }

