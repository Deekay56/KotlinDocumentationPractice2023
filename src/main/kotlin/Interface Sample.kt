//the purpose of an interface is to define a contract of behaviors that a class must implement.
//when a class implements an interface, it promises to provide an implementation for all the functions defined in the interface.
//in other words, the class agrees to fulfill the contract defined by the interface.
//Interfaces can't have any constructor logic or store any state.

interface MyCar {
    fun drive() //note that interfaces in Kotlin cannot define default implementations for functions, so no println etc...
}

class Subaru : MyCar { //this class acts on the conditions set by the interface
    override fun drive() {
        // Implementation for driving a car
        println("Let's drive this Subaru!")
    }
}


interface Sum { //defines what any given class implementing the interface should do, which in this case is to use these variables
    val a: Int
    val b: Int
}

class Add(override val a: Int, override val b: Int) : Sum {

    val sum = a + b
}

fun main (){

    Subaru().drive() //call the class and function

    val myAdd = Add(5, 7) //access the Add class and its parameters
    val mySum = myAdd.sum //access the sum property in Add class

    println(mySum)

}