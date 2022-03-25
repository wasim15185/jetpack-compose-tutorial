package android.example.jetpack_compose_tutorial.ui.navigationExample.screens

import android.example.jetpack_compose_tutorial.ui.navigationExample.navigation.ScreensHolder
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun HomeScreen(navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Home Screen",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold,
            )

            Button(
                modifier = Modifier.padding(top = 10.dp),
                onClick = {
                    navController.navigate(route = ScreensHolder.Detail.route)
                }) {
                Text("Navigate to Detail Route")
            }

            Button(
                modifier = Modifier.padding(top = 10.dp),
                onClick = {
                    navController.navigate(route = "required_argument_screen/"+ 5)
                }) {
                Text("Navigate to Required Arg Route")
            }

            Button(
                modifier = Modifier.padding(top = 10.dp),
                onClick = {
                    navController.navigate(route = ScreensHolder.OptionalArgExample.passNameAge("Sulieman",25))
                }) {
                Text("Navigate to Optional Arg Route")
            }

        }

    }

}

//@Composable
//@Preview(showBackground = true)
//fun HomeScreenPreview() {
//    HomeScreen()
//}