/* A) COMMENTS */

// end of line comment. used per line.

/*
multiline comment. can be used as needed as long as its enclosed.
another sentence to show.
another sentence to show
 */

/* B) MISCELLANEOUS NOTES */

/* Kotlin is statically typed, meaning the code is continuously compiled for errors before execution.
It uses less code and supports null safety.
Kotlin's variables are non-null by default, and must hold a value.
Kotlin is interoperable with Java, as it runs on JVM.
It supports higher-order functions.
Kotlin has very fast compilation time.
Kotlin is tool-friendly, and major IDEs like IntelliJ IDEA, Eclipse, and Android Studio can run it.

An expression consists of variables, methods and operators to produce a single value.
The following are not expressions: variable declaration, value assignment, and class declaration.
All functions are expressions, since they return at least a value of Unit.

A statement is any expression for an action to be carried out.
Variable declarations are statements, as are variable initializations, e.g., val x = 2
You can have more than one statement in a line, like, val x = 2; val y = "why"

A block any piece of code enclosed by curly brackets. All functions are code blocks.
Any variable declared at the head of a block is accessible throughout the block,
unless another one with the same name is declared inside the block

A variable exists only inside the block of code where it has been declared.
Naming variables should follow the lowerCamelCase format.

var badVariable = 9 //variables can be declared at the top level, or globally, they will be accessed anywhere within the code.
This is not encouraged.





END OF MISC NOTES  */

/* C) MAIN FUNCTION */
/*
* This function is the start of every Kotlin program, and it controls program execution.
* It calls to other functions and classes to execute programs.
*
* */

