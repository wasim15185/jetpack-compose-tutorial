package android.example.jetpack_compose_tutorial.ui.navigationExample.navigation

import android.example.jetpack_compose_tutorial.ui.navigationExample.screens.RequiredArgumentScreen
import android.example.jetpack_compose_tutorial.ui.navigationExample.screens.DetailScreen
import android.example.jetpack_compose_tutorial.ui.navigationExample.screens.HomeScreen
import android.example.jetpack_compose_tutorial.ui.navigationExample.screens.OptionalArgumentScreen
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

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

        composable(
            route=ScreensHolder.RequiredArgExample.route,
            arguments = listOf(
                navArgument("_id"){
                    type = NavType.IntType
                }
            )
        ){

            val argument = it.arguments?.getInt("_id")
            Log.d("Arg", "id is : $argument ")

            RequiredArgumentScreen(navController,argument!!)
        }

        composable(
            route=ScreensHolder.OptionalArgExample.route,
            arguments = listOf(
                navArgument("_name"){
                    type= NavType.StringType
                    nullable=true
                },
                navArgument("_age"){
                    type= NavType.IntType // interger cannot be nullable
                    defaultValue=0
                 }

            )
        ){

            val name = it.arguments?.getString("_name")
            val age = it.arguments?.getInt("_age")

            OptionalArgumentScreen(navController,name!!,age!!)
        }

    }

}