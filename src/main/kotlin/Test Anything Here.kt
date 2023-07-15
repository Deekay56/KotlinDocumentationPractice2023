



fun main (){

    println("Enter a whole number to see if odd or even:")

    val input = readln().toIntOrNull()

    if (input != null) {
        val result = when {
            oddNum(input) -> "The number is odd!"
            evenNum(input) -> "The number is even!"
            else -> "Neither even or odd!"
        }
        println(result)
    }else{
        println("Invalid input!")
    }

}