fun main() {
    println("Hello World!") //most common beginner program
    println(23)

    /* VARIABLES */

    //basic variables and their data types
    //kotlin automatically infers the data types once the value is given for a variable

    val a = 1 //integer, same as val a:Int = 1,has 32 bits
    val b = "Hello" //string, same as val b:String = "Hello"
    val c = true //or false, same as val c:Boolean = true, store true or false values
    val d = 0.00 //double, same as val d:Double = 0.00, store decimal values
    val e = 'A' //char, for a single character, stores single letters A-Z, or a-z, or numbers 0-9
    val f = 5.66F //floating point decimals, to 6 or 7 places
    val g = 60L //long number, 64 bits to the 32 bits of Int

    //let's use these variables above by simply printing them out
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)

    //null and non-null variables
    val myNonNullVariable = "Not Null" //this will output a string value.
                                       // This is also val myNonNullVariable: String = "Not Null"
    val myNullVariable: String? = null //this will output "null" as a default to show that there is no value
                                       //also note that a nullable variable can be any type, e.g., Boolean? Char?

    println(myNonNullVariable)
    println(myNullVariable)

    //sample type conversion
    val myNum = 5

    val myNumToChar = myNum.toChar() //will give the ASCII code
    val myNumToString  = myNum.toString() //will give the string representation of 5, which is still 5.
    val myNumToDouble = myNum.toDouble() //will give 5.0


    println(myNum)
    println(myNumToChar)
    println(myNumToString)
    println(myNumToDouble)

    //assignment operators. need to use the "var" and NOT "val" keyword to reassign
    var numToSum = 5 //+= others are -=, *=, /=, %=, and a simple =
    numToSum+=2
    println(numToSum)

    // comparison/relational operators for comparing values
    val comparisonNum1 = 5
    val comparisonNum2 = 3

    if (comparisonNum1 != comparisonNum2){ //this is the "not equal" to operator, both variables are equal in this case
                                          //others include ==, >, >=, <=, and <
        println("Not Equal")
    }else {
        println("Equal")
    }

    //unary operators add to or subtract from a variable. they only work on mutable variables
    var unaryVar = 5
    unaryVar++
    unaryVar--

    println(unaryVar)

    //logical operators determine logic between variables/values
    //others include "&&" called the logical AND,
    // as well as the "!" called the logical NOT
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
    // which means string 1 is lexicographically lesser than string 2.
    //what that means is that string 1 has a letter that appears first in the alphabet,
    // which is the "a" is Bastards, as compared to the "e" in Basterds


    //find a string within a string
    println(customString1.indexOf("Bastards")) // the B in "Bastards" occurs on the 12th index position

    //string templates 1 (interpolation)
    println("$customString1 is interpolated with $customString2.")


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

    //Type Conversion
    //changing the data typeof a variable to another type
    //others include toByte(), toShort(), toLong(), toFloat(), and toChar()
    val customInt = 55
    val customIntToDouble = customInt.toDouble() //this will print out 55.0
    println(customIntToDouble)


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

    //simple if-else conditional utilizing a Map
    val cityToCountry = mutableMapOf("Nairobi" to "Kenya", "Kigali" to "Rwanda")

    println("Choose a city between \"Nairobi\" or \"Kigali\" to see the country:")

    val userInput = readln()

    val custCountry = cityToCountry[userInput] //retrieve the value from the key, which is the city in this map

    if(custCountry!=null){ //if the value of the input is not null, or invalid
        println("$userInput is the capital of $custCountry.")
    }else{
        println("$userInput is not in the list!")
    }


    //fairly complex nested-if expression
    println("Enter any three numbers and I will tell you the largest to the smallest:")

    val num1 = readln().toIntOrNull()
    val num2 = readln().toIntOrNull()
    val num3 = readln().toIntOrNull()

    if (num1 == null || num2 == null || num3 == null){
        println("Please input three valid numbers!")
    }else {

        if (num1 > num2 && num2 > num3) {
            println("Looks like $num1 is the largest of the bunch, followed by $num2, and then $num3!!")

        } else if (num1 > num3 && num3 > num2) {
            println("Looks like $num1 is the largest of the bunch, followed by $num3, and then $num2!")

        } else if (num2 > num1 && num1 > num3) {
            println("Looks like $num2 is the largest of the bunch, followed by $num1, and then $num3!")

        } else if (num2 > num3 && num3 > num1) {
            println("Looks like $num2 is the largest of the bunch, followed by $num3, and then $num1!")

        } else if (num3 > num1 && num1 > num2) {
            println("Looks like $num3 is the largest of the bunch, followed by $num1, and then $num2!")

        } else if (num3 > num2 && num2 > num1) {
            println("Looks like $num3 is the largest of the bunch, followed by $num2, and then $num1!")
        }
    }


    //when-else conditional, useful in a scenario of many if-elses
    println("Please choose from a list of Dad, Mum, Big Bro, Small Bro, and Carol to find out their names:")

    //val familyMember = readln() //can skip this and use the readln() function directly in the "when" clause

    val whichOne = when (readln()){
        "Dad"->"Dad's name is Jack."
        "Mum"->"Mum's name is Maria."
        "Big Bro"->"Big Bro's name is David."
        "Small Bro"->"Small Bro's name is Sam."
        "Siz"->"Siz's name is Grace."

        else->"Invalid name. Choose from that list."
    }
    println(whichOne)

    //when-else conditional for a simple mutable list
    val alphabetList = mutableListOf("A", "B", "C", "D", "E")

    println("Please enter an alphabet among A, B, C, D, and E to see what they mean:")

    val myInput = readln() //get user input

    //the uppercase(Locale.getDefault()) is used to render the input non-case sensitive

    val alphabetResult = when (alphabetList.indexOf(myInput.uppercase())){
        0->"A represents an apple!"
        1->"B represents a boy!"
        2->"C represents a church!"
        3->"D represents an dog!"
        4->"E represents an egg!"
        else->"Sorry, we cannot find $myInput in the list."
    }
    println(alphabetResult)

    //another simple when-else conditional
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

    //another simple when-else conditional
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

    //another simple when-else conditional
    println("Enter any whole number:")

    val input = readln().toLongOrNull() //converts input into long number, or null otherwise
    //note the long number, as the user might enter a number bigger than INT limits


    val customResult = when{
        input == null ->"Invalid input, enter a whole number!" //when the input cannot be converted to a whole integer
        // null represents the absence of a valid value,
        // so if you put a string, then this line will be executed
        input % 2L == 0L ->"The number is even!" //by default, no need for another line for odd, also LONG number
        // since the only other option is odd
        else->"The number is odd!"
    }
    println(customResult)


    //another simple when-else conditional
    println("Type either \"Cheetah\" or \"Snail\" from the list to see their speed:")

    val customResult2 = when(readln().uppercase()){
        "CHEETAH"->"A cheetah's maximum speed is 130km/h!"
        "SNAIL"->"A snail's maximum speed is 0.048km/h!"
        else->"Please follow the instructions!"
    }
    println(customResult2)




    //while loop, executes code as long as the specified condition is true.
    //in this case, 0 will be printed, as well as all numbers until 5
    //Do not forget to increase the variable used in the condition, otherwise the loop will never end!
    var whileLoopNumber = 0

    while (whileLoopNumber<=5){
        print(whileLoopNumber )
        whileLoopNumber++
    }

    //a do-while loop will execute at least once, even if the condition checked is false.
    // in this case, 6 will be printed, and the loop quits.
    //Again, do not forget to increase the variable used in the condition otherwise the loop will never end!
    var doWhileLoopNumber = 6
    do {
        print(doWhileLoopNumber)
        doWhileLoopNumber++
    }while (doWhileLoopNumber<=5)

    //break statement, this will stop the loop at the point specified
    //in this case; the loop breaks after printing 2
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
    for (myLetter in 'a'..'z'){ //all letters including a and z
        print("$myLetter ")
    }

    //ranges in numbers
    for(customNum in 0..10){ //all numbers including 0 and 10
        print("$customNum ")
    }
    println()

    //break and continue in a range. refer to both above in the while loop
    for (mLetter in 'a'..'z'){
        if(mLetter == 'f'){
            continue //replace with break if need be
        }
        print("$mLetter ")
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


    /* Class Instantiations */

    //Book Class
    val myBook = Book()

    //you can now use the instance to print out the properties of the class
    println(myBook.title)
    println(myBook.author)
    println(myBook.pages)

    //Person class
    val person1 = Person("David", 25) //First instance of the class as needed
    //no default values
    val person2 = Person("Carol", 21) //Second instance of class

    //Hobbies Class
    val hobby1 = Hobbies("eating")

    println("${person1.name} is ${person1.age} years old and likes ${hobby1.myHobby}.") //print them out
    println("${person2.name} is ${person2.age} years old and also likes ${hobby1.myHobby}.")


    //MyEmployee Class

    val projectManager = MyEmployee("Erica", "Bloom", 30, 1956)

    println("Our latest member of the board is ${projectManager.empFullName}. She is ${projectManager.empAge} years old," +
            " and has been working for the company for ${projectManager.yearsWorked} years. ${projectManager.allTheBest()}")


    //MyFamily class
    val dad = MyFamily("James", 56)

    println("${dad.name} is ${dad.age} years old. He was born in ${dad.yearBorn}.")

    //instantiate the MySubclass subclass to print out the inherited variable/property from the superclass
    MySubClass().printSuperVariable()

    //instantiate the MySubclass subclass to print out the inherited function from the superclass
    MySubClass().superFunction()

    val customBrand1 = CarModel("Toyota", "Camry")

    customBrand1.yearOfBrand(year = 2003)
    customBrand1.modelType()


//-------------END OF MAIN FUNCTION-------------------------------------------------------------------------------------------------------------------------//

}


