

fun main(){

    //anon function

    val myName = fun(name: String):String = name

    val customName = myName("David")

    println(customName)

    //lambda expression

    val myCar = {car:String->car}

    val customCar = myCar("Jeep")

    println(customCar)
}