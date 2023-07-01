import java.util.*

fun main() {

    alpha()
}


fun alpha() {
//when conditional for a simple mutable list
    val alphabetList = mutableListOf("Ab", "B", "C", "D", "E")

    println("Please enter an alphabet among Ab, B, C, D, and E to see what they mean:")

    val myInput = readln() //get user input

//the uppercase(Locale.getDefault()) is used to render the input non-case sensitive

    val alphabetResult = when (alphabetList.indexOf(myInput.uppercase(Locale.getDefault()))) {
        0 -> "Ab represents an apple!"
        1 -> "B represents a boy!"
        2 -> "C represents a church!"
        3 -> "D represents an dog!"
        4 -> "E represents an egg!"
        else -> "Sorry, we cannot find $myInput in the list."
    }
    println(alphabetResult)

}

