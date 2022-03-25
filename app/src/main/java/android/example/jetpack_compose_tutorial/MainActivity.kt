package android.example.jetpack_compose_tutorial


import android.example.jetpack_compose_tutorial.ui.progress.*
import android.example.jetpack_compose_tutorial.ui.theme.JetpackcomposetutorialTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                navController = rememberNavController() // this function create navContoller

//            Chapter1(R.drawable.suv)
//            Chapter2()
//            Chapter3()
//            Chapter4()
//            Chapter5()
//            Chapter5WithDisposableEffect(onBackPressedDispatcher)
//            Chapter6_Timer()




        }
    }
}


fun setBorderOnText(borderWidth: Dp, color: Color) =
    Modifier.border(BorderStroke(borderWidth, color))

