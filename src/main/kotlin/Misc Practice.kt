fun main() {

}

fun whenElseList(){
    val countryList = mutableListOf("Kenya", "Nairobi", "Uganda", "Tanzania")
    val country: String

    when {
        "Kenya" in countryList -> println("Nairobi is the capital.")
        "Uganda" in countryList -> println("Kampala is the capital.")
    }
    else -> println("Nope")
}