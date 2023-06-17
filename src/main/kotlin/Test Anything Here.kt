fun main(){

    val myNum = 5

    val myNumToChar = myNum.toChar() //will give the ASCII code
    val myNumToString  = myNum.toString() //will give the string representation of 5, which is still 5.
    val myNumToDouble = myNum.toDouble()

    println(myNum)
    println(myNumToChar)
    println(myNumToString)
    println(myNumToDouble)

    val modulus  = (10/6).toDouble()

    println(modulus)
    println(modulus+1)

    var num1 = 5
    var num2 = 5

    if (num2 != num1){
        println("Not Equal")
    }else{
        println("Equal")
    }


}