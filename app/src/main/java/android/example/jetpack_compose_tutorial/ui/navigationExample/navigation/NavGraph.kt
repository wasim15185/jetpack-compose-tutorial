package android.example.jetpack_compose_tutorial.ui.navigationExample.navigation

import android.example.jetpack_compose_tutorial.ui.navigationExample.screens.ArgumentExampleScreen
import android.example.jetpack_compose_tutorial.ui.navigationExample.screens.DetailScreen
import android.example.jetpack_compose_tutorial.ui.navigationExample.screens.HomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = ScreensHolder.Home.route
    ){

        /**
         * Inside NavHost lambda-block we can access [composable] function
         *
         * [composable] : in this function we have to pass "Route-Name" which is unique and in this function have Lambda-block
         * which is for defining for "Destination-Screen" .
         */

        composable(route = ScreensHolder.Home.route){
                HomeScreen(navController)
        }

        composable(route = ScreensHolder.Detail.route){
            DetailScreen(navController)
        }

        composable(route=ScreensHolder.ArgumentExample.route){
            ArgumentExampleScreen(navController)
        }

    }

}