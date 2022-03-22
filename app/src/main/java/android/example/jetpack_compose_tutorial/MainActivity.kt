package android.example.jetpack_compose_tutorial


import android.example.jetpack_compose_tutorial.ui.progress.*
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            Chapter1(R.drawable.suv)
//            Chapter2()
//            Chapter3()
//            Chapter4()
//            Chapter5()
//            Chapter5WithDisposableEffect(onBackPressedDispatcher)

            Surface(
                color= Color(0xFF101010) ,
                modifier = Modifier.fillMaxSize()
            ){

                Box(
                    contentAlignment = Alignment.Center,
                ) {
                    CircleView(
                        totalTime = 10L*1000L,
                        handleColor = Color.Blue,
                        modifier = Modifier.size(200.dp)
                        ,
//                initialValue = 2f,
                        activeBarColor = Color.Green,
                        inactiveBarColor = Color.DarkGray,
                        strokeWidth = 2.dp

                    )

                }

            }



        }
    }
}


fun setBorderOnText(borderWidth: Dp, color: Color) =
    Modifier.border(BorderStroke(borderWidth, color))

