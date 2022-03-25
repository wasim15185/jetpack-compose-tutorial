## Jetpack Compose Tutorial

### Navigation in Jetpack Compose

<p>

* **Nav Controller :** Main Purpose of Compose is it's keeps **track of Backtrack** and keeps **
  track of state of composable screen** . It is a good practice to place **Nav Controller** top of
  the composable hierarchy. so the we can easily passdown the **Nav Controller** in Composable tree

* **Nav Host :** using of **Nav Host** we can define the navigation graph (eg : Screens ,Routes ,
  argument etc .)

We know in android navigation happens **between two fragments or between two activities** . <br/>
But, In android **jetpack compose** navigation happens **between to Composable**

#### How to initialize navigation in jetpack compose ?

* We know , in jetpack compose happens **between to Composable** so those **Composable** we can
  called **Screen** . <br/> In jetpack compose, each and every **Screens** should have **A unique
  Name or Route** . There are many different way to define route  **using Sealed class** or  **using
  constant of Route etc** . but we recommended , we define route ***using Sealed class*** <br/>

Here , we use navigation will happen between three screen `1. HomeScreen` and `2. DetailScreen`
and `3. ArgumentExampleScreen` .

***At first*** , we have to define Unique Route name inside sealed class named `ScreensHolder` . In
this class parameter is String which is route and it must be unique and there are two object inside
the `ScreensHolder` class .

```
sealed class ScreensHolder(val route:String){
    object Home:ScreensHolder("home_screen") // <-- Without argument navigation
    object Detail:ScreensHolder("detail_screen") // <-- Without argument navigation
    object RequiredArgExample:ScreensHolder("required_argument_screen/{_id}") // <-- With Required argument navigation ( this is discussed in navigation with arguments  )
    object OptionalArgExample:   ScreensHolder("optional_argument_screen") // <-- With Optional argument navigation ( this is discussed in navigation with arguments  )
}
```

***Secondly*** , we have to create initialize NavHostController Object in `navController` variable
in MainActivity and `rememberNavController()` function create Nav-Controller for us

```
class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposetutorialTheme { 
                navController = rememberNavController() //<--  this function create navContoller for us
            }
        }
    }
}

```

***Third***, we have to create NavGraph so we create a File name `NavGraph` and inside this file
have a function which will create **navhost**  .

```
@Composable
fun SetupNavGraph(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = ScreensHolder.Home.route
    ){

        /**
         * Inside NavHost lambda-block we can access [composable] function
         *
         * [composable] : in this function we have to pass "Route-Name" which 
         * is unique and in this function have Lambda-block which is for 
         * defining for "Destination-Screen" .
         */

        composable(route = ScreensHolder.Home.route){
                HomeScreen()
        }

        composable(route = ScreensHolder.Detail.route){
            DetailScreen()
        }
 
        
        

    }

}

```

### Navigation with arguments

now, we want navigation with argument . there are two ways where we can do navigation argument **1.
Required Argument**  **2. Optional Argument**

**Required Argument** :

###### For Simplicity , We focus on particular code for `Required Argument Navigation`

Here We navigate from `HomeScreen` to `RequiredArgumentScreen`

**1st step :** we have to define screenholder for unique of route so we have to define routes using
sealed class . but noticed one thing in `ScreensHolder` class we write route name
like `"required_argument_screen/{_id}"` . where`{_id}` replace with argument just like web
development url

 ```
sealed class ScreensHolder(val route:String){
    object RequiredArgExample:ScreensHolder("required_argument_screen/{_id}")  
 }
```

**2nd step :** we have to create NavGraph and define route configuration inside NavGraph .

``` 
composable(
            route=ScreensHolder.RequiredArgExample.route,
            arguments = listOf(
                navArgument("_id"){ // <--here we have pariticularly define which is 'argument' and 
                  type = NavType.IntType  // have to define type of 'argument'
                    
                }
            )
        ){
            val argument = it.arguments?.getInt("_id")
            Log.d("Arg", "id is : $argument ")
            
            RequiredArgumentScreen(navController,argument!!)
        } 
        
```

See this code  we have to pass  `route` value and `arguments` value to `composable` function .
Where `arguments` value is array of `navArgument` .

```
navArgument("_id"){ // <--here we have pariticularly define which is 'argument' and
                    type = NavType.IntType  // have to define type of 'argument'
          }
```

below here is the full code of NavGraph 

```

@Composable fun SetupNavGraph(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = ScreensHolder.Home.route
    ){

        /**
         * Inside NavHost lambda-block we can access [composable] function
         *
         * [composable] : in this function we have to pass "Route-Name" which is unique and in this function have Lambda-block
         * which is for defining for "Destination-Screen" .
         */

        composable(
            route=ScreensHolder.RequiredArgExample.route,
            arguments = listOf(
                navArgument("_id"){
                    type = NavType.IntType
                }
            )
        ){
            val argument = it.arguments?.getInt("_id")
            Log.d("Arg", "id is : $argument ")
            
            RequiredArgumentScreen(navController,argument!!)
        }


    }

}


// Home Screen
//-----------------------
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
                    navController.navigate(route = "required_argument_screen/"+ 5) // <-- See we call Nav-Controller to navigate to RequiredArgumentScreen
                }) {
                Text("Navigate to Required Arg Route")
            }

           
        }

    }

}

 

```
**3rd step :** we have to call  **`navController.navigate(route = "required_argument_screen/"+ 5)`** From **`HomeScreen`**
here **`"required_argument_screen/{_id}"`** represent as **`"required_argument_screen/"+ 5`** where **`_id`** represent is **`5`**





</p>

