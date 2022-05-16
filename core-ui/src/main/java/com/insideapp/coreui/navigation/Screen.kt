package com.insideapp.coreui.navigation

sealed class Screen(val route: String) {
    object UserList : Screen("user_list")
    object UserDetails : Screen("user_details")
}
