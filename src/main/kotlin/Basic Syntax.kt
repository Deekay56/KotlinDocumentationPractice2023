//end of line comment. used per line

/*
multiline comment. can be used as needed as long as its enclosed.
another sentence to show.
another sentence to show
 */

fun main() {
    println("Hello World!") //most common beginner program
    println(23)


    //basic variables and their data types
    //kotlin automatically infers the data types once the value is given for a variable
    val a = 1 //integer, same as val a:Int = 1
    val b = "Hello" //string, same as val b:String = "Hello"
    val c = true //or false, same as val c:Boolean = true
    val d = 0.00 //double, same as val d:Double = 0.00

    //let's use these variables above by simply printing them out
    println(a)
    println(b)
    println(c)
    println(d)


    //string templates
    val age1 = 7
    val myStringTemp = "My age is $age1"

    //The replace function does not work directly on an Int variable, as it is defined on CharSequence and String.
    val myStringTempReplace = "My age was $age1 but now ${myStringTemp.replace("7", "78")}."
    println(myStringTempReplace)

    //another example of the replace function
    val myName = "David"

    println("My name is $myName.")

    val myNewName = myName.replace("David", "John")

    println("My new name is now $myNewName.")

    //calling functions in the main function.
    //for the functions without any output in their body, they will not execute output unless you pass them through the println() function
    sum(10, 10)
    diff(10, 5)
    prod(5, 7) //this one will output only because the function body has a print function
    myForLoop()

    //a bit different for the below function call
    val myCountryList: List<String> = myForLoopWithReturn() //a variable that takes holds a list of Strings from the myForLoopWithReturn() function
    for (myCountry in myCountryList){
        print("$myCountry ")
    }
    println()
    println("Actually meant to be blank :)")

    myWhileLoop()
    myWhenElse()
    myForLoopWithRange()

    //you can instantiate functions with a variable
    val conditional = conditional(7128,745)
    println("The bigger number is: $conditional")

    //calling the Square class in the main function with an instance (), note to put the parameters if present
    val perimeter = Square(6.00, 6.00) //instantiate the class
    println("The perimeter of the square is ${perimeter.perimeter} cm.") //and the property "perimeter"



}

fun sum(a: Int, b: Int): Int { //simple function with two parameters and an Int return type, and a body
    return a + b
}

fun diff(a: Int, b: Int) = a-b //simple function with two parameters but doesn't have a body
                              // this is an expression function, where the body is the expression

fun prod(a:Int, b:Int){ //simple function that does not return anything, or a void function.
                       // it simply prints out a product value
    println("The product is ${a*b}")
}

//simple function to evaluate if a condition is true then execute, else do something else
fun conditional(a: Int, b: Int): Int {
    if(a<b){
        return b //if "a" is less than "b", then the value of "b" which is greater will  be returned
    }else if (a>b){
        return a //if "a" greater than "b", the value of "a" which is greater will be returned
    }else println("Invalid!") //if both values are equal or one or both are invalid
    return 0 //When defining a function with a return type, all possible execution paths should have a return statement
            // that returns a value of the specified type.
}

//a simple function showing a for loop. a for loop iterates through a range of items and executes the required condition for that range
fun myForLoop(){
    val myFruitList = mutableListOf("Apple", "Mango", "Banana")
    for (fruit in myFruitList){
        print("$fruit ")
    }
    println()

}

//a simple modified function, same as the one above, but this time using the return statement
fun myForLoopWithReturn(): List<String>{ //to return a list of strings only
    val myCountries  = mutableListOf("Kenya", "Tanzania", "Uganda") //a string list that can be changed
    val myCountriesLoopList = mutableListOf<String>() //an empty string list to take in the values of the myCountries list.

    for (country in myCountries){ //loop through the first list with the country iterator which will take the value of each element
        myCountriesLoopList.add(country) //add each element held by "country" to the new list
    }
    return myCountriesLoopList //return the contents of the new list

}

//a simple function showing a while-loop. this loop executes code repeatedly
// as with the (++) as long as the condition set is met, and then exits the program
fun myWhileLoop(){
    val ages = mutableListOf(45, 67, 78, 67, 89)
    var age = 0 //this is a variable that checks the index position of every element in the list.
               //"age" will check the first element "45" at position "0", until "89" at position "4"
    while (age<ages.size){ //ages.size is "5", not "4". the last index position is usually ages.size-1
                           //using while (age<ages.size-1) would stop the loop from accessing the last element in the list
                           //since ages.size-1 is index(4), so 89 will not be included
        print("${ages[age]} ")
        age++
    }
    println()
    println(ages.size-1) //to give 4
    println(ages[4])// to give 89

}


//this function shows a when-else expression, which is useful as a more efficient alternative for if-else,
// especially if the if-else has many conditions
fun myWhenElse(){
    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println("Enter a day of the week:")
    val input = readln() //this will hold what the user enters, as a string
    val day = daysOfWeek.indexOf(input) //this variable uses the indexOf function to
                                       // convert the user string input into the corresponding index position in the daysOfWeek list
                                      // this means that if a user enters "Wednesday", variable  "day" will be the element index [2]
    return when (day){ // this makes it easy to check the list values based on their index position
        in 0..daysOfWeek.size-1 -> println("You have entered ${daysOfWeek[day]}.") //the ".." includes the last element in the range,
        // unlike "until" which excludes the lat element in the range
        // the day variable is the index position of the user input within the list
        // which is represented by daysOfWeek.size-1
        //for example, "Monday" = daysOfWeek[0], hence if that's the case it will print out "You have entered Monday" and so on
        else -> println("Invalid entry.")
    }
}


fun myForLoopWithRange(){
    for (a:Int in 1..3){ //the range operator iterates through a range of values and executes the given condition
        for (b:Int in 1..10){
            println("oooooooooo") //inner loop prints ten "o"s then skips a line after each iteration. this is three times
        }
        println("----------") //outer loop prints ten dashes and jumps to the next line after each iteration. this is three times
                             //note that the outer loop can only execute until the inner loop completely executes, however many times the inner loop needs
                            //in this case, the (----) will only be printed after the (oooo) are printed 3 times.
    }
}

class Square (height: Double,length: Double){  //a simple class to give the perimeter of a Square when called in the main function.
                                               // Classes have first-letter caps
    var perimeter = (height + length) * 2
}





























