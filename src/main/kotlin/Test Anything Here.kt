fun mick() = "Call me Sir Mick Jagger!" //example of a function with an expression body, a bit different from the block body functions

fun printSum(a: Int, b: Int): Unit { //Unit type can be omitted. since the return type is absent, it is this assumed to be Unit
    println("The sum of $a and $b is ${a + b}")
}


fun custName(): String {
    println("What is your name?")
    return readln()
}

fun main(){
    println(mick())
    printSum(5, 7)

    val mName = custName()
    println("Hello $mName")


}

