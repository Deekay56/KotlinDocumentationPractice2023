fun mick() = "Call me Sir Mick Jagger!" //example of a function with an expression body, a bit different from the block body functions

fun printSum(a: Int, b: Int): Unit { //Unit type can be omitted. since the return type is absent, it is this assumed to be Unit
    println("The sum of $a and $b is ${a + b}")
}

var z = 5 //variables can be declared at the top level, or globally, they will be accessed anywhere within the code. This is not encouraged.

fun zadd(): Int{ //function parameters are read-only
  z+=1
    return z
}



fun main(){
    println(mick())
    printSum(5, 7)
    println(zadd())

}