class Family (val name: String, val age: Int) { //properties of the class itself, so they will be initialized  with an instance of the class in the main function.

    companion object { //allows to access the variable directly from the class without creating an instance of the class

    const val me: String = "David" //const is optional
}

}

fun main(){


    val father = Family("Francis", 56)
    val mother = Family("Mary", 50)
    val brother = Family("Dennis", 23)

    val myself = Family.me //accessed directly being a companion object property



    println("My father is called ${father.name}, while his age is ${father.age}")
    println("My mother is called ${mother.name}, while her age is ${mother.age}")
    println("My brother is called ${brother.name}, while his age is ${brother.age}")
    println()

    println("And my name is $myself!")

}