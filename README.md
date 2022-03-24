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
  each and every **Screens** should have **A unique Name or Route** . There are many different way to define route  *<u>using Sealed class</u>* or  *<u>using constant of Route etc</u>* .
but we recommended , we define route ***using Sealed class***



</p>

