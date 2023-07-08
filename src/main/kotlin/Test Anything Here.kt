//simple when else, example 1
/*fun myPlanets(){
    println("Enter a planet name:")
    val result = when(readln().uppercase()){ //the uppercase function will convert the input (small case or uppercase) to uppercase
                                             //make sure the "when" options are in uppercase
        "MARS"->"Mars is the closest neighbour to Earth!"
        "EARTH"->"Earth is our home planet!"
        "JUPITER"->"Jupiter is the largest planet!"
        "VENUS"->"Venus has an anticlockwise rotation on its axis!"
        else->"Sorry, please enter another planet!"
    }
    println(result)
}


//simple when else, example 2
fun months (){
    print("Enter number of the Month: ")
    val month = when(readln().toIntOrNull()) { //toIntOrNull converts user input into an integer, or null
        1->"January"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else-> "Not a month of the year!"
    }
    println(month)
}

//simple when else, example 3
fun oddOrEven (){
    println("Enter any whole number:")

    val input = readln().toLongOrNull() //converts input into long number, or null otherwise
                                        //note the long number, as the user might enter a number bigger than INT limits


    val result = when{
        input == null ->"Invalid input, enter a whole number!" //when the input cannot be converted to a whole integer
                                                               // null represents the absence of a valid value,
                                                               // so if you put a string, then this line will be executed
        input % 2L == 0L ->"The number is even!" //by default, no need for another line for odd, also LONG number
                                           // since the only other option is odd
        else->"The number is odd!"
    }
    println(result)

}*/

/* fun animalSpeed(){
    val animalList = mutableListOf("Cheetah", "Snail")

    println("Enter an animal from the list to see their speed:")

    val result = when(readln().uppercase()){
        "CHEETAH"->"A cheetah's maximum speed is 130km/h!"
        "SNAIL"->"A snail's maximum speed is 0.048km/h!"
        else->"Not valid!"
    }
    println(result)
} */

/* if else from a map. example 1 */
/* fun cityToCountry (){

    val cityToCountry = mutableMapOf("Nairobi" to "Kenya", "Kigali" to "Rwanda")

    println("Choose a city from the list to see the country:")

    val userInput = readln()

    val myCountry = cityToCountry[userInput] //retrieve the value from the key, which is the city

    if(myCountry!=null){ //if the value of the
        println("$userInput is the capital of $myCountry.")
    }else{
        println("$userInput is not in the list!")
    }

}*/

fun main (){

    /* myPlanets()
    months()
    oddOrEven()
    animalSpeed()
    cityToCountry()
    animalSpeed() */


}