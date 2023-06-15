fun main() {


    println("Enter a country name:")
    val myCountry = readln()

    whenElseList(myCountry)

    val yourName = name()
    println("Your name is $yourName.")



}

fun whenElseList(myCountry: String) {
    val countryList = mutableListOf("Kenya", "Somalia", "Uganda", "Tanzania")

    when {
        myCountry in countryList->{
            when (myCountry) {
            "Kenya" -> println("The capital is Nairobi.")
            "Uganda"-> println("The capital is Kampala.")
            else -> println("Nope")
        }
    }
        else->println("Not this one!")
    }
}

fun name(): String {
    println("Please enter your name.")

    return readln()
}

