import java.util.*

fun myAlphabet(){

    val letterList = mutableListOf("A","B","C")

    println("Please enter a letter from the list:")

    val myLetter = readln()

    val result  = when (letterList.indexOf(myLetter.uppercase(Locale.getDefault()))){
        0->"A is for Apple!"
        1->"B is for Boy!"
        2->"C is for Cat"
        else->"Invalid, try again!"
    }
    println(result)
}


fun main() {
    myAlphabet()
}