package com.example.motivation.presentation

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home")
    object TodayScreen: Screen("today")
    object CreateScreen: Screen("create")
    object TasksScreen: Screen("tasks")
}