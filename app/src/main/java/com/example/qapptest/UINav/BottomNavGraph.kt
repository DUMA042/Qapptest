package com.example.qapptest.UINav

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument


@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarComponents.Home.route
    ) {
        composable(route = BottomBarComponents.Home.route) {
            //HomeScreensetting(navController)
        }
        composable(route = BottomBarComponents.YourQueue.route + "?userQueue={userQueue}",
            arguments = listOf(navArgument("userQueue") {
                type = NavType.StringType
                defaultValue = "me"
                nullable = true
            })
        ) { backStackEntry ->
           // SelectionScreensetting(navController, backStackEntry.arguments?.getString("userQueue"))
        }
        composable(route = BottomBarComponents.Records.route) {
            //RecordScreenSetting()
        }
        /**
        composable(route = ButtonTransitionScreen.Registration.rounte){
            LoginSetting()
        }**/
        /**
        composable(route = ButtonTransitionScreen.Setting.rounte){
            setupsettinscreen(navController)
        }**/
        /**
        composable(route = ButtonTransitionScreen.SingIn.rounte){
            SetSignin()
        }**/
    }
}