fun main() {

    whenElseList()
}

fun whenElseList() {
    val countryList = mutableListOf("Kenya", "Somalia", "Uganda", "Tanzania")

    println("Enter a country name:")
    val myCountry = readln()

    val result = when (countryList.indexOf(myCountry)){
        0 -> println("The capital is Nairobi.")
        1-> println("The capital is Mogadishu.")
        2 -> println("The capital is Kampala.")
        3-> println("The capital is Dar-es-salaam.")

        else->println("Cannot find $myCountry in the list!")
    }
    return result
}


