## Jetpack Compose Tutorial


### Navigation in Jetpack Compose

<p>

* **Nav Controller :** Main Purpose of Compose is it's keeps **track of Backtrack** and keeps **track of state of composable screen** . 
It is a good practice to place **Nav Controller** top of the composable hierarchy. so the we can easily passdown the **Nav Controller** in Composable tree

* **Nav Host :** using of **Nav Host** we can define the navigation graph (eg : Screens ,Routes , argument etc .) 


We know in android navigation happens **between two fragments or between two activities** . <br/>
But, In android **jetpack compose** navigation happens **between to Composable**

#### How to initialize navigation in jetpack compose ? 

* We know , in jetpack compose happens **between to Composable** so those **Composable** we can called **Screen** . <br/> In jetpack compose, 
  each and every **Screens** should have **A unique Name or Route** . There are many different way to define route  **using Sealed class** or  **using constant of Route etc** .
but we recommended , we define route ***using Sealed class*** <br/>

Here , we use navigation will happen between two screen `1. HomeScreen` and `2. DetailScreen` .

***At first*** , we have to define Unique Route name inside sealed class named `ScreensHolder` . In this class parameter is String which is route and it must be unique  and there are 
two object inside the `ScreensHolder` class . 

```
sealed class ScreensHolder(val route:String){
    object Home:ScreensHolder("home_screen")
    object Detail:ScreensHolder("detail_screen")
}
```

***Secondly*** , we have to create initialize Nav-Controller Object in MainActivity and `rememberNavController()` function create Nav-Controller for us 
```
class MainActivity : ComponentActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                navController = rememberNavController() //<--  this function create navContoller for us
        }
    }
}

```

***Third***, we have to create NavGraph


</p>

