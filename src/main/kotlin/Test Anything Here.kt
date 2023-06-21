class Cars { //this class has the default values set in the properties
    val name = "Subaru"
    val year = 2005
    val topSpeed = 320
}


fun main(){

    val myCar = Cars()

    println(myCar.name) //default values are already set in the class Cars
    println(myCar.topSpeed)
    println(myCar.year)



}

