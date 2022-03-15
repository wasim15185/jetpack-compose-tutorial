package android.example.jetpack_compose_tutorial.ui.progress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

val darkgrey = Color(0xFF101010)

@Composable
fun Chapter2() {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(darkgrey)
    ) {
            Text(
                text = " New Text" ,
                color=Color.White,
                fontSize = 30.sp
            )
    }

}