//functions are blocks of code that run when called/invoked by another part of the code
//you can pass data called parameters into a function
//you can have as many parameters as you wish
//remember parameters are read-only or val by default, so don't use val or val, as explained further below.

//NOTE: Functions DO NOT have constructors, and only have parameters e.g., myFun(a:Char, b: Int)
//NOTE: When declaring function parameters, you cannot use the val or val keywords.
//The val keyword is used to declare properties (variables) within a CLASS, not for function parameters.

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


//this function shows a when-else statement, which is useful as a more efficient alternative for if-else,
// especially if the if-else has many conditions


//CAVEAT: small lesson on how the code works

/* in a simple range of elements from 0-x */
//the "until" operator gives the range of elements from index 0 and excludes the last element in the range x
//the ".." operator gives the range of elements from index 0 to the last element x

/* in the code in question in the list */
//the range 0 until daysOfWeek.size includes indices 0 to 6, each for a day in the list, representing all the elements in the list
//It does not include index 7, which is daysOfWeek.size

//The range 0..daysOfWeek.size includes the indices 0 to 7
//This is to mean all the indices 0-6, as well as index 7 (daysOfWeek.size) which is the size of the list are covered.
//Since the daysOfWeek list has 7 elements (indices 0 to 6), using 0..daysOfWeek.size will include an out-of-bounds index due to the invalid index 7

//To iterate over the valid indices of the daysOfWeek list, you should use 0 until daysOfWeek.size, which includes indices 0 to 6, representing all the elements in the list.

//One could also use daysOfWeek.indices is a PROPERTY of the List interface in Kotlin.
//It returns a range of valid indices for the list.
//In this case, it would return the range 0 until daysOfWeek.size, which includes all the valid indices for the daysOfWeek list.
//For simplicity purposes, we shall employ that for this code :)

