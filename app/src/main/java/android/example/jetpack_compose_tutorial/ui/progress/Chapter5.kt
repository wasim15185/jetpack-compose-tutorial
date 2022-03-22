package android.example.jetpack_compose_tutorial.ui.progress

import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntSize
import kotlin.reflect.typeOf

/**
 * Side-Effects : SideEffect { ... } block will run after every Re-Composable .
 * If Composition Failed then this SideEffect { ... } block will not run
 */

/**
 * If We want to clean up some object after Finishing Composable then we should use "DisposableEffect"
 * Eg: We can avoid memory leak using DisposableEffect
 *
 */


var i = 0

@Composable
fun Chapter5() {

    var count by remember {
        mutableStateOf(0)
    }



    SideEffect {
        ++i
        Log.d("TAG", "Chapter5: $i")
    }

    Column(

        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text("Hello $count", color = Color.White)
        Button(onClick = {
            count++

        }) {
            Text("Click Me")
        }

    }


}

@Composable
fun Chapter5WithDisposableEffect(backPressedDispatcher: OnBackPressedDispatcher) {

    val callback = remember {
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                /* TODO */
            }
        }
    }



    /** if [backPressedDispatcher] will change then  [DisposableEffect] will call */
    DisposableEffect(key1 = backPressedDispatcher) {
        backPressedDispatcher.addCallback(callback)
        onDispose {
            callback.remove()
        }
    }


}