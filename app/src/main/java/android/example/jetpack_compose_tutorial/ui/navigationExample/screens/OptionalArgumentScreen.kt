package android.example.jetpack_compose_tutorial.ui.navigationExample.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun OptionalArgumentScreen(
    navController: NavHostController ,
    name : String,
    age:Int
){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Optional Argument Screen",
                color = Color.Red,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold,
            )

            Text(
                text = "Hello My name is $name and age is $age ",
                color = Color.Green,
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 10.dp)
            )

        }


    }


}
