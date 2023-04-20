class Area (private val length: Int, private val width: Int){ //private ensures that the parameters will only be accessed inside this class and not from other locations
    val area: Int

        get() = length*width //getters can only be used in classes
        //while it is not strictly necessary to define a custom getter using the get() function, it can be useful to provide custom logic for computing the value of a property
        // especially when the property depends on other properties or on some other logic

}

fun main(){
    val myArea = Area(5, 8)
    println(myArea.area) //access the area property in Area class
}