fun myWhenElse(){
    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println("Enter a day of the week:")
    val input = readln()
    return when (daysOfWeek.indexOf(input)){
        in daysOfWeek.indices -> println("You have entered ${daysOfWeek[daysOfWeek.indexOf(input)]}!")
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

//Look at the function below:

/*

fun printSumWithUnit(a: Int, b: Int): Unit { //Unit type can be omitted. since the return type is absent, it is this assumed to be Unit

        println("The sum of $a and $b is ${a + b}")
   }

   //Hence the correct function below...

*/

fun printSumWithUnit(a: Int, b: Int) {
    println("The sum of $a and $b is ${a + b}")
}

//CLASSES:

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

//classes also have primary constructors, which are the brackets after the class name
//these allow us to declare properties and initialize them when we instantiate an object

//NOTE: In a class, you need to use the val or var keywords before the parameters in the primary constructor declaration.
// This is to make constructor parameters accessible as PROPERTIES within the class
// This allows you to access and use the values throughout the class.

//WITHOUT the val or var keywords before the constructor parameters, the parameters will not be considered properties of the class.
//Instead, they will be treated as local variables within the primary constructor.
//This means you won't be able to access or use these values outside the constructor.
//Example class MyClass (val a:Int, x:Int) ..x is only a local variable, unlike a which is a class property

class Person (val name: String, val age: Int) //no default values set in the properties


class Hobbies (val myHobby: String)

//Look at this class below.

//We know that class constructors contain properties which need to use the val/var keywords in order to be accessed as properties within the class or outside
//The class below shows a few modifications to show how Kotlin handles data

//One can see that fName, lName, and yearBorn do not have val/var keywords
//This means that unlike typical class properties in the constructor, they are not accessed outside the class directly, making them local variables.
//They are only used to initialize the "empFullName" property but are not stored as separate properties themselves.
//This is in contrast to the yearsWorked, which is directly accessed as a property in the main function after the class has been instantiated.

//Also note currentYear is set as PRIVATE.
//Class properties that have been set to "private" demonstrate the use of data encapsulation in Kotlin.
//Encapsulation is an object-oriented programming principle that aims to bundle data and the methods that operate on that data together into a class.
//One aspect of encapsulation is controlling access to the data members of a class.
//By making currentYear private, one is able you restrict direct access to these properties from outside the class.
//This allows you to have better control over how these properties are accessed and modified.
//When a property is private, it can only be accessed within the class itself.
//In this class code, since you are not directly accessing this property outside the class, you can make them private to enforce encapsulation and prevent unintended modification.


class MyEmployee(fName: String, lName: String, val yearsWorked: Int, yearBorn: Int){
    //declaration of properties of a class needs to ALWAYS be in the class, not inside an init block or member function
    val empFullName = "$fName $lName"
    val empAge: Int
    private val currentYear = 2023

    //the init block
    // since the primary constructor has no code other than properties and their data types
    // we use an initializer block to make use of more logic from the properties

    init {
        empAge = currentYear - yearBorn
    }

    //you can also use functions inside a class, called member functions
    fun allTheBest(): String{
        return "All the best to $empFullName!"
    }

}//end class


//MyFamily class
class MyFamily(val name: String, val age: Int){

    val yearBorn: Int
    //all properties to be accessed outside the class need to be declared outside the init block
    //If you place the yearBorn property inside the init block,
    // it will be a local variable and not accessible outside the init block or from other parts of the class.
    // The yearBorn will be limited in scope to the init block,
    // and you won't be able to access it in the main function or anywhere else in the class.
    init {
        val currentYear = 2023
        yearBorn = currentYear - age
    }


}//end class

//simple case of inheritance between classes

//class being inherited from
open class MySuperClass{
    val superVariable = "This is a superclass variable that can be inherited by other classes."

    fun superFunction(){
        println("This is a superclass function that can be inherited by other classes.")
    }
}

//class inheriting (properties) from another class
class MySubClass: MySuperClass(){
    fun printSuperVariable(){
        println(superVariable)
    }
} //end class


//another example of class inheritance
open class CarBrand (val brand: String){

    //In functions, parameters are read-only (val) by default,
    // meaning you can't reassign new values to them within the function.
    // you don't need to explicitly use the val keyword when defining function parameters.

    fun yearOfBrand(year: Int){ //so don't use "val year", just year

        print("$brand had a big year in $year.")
    }

}

class CarModel(brand: String, private val model: String): CarBrand(brand){
    fun modelType(){
        println("$brand's model that year, the $model, was very popular.")
    }

}//end class

