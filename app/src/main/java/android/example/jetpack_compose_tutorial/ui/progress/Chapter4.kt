package android.example.jetpack_compose_tutorial.ui.progress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun Chapter4() {

    val scaffoldState = rememberScaffoldState()

    var textFieldState by remember {
        mutableStateOf("")
    }

    val scope = rememberCoroutineScope ()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
                .background(Color.Blue)

        ) {
            TextField(
                value = textFieldState,
                label = {
                    Text("Enter Your Name ")
                },
                onValueChange = {
                    textFieldState = it
                },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    scope.launch {
                        scaffoldState.snackbarHostState.showSnackbar(textFieldState)
                    }
                },

                ) {
                    Text("Click Me hello hi bye bye")
            }

        }

    }

}

