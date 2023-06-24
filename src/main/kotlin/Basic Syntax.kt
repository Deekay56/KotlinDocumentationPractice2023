import java.util.*

//test for pulling 19.06.23
//test for commit and push 19.06.23

//end of line comment. used per line

/*
multiline comment. can be used as needed as long as its enclosed.
another sentence to show.
another sentence to show
 */

//var badVariable = 9 //variables can be declared at the top level, or globally, they will be accessed anywhere within the code. This is not encouraged.

fun main() {
    println("Hello World!") //most common beginner program
    println(23)


    //basic variables and their data types
    //kotlin automatically infers the data types once the value is given for a variable
    val a = 1 //integer, same as val a:Int = 1
    val b = "Hello" //string, same as val b:String = "Hello"
    val c = true //or false, same as val c:Boolean = true
    val d = 0.00 //double, same as val d:Double = 0.00
    val e = 'A' //char, for a single character
    val f = 5.66F //floating point decimals, to 6 or 7 places

    //let's use these variables above by simply printing them out
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)

    //sample type conversion
    val myNum = 5

    val myNumToChar = myNum.toChar() //will give the ASCII code
    val myNumToString  = myNum.toString() //will give the string representation of 5, which is still 5.
    val myNumToDouble = myNum.toDouble() //will give 5.0


    println(myNum)
    println(myNumToChar)
    println(myNumToString)
    println(myNumToDouble)

    //assignment operators. need to use var to reassign
    var numToSum = 5 //+= others are -=, *=, /=, %=, and a simple =
    numToSum+=2
    println(numToSum)

    // comparison operators for comparing values
    val comparisonNum1 = 5
    val comparisonNum2 = 5

    if (comparisonNum1 != comparisonNum2){ //this is the "not equal" to operator, both variables are equal in this case
                                          //others include ==, >, >=, <=, and <
        println("Not Equal")
    }else{
        println("Equal")
    }

    //logical operators determine logic between variables/values
    //others include "&&" called the logical AND, as well as the "!" called the logical NOT
    val logicalNum1  = 6
    val logicalNum2  = 1

    if(logicalNum1 > 3 || logicalNum2 < 5){ //logical OR if any of the statements is true, then the end result is true
        println("This statement is true.")
    }else{
        println("This statement is not true.")
    }

    //accessing and modifying a string
    val customString1 = "Inglourious Bastards"
    println(customString1[10]) //access element at index 10
    println("The length of this string is ${customString1.length}") //string length
    println(customString1.uppercase()) //convert to Upper Case
    println(customString1.lowercase()) //convert back to Lower Case

    //we will now introduce another string to compare with the first
    val customString2 = "Inglourious Basterds"
    println(customString1.compareTo(customString2)) //the output is "-4",
    // which means the string 1 is lexicographically lesser than string 2.
    //what that means is that string 1 has a letter that appears first in the alphabet,
    // which is the "a" is Bastards, as compared to the "e" in Basterds


    //find a string within a string
    println(customString1.indexOf("Bastards")) // the B in "Bastards" occurs on the 12th index position

    //string templates 1 (interpolation)
    println("$customString1 is interpolated with $customString2.")
    //or
    println("${customString1} is interpolated with ${customString2}.")


    //string templates 2
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

    //boolean expressions
    val boolNum1 = 5
    val boolNum2 = 6

    println(boolNum1>boolNum2)//will print "false"

    //simple else-if conditional (including if-else)
    val customAge = 40
    if(customAge < 40){
        println("Young.")
    }else if(customAge == 40 || customAge <= 60){
        println("Middle-aged.")
    }else{
        println("Old.")
    }

    //when conditional, useful in a scenario of many if-elses
    println("Please choose from a list of Dad, Mum, Big Bro, Small Bro, and Carol to find out their names:")

    val familyMember = readln() //can skip this and use the readln() function directly in the "when" clause

    val whichOne = when (familyMember){
        "Dad"->"Dad's name is Jack."
        "Mum"->"Mum's name is Maria."
        "Big Bro"->"Big Bro's name is David."
        "Small Bro"->"Small Bro's name is Sam."
        "Siz"->"Siz's name is Grace."

        else->"Invalid name. Choose from that list."
    }
    println(whichOne)

    //when conditional for a simple mutable list
    val alphabetList = mutableListOf("A", "B", "C", "D", "E")

    println("Please enter an alphabet among A, B, C, D, and E to see what they mean:")

    val myInput = readln() //get user input

    //the uppercase(Locale.getDefault()) is used to render the input non-case sensitive

    val myInputIndex = alphabetList.indexOf(myInput.uppercase(Locale.getDefault()))

    val alphabetResult = when (myInputIndex){
        0->"A represents an apple!"
        1->"B represents a boy!"
        2->"C represents a church!"
        3->"D represents an dog!"
        4->"E represents an egg!"
        else->"Sorry, we cannot find $myInput in the list."
    }
    println(alphabetResult)

    //while loop, executes code as long as the specified condition is true.
    //in this case, 0 will be printed, as well as all numbers until 5
    //Do not forget to increase the variable used in the condition, otherwise the loop will never end!
    var whileLoopNumber = 0

    while (whileLoopNumber<=5){
        print(whileLoopNumber )
        whileLoopNumber++
    }

    //do while loop, will execute at least once, even if the condition checked is false.
    // in this case, 6 will be printed, and the loop quits.
    //Again, do not forget to increase the variable used in the condition, otherwise the loop will never end!
    var doWhileLoopNumber = 6
    do {
        print(doWhileLoopNumber)
        doWhileLoopNumber++
    }while (doWhileLoopNumber<=5)

    //break statement, this will stop the loop at the point specified
    //in this case, the loop breaks after printing 2
    var breakLoopNumber = 0

    while (breakLoopNumber<=5){
        print(breakLoopNumber )
        breakLoopNumber++
        if (breakLoopNumber == 3) break
    }

    //continue statement, this will break one iteration IN THE LOOP, if a condition occurs, and then continues with the rest of the loop.
    var continueLoopNumber = 0

    while (continueLoopNumber<=5){
        if (continueLoopNumber == 4) {
            continueLoopNumber++
            continue
        }
        print(continueLoopNumber )
        continueLoopNumber++

    }

    //another version of continue, using a character in the alphabet
    var customLetter = 'A'

    while (customLetter<='F'){
        if (customLetter == 'C'){
            customLetter++
            continue
        }
        print(customLetter)
        customLetter++
    }

    //arrays. store multiple values in a variable
    val carArray = arrayOf("Benz","Volvo","Jeep","Subaru","Toyota")

    println(carArray[0]) //access elements in the array with an index number encase in square brackets
    //here we access the first element at index 0

    carArray[0] = "Ford" //we can also change the value of the element and assign a new one

    println(carArray.size) //array size is 5

    if ("Jeep" in carArray){ //we can use the in operator to find if an element exists in an array
        println("This car exists!")
    }else{
        println("This car does not exist!")
    }

    //for loop (as a continuation of the Car array example)
    for (car in carArray){ //we can loop through an array using the "for loop" to get the elements in the array
        print("$car, ")
    }


    //same array loop concept for integers
    val loopNums = arrayOf(4, 6, 8, 5, 7, 8)

    for (lnum in loopNums){
        print("$lnum ")
    }

    //ranges in characters
    for (customLetter in 'a'..'z'){ //all letters including a and z
        print("$customLetter ")
    }
    println()

    //ranges in numbers
    for(customNum in 0..10){ //all numbers including 0 and 10
        print("$customNum ")
    }
    println()

    //break and continue in a range. refer to both above in the while loop
    for (customLetter in 'a'..'z'){
        if(customLetter == 'f'){
            continue //replace with break if need be
        }
        print("$customLetter ")
    }
    println()


    //functions
    println() //one of the main predefined functions

    //calling functions in the main function.
    //for the functions without any output in their body, they will not execute output unless you pass them through the println() function
    sum(10, 10)
    diff(10, 5)

    prod(5, 7) //this one will output only because the function body has a print function
    myFunc("David") //same to this one

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

    //return a range of elements in the list
    val myList = listOf("a", "b", "c", "d", "e")
    val indices = myList.indices  // Returns the range 0..4

    println(indices)

    iterateRangeWithSkip()
    whileLoopTestIndices()

    printSumWithUnit(5, 7)

    //instantiate the Book class
    val myBook = Book()

    //you can now use the instance to print out the properties of the class
    println(myBook.title)
    println(myBook.author)
    println(myBook.pages)

    //Person class
    val person1 = Person("David", 25) //First instance of the class as needed
    //no default values
    val person2 = Person("Carol", 21) //Second instance of class

    val hobby1 = Hobbies("eating")

    println("${person1.name} is ${person1.age} years old and likes ${hobby1.myHobby}.") //print them out
    println("${person2.name} is ${person2.age} years old and also likes ${hobby1.myHobby}.")

    //instantiate the MyEmployee class

    val projectManager = MyEmployee("Erica", "Bloom", 30, 1956)

    println("Our latest member of the board is ${projectManager.empFullName}. She is ${projectManager.empAge} years old," +
            " and has been working for the company for ${projectManager.yearsWorked} years. ${projectManager.allTheBest()}")

}

