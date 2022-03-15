package android.example.jetpack_compose_tutorial.ui.progress

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

/**
 * This section for All about "State" .
 */


@Composable
fun Chapter3() {

    Column(Modifier.fillMaxSize()) {
        val color = remember { mutableStateOf(Color.Blue) }

        ColorBox(
            Modifier
                .fillMaxSize()
                .weight(1f)
        ) { randomColor ->
            color.value = randomColor
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .background(color.value)
                .fillMaxSize()
        )
    }


}


@Composable
fun ColorBox(modifier: Modifier = Modifier, updateColor: (Color) -> Unit) {


    Box(modifier = modifier

        .clickable {

            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )


        }
    )

}