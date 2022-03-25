package android.example.jetpack_compose_tutorial.ui.progress

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Chapter6_Timer(){
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