//functions are blocks of code that run when called/invoked by another part of the code
//you can pass data called parameters into a function
//you can have as many parameters as you wish

fun myFunc(firstName: String){
    println("$firstName Doe.")
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

fun iterateRangeWithSkip (){
    val myList = mutableListOf(16, 27, 81, 95, 57, 34, 77, 1, 55, 85, 23, 34)

    for (i in 0 until myList.size step 2){ //prevent access of an out-of-bounds element if we put 0..myList.size
        print("${myList[i]} ")
    }
    println()
}

fun whileLoopTestIndices(){
    val list = mutableListOf(56, 67, 23, 56, 77)
    var i = 0
    while (i<list.size){
        println("The element at $i is ${list[i]}.")
        i++
    }
}


fun printSumWithUnit(a: Int, b: Int): Unit { //Unit type can be omitted. since the return type is absent, it is this assumed to be Unit
        println("The sum of $a and $b is ${a + b}")
    }

//classes
//A class is a blueprint or a template for creating objects.
// It defines the properties (attributes) and behaviors (methods) that an object of that class can possess.
// Classes encapsulate data and functionality together, allowing you to create multiple instances (objects) based on the class definition.
// Classes are used for creating complex data structures and organizing code into reusable modules.
// They facilitate object-oriented programming principles like inheritance, polymorphism, and encapsulation.

class Book { //name starts with an upper case letter
            //this class has the default values set in the properties
    var pages = 320 //properties of the class initialized with values
    val title = "Best of the Rest"
    val author = "Robert Leeds"
}

//classes also have primary constructors
//these allow us to declare properties and initialize them when we instantiate an object
class Person (val name: String, val age: Int) //no default values set in the properties
class Hobbies (val myHobby: String)

//the init block
//since the primary constructor has no code other than properties and their data types
//we use an initializer block to make use of more logic from the properties
class MyEmployee(val fName: String, val lName: String, val yearsWorked: Int, val yearBorn: Int){
    //declaration of properties of a class need to always be in the class, not inside an init block
    val empFullName = "$fName $lName"
    val empAge: Int
    val currentYear = 2023

    init {
        empAge = currentYear - yearBorn
    }

    //you can also use functions inside a class, called member functions
    fun allTheBest(): String{
        return "All the best to $empFullName!"
    }

}//end class



