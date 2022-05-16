package com.insideapp.coreui.navigation

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.UserList.route) {
        composable(route = Screen.UserList.route) { UserList(navController) }
        composable(route = Screen.UserDetails.route) { UserDetails(navController) }
        /*...*/
    }
}

@Composable
fun UserList(navController: NavController) {
    Button(onClick = { navController.navigate(Screen.UserDetails.route) }) {
        Text(text = "Navigate to user details")
    }
}

@Composable
fun UserDetails(navController: NavController) {
    Button(onClick = { navController.navigate(Screen.UserDetails.route) }) {
        Text(text = "Navigate to user list")
    }
}