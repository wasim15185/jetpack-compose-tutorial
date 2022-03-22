package android.example.jetpack_compose_tutorial


import android.example.jetpack_compose_tutorial.ui.progress.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

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

        }
    }
}




fun setBorderOnText(borderWidth: Dp, color: Color) =
    Modifier.border(BorderStroke(borderWidth, color))

