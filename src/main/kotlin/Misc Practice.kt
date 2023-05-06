fun main() {


    println("Enter a country name:")
    val myCountry = readln()

    val myList = whenElseList(myCountry)




}

fun whenElseList(myCountry: String) {
    val countryList = mutableListOf("Kenya", "Somalia", "Uganda", "Tanzania")

    when {
        myCountry in countryList->{
            when (myCountry) {
            "Kenya" -> println("Nairobi is the capital.")
            "Uganda"-> println("Kampala is the capital.")
            else -> println("Nope")
        }
    }
        else->println("Not this one!")
    }
}