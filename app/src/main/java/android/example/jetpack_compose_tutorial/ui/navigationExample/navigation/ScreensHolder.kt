package android.example.jetpack_compose_tutorial.ui.navigationExample.navigation

sealed class ScreensHolder(val route:String){
    object Home:ScreensHolder("home_screen")
    object Detail:ScreensHolder("detail_screen")
    object RequiredArgExample:ScreensHolder("required_argument_screen/{_id}")
    object OptionalArgExample:   ScreensHolder("optional_argument_screen")
}
