

fun main(){

    //or you can also remove the return statement

    val perimeterRectangle = fun(rectLength:Int, rectHeight:Int): Int = 2*(rectLength+rectHeight)

    val myPerimeterRectangle = perimeterRectangle(5, 7)

    println(myPerimeterRectangle)

}