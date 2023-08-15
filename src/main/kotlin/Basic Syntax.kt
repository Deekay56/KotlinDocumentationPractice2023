/* A) NOTES */

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


 */


/* END OF NOTES */


/* B) COMMENTS */

//Comments are used in Kotlin code to either explain the code or make notes for future reference.

// <- This on the left is called an End of line comment. Used per line.

/*

Encasing this and the below two lines is a Multiline comment. It can be used as needed as long as its enclosed.
another sentence to show the M-Comment
another sentence to show the M-Comment

 */


/* END OF COMMENTS  */


/* C) THE MAIN FUNCTION */

/*
* This function is the start of every Kotlin program, and it controls program execution.
* It calls to other functions and classes to execute programs.
*
* */

fun main() {
    println("Hello World!") //most common beginner program
    println(23)

    /* 1) VARIABLES */

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

    /* 2) OPERATORS */

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

    /* 3) STRINGS */

    //a string is an array of characters
    //In Kotlin, by default, they are immutable.
    //when we declare a variable using var, like var a = "String",
    //it means we are creating a mutable variable a and initializing it with a string value "String."
    //The mutability here refers to the variable "a", and not the string itself.
    //You can change the value of the variable "a" to point to a different string,
    //but you cannot change the contents of the original string it was initially assigned.

    val myString = "Hello"

    println(myString)

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

    //accessing elements from a string
    for(i in myString.indices){
        println(myString[i])
    }

    //some examples of string properties
    val myStringProperties = "Jambalaya!"

    println(myStringProperties.length) //shows the length (a singular number) of the string

    println(myStringProperties[3]) //outputs the element (or letter in this case) at index 3

    println(myStringProperties.subSequence(0,3)) //outputs a section of the string from the index points chosen


    /* 4) TYPE CONVERSION */

    //changing the data typeof a variable to another type
    //others include toByte(), toShort(), toLong(), toFloat(), and toChar()
    val customInt = 55
    val customIntToDouble = customInt.toDouble() //this will print out 55.0
    println(customIntToDouble)


    /* 5) BOOLEANS */

    val boolNum1 = 5
    val boolNum2 = 6

    println(boolNum1>boolNum2)//will print "false"

    /* 6) CONTROL FLOW - IF-ELSE EXPRESSION */

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

    /* 7) CONTROL FLOW - WHEN-ELSE EXPRESSION */

    //when-else conditional, useful in a scenario of many if-elses
    //

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

    //another simple when-else conditional to check odd/even numbers
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

    //

    //another simple when-else conditional
    println("Type either \"Cheetah\" or \"Snail\" from the list to see their speed:")

    val customResult2 = when(readln().uppercase()){
        "CHEETAH"->"A cheetah's maximum speed is 130km/h!"
        "SNAIL"->"A snail's maximum speed is 0.048km/h!"
        else->"Please follow the instructions!"
    }
    println(customResult2)

    //when-else can also check the input value in a range
    println("Please enter any year between 1900 and 1959, and I will tell you the decade:")

    val yearInput = readln().toIntOrNull()

    if(yearInput != null) {
        val decade = when (yearInput) {
            in 1900..1909 -> "That was in the 1900s!"
            in 1910..1919 -> "That was in the 1910s!"
            in 1920..1929 -> "That was in the 1920s!"
            in 1930..1939 -> "That was in the 1930s!"
            in 1940..1949 -> "That was in the 1940s!"
            in 1950..1959 -> "That was in the 1950s!"
            else->"$yearInput is not in the range of years  requested!"
        }
        println(decade)
    }else{
        println("Invalid input!")
    }


    //when-else can also employ functions to carry the code needed to check for user input
        println("Enter a whole number to see if odd or even:")

        val myOddEvenInput = readln().toIntOrNull()

        if (myOddEvenInput != null) {
            val myOddEvenResult = when {
                oddNum(myOddEvenInput) -> "The number is odd!"
                evenNum(myOddEvenInput) -> "The number is even!"
                else -> "Neither even or odd!"
            }
            println(myOddEvenResult)
        }else{
            println("Invalid input!")
        }



    /* 8) CONTROL FLOW - WHILE LOOP */

    //while loop, executes code as long as the specified condition is true.
    //in this case, 0 will be printed, as well as all numbers until 5
    //Do not forget to increase the variable used in the condition, otherwise the loop will never end!
    //NOTE: use "var" to modify the changing value of the loop variable
    var whileLoopNumber = 0

    while (whileLoopNumber<=5){
        print(whileLoopNumber )
        whileLoopNumber++
    }

    /* 9) CONTROL FLOW - DO-WHILE LOOP */

    //a do-while loop will execute at least once, even if the condition checked is false.
    // in this case, 6 will be printed, and the loop quits.
    //Again, do not forget to increase the variable used in the condition otherwise the loop will never end!
    var doWhileLoopNumber = 6
    do {
        print(doWhileLoopNumber)
        doWhileLoopNumber++
    }while (doWhileLoopNumber<=5)


    /* 8 Add.) CONTROL FLOW - FOR LOOP */

    //the for loop is used to iterate over a collection of elements or a range of values.
    // It allows you to execute a block of code repeatedly, once for each element or value in the specified range.
    //the loop can work on ranges, arrays, strings, and collections.

    //for loop in an immutable list
    val myForLoopList = listOf('A','B','C')

    for (loopNumber in myForLoopList){
        print("$loopNumber ")
    }

    println()

    //for loop in a range
    for (looper in 1..5){
        print("$looper ")
    }

    println()

    //ranges in characters
    for (myLetter in 'a'..'z'){ //all letters including a and z
        print("$myLetter ")
    }

    println()

    //ranges in numbers
    for(customNum in 0..10){ //all numbers including 0 and 10
        print("$customNum ")
    }

    println()

    //break and continue in a range. refer to both above in the while loop
    for (mLetter in 'a'..'h'){
        if(mLetter == 'f'){
            continue //replace with break if need be
        }
        print("$mLetter ")
    }
    println()


    //for loop in a range with step-2 (can be any number)
    for (loopStepper in 1..10 step 2){
        print("$loopStepper ")
    }

    //for loop iterate downwards through a range
    //if you wish, you can also add the step to jump values
    for (downLooper in 'F' downTo 'A'){
        print("$downLooper ")
    }

    //for loop iterate with a condition to print only even numbers in the range
    for (evenCheckLooper in 1..10){
        if (evenCheckLooper % 2 == 0){
            print("$evenCheckLooper ")
        }
    }

    //for loop iterate a list using an index
    //We use the [] since the loop variable "index" is not looping through the elements themselves rather the index positions
    //It retrieves each element using the index and prints it out.
    val loopTestList = listOf(7, 6, 8, 3)

    for (index in loopTestList.indices){
        print("${loopTestList[index]} ")
    }

    //for loop iterate a list using the withIndex() function
    //to get both the index of the element and the value of the element
    val myAlphabetList = listOf('A', 'B', 'C', 'D')


    for((index, value) in myAlphabetList.withIndex()){
        println("The letter at index position $index is $value.")
    }

    //for loop iterate through a string
    //note you can also loop with an index (where you use the indices property)
    //note you can also use the withIndex() function

    val myStringToLoop = "Fantastic!"

    for (stringLooper in myStringToLoop){
        print("$stringLooper ")
    }

    /* 10) CONTROL FLOW - BREAK STATEMENT */

    //break statement, this will stop the loop at the point specified
    //in this case; the loop breaks after printing 2
    //NOTE: the placement of the break statement in relation to the print statement in a non-nested while loop does not affect the output
    //the value equal to the break statement will not be printed, only those before
    var breakLoopNumber = 0

    while (breakLoopNumber<=5){
        // if (breakLoopNumber == 3) break <- the break line can also be here
        print(breakLoopNumber )
        breakLoopNumber++
        if (breakLoopNumber == 3) break
    }

    println()
    println()

    /* 10 a) CONTROL FLOW - LABELLED BREAK STATEMENT */

    //The following is a simple demonstration of a LABELLED BREAK statement.

    //NOTE: The main difference between a normal 'break' and 'labelled break' is that the labelled break...
    //is best used in a nested loop or control structure
    // and allows you to break out of an outer loop based on a specific label, while regular break exits the innermost loop or control structure.
    //ALSO: labelled break is best used for a nested control structure, and not non-nested control structures, a break will be sufficient for that.

    //customLoop@ is a label placed before the for loop. It acts as a marker or identifier for the loop.
    //The outer loop iterates over the range 1..3, with the variable 'i' taking the values 1, 2, and 3.
    //Inside the outer loop, there is another nested loop that iterates over the range 1..3, with the variable j taking the values 1, 2, and 3.
    //The if statement checks that the value of j is equal to 3.
    //If j is equal to 3, the break@customLoop statement is executed.
    // It means that the program flow will break out of both the inner and outer loops, exiting the loop entirely.
    //If j is not equal to 3, the println("i=$i j=$j") statement is executed, which prints the values of i and j to the console.


    customLoop@for (i in 1..3){
        for(j in 1..3){
            if (j==3) {
                break@customLoop
            }
            println("i=$i j=$j")
        }
    }

    println()

    //Unlike the labelled break, the regular break, (also employed in the while loop above) only exits the loop (with variable j) where it is put in.
    //The outer loop (the loop controlled by the variable i) will continue executing for its remaining iterations.
    for (i in 1..3) {
        for (j in 1..3) {
            if (j == 3) {
                break
            }
            println("i=$i j=$j")
        }
    }

    println()


    /* 10 b) CONTROL FLOW - BREAK STATEMENT PLACEMENT */

    //IF the break statement appears before the print statement, then all characters will be printed up to 'k'
    //then the program will exit when the first 's' is reached, thus giving "Geek", and the program will exit
    val name = "GeeksforGeeks"
    for (i in name){
        if(i == 's') {
            break
        }
        print("$i")
    }

    println()
    println()

    //IF the break statement appears after the print statement, then all characters up to and including 's' will be printed
    //thus, the output will be 'Geeks' before the loop is terminated by the break statement.
    val name2 = "GeeksforGeeks"
    for (i in name2){
        print("$i")
        if(i == 's') {
            break
        }
    }

    println()
    println()

    //break statement in a while loop
    //output same no matter the placement of the break statement

    var whileLoopBreak  = 0
    while (whileLoopBreak<=3){
        print(whileLoopBreak)
        whileLoopBreak++
        if (whileLoopBreak == 1)break
    }

    println()
    println()

    /* 10 c) CONTROL FLOW - BREAK AND LABELLED BREAK FURTHER EXAMPLES */

    //break statement in a for loop
    //if break statement is before print statement, output will not include the value equal to the break statement
    //vice-versa if the break statement is after the print statement

    for (forLoopBreak in 0..3){
        if (forLoopBreak == 2) break
        print(forLoopBreak)
    }

    println()
    println()

    //break statement in a nested for loop
    //the break statement will stop each time for the inner loop when '2' is encountered.
    //then the code will go back to the outer loop for another iteration with the inner loop.
    //this will not break the outer loop

    for (nestedOuterLoop in 1..3){
        for (nestedInnerLoop in 1..5){
            println("$nestedOuterLoop $nestedInnerLoop")
            if (nestedInnerLoop == 2) break
        }
    }

    println()

    //labelled break statement in a nested for loop
    //this will allow the code to exit the inner and outer loop altogether, as compared to a regular break statement
    labelbreak@ for (nestedOuterLoop in 1..3){
        for (nestedInnerLoop in 1..5){
            println("$nestedOuterLoop $nestedInnerLoop")
            if (nestedInnerLoop == 2) break@labelbreak
        }
    }

    println()
    println()

    /* 11) CONTROL FLOW - CONTINUE STATEMENT */

    //continue statement, this will break one iteration IN THE LOOP, if a condition occurs, and then continues with the rest of the loop.
    //In this case,the code skips printing the value when the loop number is 4 and prints the value otherwise.

    var continueLoopNumber = 0

    while (continueLoopNumber<=5){
        if (continueLoopNumber == 4) {
            continueLoopNumber++
            continue
        }
        print(continueLoopNumber )
        continueLoopNumber++

    }

    println()
    println()

    //another version of unlabelled continue, using a character in the alphabet
    //note that the placement of the continue statement in relation to the print statement doesn't affect the output in a simple while loop
    //this is unlike for loops, where that may matter.

    var customLetter = 'A'

    while (customLetter<='F'){
        print(customLetter)
        customLetter++
        if (customLetter == 'C'){
            customLetter++
            continue
        }
    }

    println()
    println()

    //unlabelled continue statement in a simple for loop
    //The continue statement is placed before the print statement.
    //This means that when the condition forLoopSimpleContinue == 2 is true, the continue statement is executed.
    // This causes the loop to skip the print statement for that iteration.
    //all the other iterations after that are printed, in this case, its only 3.
    // Therefore, the value 2 is not printed in the output (0, 1, 3)

    for(forLoopSimpleContinue in 0..3){
        if (forLoopSimpleContinue == 2) continue
        println(forLoopSimpleContinue)
    }

    println()
    println()

    //unlabelled continue statement in a simple for loop
    //with the continue statement placed after the print statement
    //in this code, all iterations are printed out before the continue statement (0,1,2,3)
    //thus it has no effect on the output.

    for(forLoopSimpleContinue in 0..3){
        println(forLoopSimpleContinue)
        if (forLoopSimpleContinue == 2) continue
    }

    println()
    println()

    //unlabelled continue statement in a nested for loop, where the continue statement appears after the print statement
    //the continue statement within the inner loop doesn't affect the output
    //because all the inner loop iterations have been executed and printed before the continue statement has a chance to take effect.

    for (nestedForLoopOutContinue in 0..3){
        for (nestedForLoopInContinue in 0..3){
            println("$nestedForLoopOutContinue $nestedForLoopInContinue")
            if(nestedForLoopInContinue == 2) continue
        }
    }

    println()
    println()

    //unlabelled continue statement in a nested for loop, where the continue statement appears before the print statement
    //the continue statement will skip 2 for each iteration, but print all other values in the inner loop (0,1,3)
    //note that the continue statement inside the inner loop affects the printing of 2,and...
    //since 2 cannot be printed, its corresponding nestedForLoopOutContinue values in the outer loop also cannot be seen in the output.

    for (nestedForLoopOutContinue in 0..3){
        for (nestedForLoopInContinue in 0..3){
            if(nestedForLoopInContinue == 2) continue
            println("$nestedForLoopOutContinue $nestedForLoopInContinue")

        }
    }

    println()
    println()

    /* TO DO LABELLED CONTINUE LATER */


    /* RECAP OF BREAK AND CONTINUE STATEMENTS */

    //-> continue statement:

    //When encountered in a loop, it skips the remaining code inside the current iteration.
    //The loop then proceeds to the next iteration, and subsequent iterations are not affected.
    //It does not terminate the loop; it only affects the current iteration.

    //-> break statement:

    //When encountered in a loop, it immediately terminates the loop, regardless of whether the loop has completed all iterations or not.
    //The program continues with the code after the loop, skipping any remaining iterations.


    /* 12) ARRAYS */

    //arrays. store multiple values in a variable

    //NOTE: In most programming languages, arrays only hold elements of the same data type.
    //However, with Kotlin,arrays can hold elements with different data types because the arrays can be of type Array<Any>.
    //Since the arrayOf() function is used, the Kotlin compiler infers the type of the array to be Array<Any>
    //This means it can store elements of any type (Any is the root type in Kotlin).
    //It's important to note that this behavior is specific to Kotlin and may not be applicable in other programming languages.

    val myCustomArray = arrayOf("Ar","Se","Ti", 1)

    println()

    println(myCustomArray[3]) //to print out 1

    println()

    //Second array example, this time similar data types
    val carArray = arrayOf("Benz","Volvo","Jeep","Subaru","Toyota")

    println(carArray[0]) //access elements in the array with an index number encase in square brackets
    //here we access the first element at index 0, which is "Benz"

    carArray[0] = "Ford" //we can also change the value of the element and assign a new one

    println(carArray.size) //array size is 5.
    // size is a property of the array

    if ("Jeep" in carArray){ //we can use the in operator to find if an element exists in an array
        println("This car exists!")
    }else{
        println("This car does not exist!")
    }

    println()

    //for loop (as a continuation of the Car array example)
    for (car in carArray){ //we can loop through an array using the "for loop" to get the elements in the array
        print("$car, ")
    }

    println()

    //same array loop concept for integers
    val loopNums = arrayOf(4, 6, 8, 5, 7, 8)

    for (lnum in loopNums){
        print("$lnum ")
    }

    println()


    /* 13) NULL SAFETY CHECKS */

    println("Please enter a distance (miles) and I will tell you how many km it is:")

    val userChoice = readln().toDoubleOrNull()

    //NOTE: When working with user input, it's generally a good practice to check for nullability and handle cases where the input might be null.
    //This is because user input can be unpredictable, and it's essential to account for scenarios where the user might provide unexpected or invalid data.
    //Checking for nullability allows you to validate the input and ensure that the necessary data is present before proceeding with further calculations or operations.
    //It helps prevent potential runtime exceptions like NullPointerException and allows you to handle such cases gracefully.
    //By using techniques like null checks, safe call operators (?.), or the Elvis operator (?:),you can handle nullability in a way that suits your requirements.
    // This ensures that your code can handle different scenarios and provides appropriate feedback or takes alternative actions when necessary.

    if(userChoice!=null) { //this is the null check
        val distanceInMiles = userChoice * 1.60934

        println("$userChoice miles is equal to $distanceInMiles km!")
    }
    else{
        println("The input is invalid!")
    }

    //another null safety check
    //output will be "null" since the distanceMetres is a potential null variable

    //AGAIN: Null pointer exceptions occur when you try to access or perform operations on a variable or object that is null (has no value assigned to it).
    //These exceptions can cause program crashes or unexpected behavior.
    //By using null safety checks, you can avoid null pointer exceptions by...
    //explicitly checking if a variable is null before accessing its properties or invoking its methods.
    // If the variable is null, the null safety check allows the program to gracefully handle the situation without crashing or producing errors.

    val distanceMetres: Int? = null

    val distanceKm = distanceMetres?.div(1000)

    println(distanceKm)


    /* 14) --- FUNCTIONS --- */

    /* Note all function calls in this section correspond to the functions outside the main function section. */

    //Introduction and explanation of what functions are can be found after the main function section.

    //sample built-in function
    val numOne = 12
    val numTwo = 4

    //rem() is a function that gives the remainder when a number is divided by another
    //in this case the remainder is 0
    println(numOne.rem(numTwo))

    println() //one of the main predefined functions. prints out whatever is encased in the parentheses. jumps a line in the code.

    //calling functions in the main function.
    //for the functions without any output in their body, they will not execute output unless you pass them through the println() function
    sum(10, 10) //this is a function call
    diff(10, 5)

    prod(5, 7) //this one will output only because the function body has a print function


    myFunc("David") //same to this one

    greetings() //the function being called already has a named string parameter "David", so it will output that.
               //one can however invoke the function with another value,
               // and that value will replace the argument in the function's parentheses.

    myForLoop()

    //Function Literals
    //These are functions that are not declared, but passed as expressions

    //they include anonymous functions and lambda expressions
    //these are best used in the main() function


    //a) anonymous function example

    val areaSquare = fun(l:Int, h:Int):Int {
        return l*h
    }

    println("The area of this square is ${areaSquare(6,7)} squared km.")

    //or you can also remove the return statement
    val perimeterRectangle = fun(rectLength:Int, rectHeight:Int): Int = 2*(rectLength+rectHeight)

    val myPerimeterRectangle = perimeterRectangle(5, 7)

    println("The perimeter of the rectangle is:"+myPerimeterRectangle+"meters.")


    //a second example of an anonymous function
    val checkEvenOrOdd = fun(cNum: Int): String{
        return if (cNum % 2 == 0)
            "Number is even!"
        else
            "Number is odd!"
    }

    val checkResult = checkEvenOrOdd(6)

    println(checkResult)


    //b) lambda expression example
    //similar to anon function, but syntax is shorter and more concise
    //recommended when creating a function with only one expression
    //syntax is usually val lName: dataType = {argument(s)->body}

    val perimeterSquare = {l:Int-> 4*l} //the expression itself is in the brackets {}
                                       //the return type is optional since...
                                      //...Kotlin can use type inference to deduce the data type of the return value

    println("The perimeter of this square is ${perimeterSquare(6)}km.")

    //second lambda expression example
    val testName = {
        println("Dave")
    }

    testName() //also testName.invoke()

    //third lambda expression example
    val calcSum = {first:Int, second:Int -> first+second}

    val calcSumResult = calcSum(6,7)

    println(calcSumResult)

    //one last point to note:
    //In an anonymous function, you need to use the return keyword explicitly.
    //In a lambda expression, the last expression is automatically returned as the result of the lambda.


    //Higher-order functions
    //Simply put, these are functions that are passed as parameters or can pass other functions.
    //Instead of data types as the function parameters, we can pass anon functions or lambdas
    //Mostly, lambdas will be passed as function parameters in Kotlin functions


    //a) passing a lambda expression returning Unit

    //note the working is as follows:
    //a lambda expression is defined and placed it inside a variable l
    //then the variable is passed to a higher-order function higherFunc() that executes the lambda.
    //The end result is that "Hello" will be printed to the console when you run the program.

    val l = {print("Hello, ")} //the lambda expression

    fun higherFunc(lmbd:()->Unit){  //a higher-order function that has one parameter lmbd
                                   // this is the receiving parameter, and () indicates that it does not accept arguments
                                  //Unit shows that the function does not return any value
        lmbd()
    }

    higherFunc(l)

    val p = { println("Girl :)") }

    p()

    //b) passing a lambda expression returning a value (Int, String, etc)
    val secondL = {custInt1: Int, custInt2: Int -> custInt1+custInt2} //the lambda expression

    fun secondHigherFunc(lmbd:(Int, Int)->Int){ //the higher-order function accepts one parameter lmbd
                                                //inside the lmbd(), it accepts two Int arguments

        val funcResult = lmbd(3,5)
        println("The sum is $funcResult")
    }

    secondHigherFunc(secondL)

    /* Higher-Order functions...to be cont... */


    //calling the myStudent() function with named arguments, note that the order of the arguments is changed
    myStudent(sRollNo = 565, sGrade = "Grade 7", sName = "John" )

    //Recursion in Functions

    //A simple recursive function call. Function refer outside main function
    callMe(5)

    //Recursion as a means of finding the factorial of a number.
    println("The factorial of this number is: "+myFactorial(3))



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



    /* 15) COLLECTIONS */

    //used to store and manipulate groups of objects or data

    //a) Lists - ordered collections that allow duplicates

    //example 1
    //val fruits  = listOf("apple", "banana", "mango")

    //access the list element "apple"





    //b) Sets - unordered collections of unique elements
    //c) Maps - Collections of key-value pairs, where each key is unique
    //d) Arrays - Fixed-size collections of elements with a specific type
    //e) Sequences - Lazily evaluated collections of elements that can be processed in a pipeline.











    /* Classes */
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




//functions are blocks of code that run when called/invoked by another part of the code.
//why functions? modularity (breakable),  reusable, abstraction of complex logic, and also improved readability of code.
//you can pass data called parameters into a function, also called arguments.
//you can have as many parameters as you wish.
//remember parameters are read-only or val by default, so don't use val or val, as explained further below.


//NOTE: Functions DO NOT have constructors, and only have parameters e.g., myFun(a:Char, b: Int)
//NOTE: When declaring function parameters, you cannot use the val or val keywords.
//The val keyword is used to declare properties (variables) within a CLASS, not for function parameters.

//functions can also return values, and also encapsulate logic into reusable blocks of code.

//functions can be said, in general, to be either user-defined or built-in.

//examples of built-in functions include main(), arrayOf(), sum() and println()



fun myFunc(firstName: String){
    println("$firstName Doe.")
}


//return statement
//functions have the ability to return values, which are passed back to where the function was evoked.
//for it to work, we need to put a return type to the function header
//and also a return statement in the function body

fun sum(a: Int, b: Int): Int { //simple function with two parameters and an Int return type, and a body
    return a + b
}

fun diff(a: Int, b: Int) = a-b //simple function with two parameters but doesn't have a body
                              // this is a single expression function, where the body is the expression

fun prod(a:Int, b:Int){ //simple function that does not return anything, or a void function.
                       // it simply prints out a product value
    println("The product is ${a*b}")
}

//when calling a function with arguments in the main() function, the arguments should be passed in the order defined in the function
//If you're not using named arguments, then the arguments should be passed in the order they are defined in the function.
//This is the default behavior in Kotlin.
//If you're using named arguments, then you can pass the arguments in any order by explicitly specifying the parameter names in the function call.

//example below

fun myStudent( sName: String= "", sGrade: String = "Grade 5" , sRollNo: Int = 12 ) {

    println("The name of the student is: $sName")
    println("The grade of the student is: $sGrade")
    println("The roll no of the student is: $sRollNo")
} //end of function, check the call in the main() function


//functions can be simplified further through literals
//these are unnamed functions that can be treated as a value.
//they include anonymous functions and lambda expressions
//these are best used in the main() function, check above in main() function...


//a function can have named arguments.
// these give values to the arguments if none are given during a function call

fun greetings(gName: String = "David"){
    println("Hello $gName")
}

//Function Recursion

//A function that calls itself is a recursive function
//The process of repetition id called recursion
//When a function os called, there is either a normal call or a recursive call.
//Since most standard function calls are normal, this section focuses on how a recursive call works.

//Every recursive function should have a condition for termination otherwise there is an infinite loop.

//The code below defines a function called callMe, which takes an integer parameter "a"
//It prints the value of the parameter "a"
//It checks if "a" is greater than 0.
//If "a" is greater than 0, it calls the callMe function again with the argument a-1.
// This is a recursive call, meaning the function calls itself with a smaller value of "a".
//The recursive call continues until a becomes 0 or negative.
//Each time the function is called recursively, it prints the value of "a" again.

//The main function then calls the callMe function with the integer argument "5" or whatever deems fit.
//So, when the main function is called, it will invoke the callMe function with 5.
//The callMe function will print 5, then call itself again with a-1, which is 4. This process will repeat until a becomes 0, resulting in the output: 5,4,3,2,1,0.

fun callMe(a: Int){

    print("$a ")

    if (a>0) {
        callMe(a-1)
    }

//print("$a ") //note that if the print statement were to be put here after the if condition
//then the output would be in reverse from 0,1,2,3,4,5
//this would be because the function, after making all the recursive calls from the if statement...
//...would now return back to all its previous calls from 0 to 5, effected in the print statement
//in other concise words, when the base case is reached and callMe(0) is executed, it prints the value 0.
//At this point, the base case does not make any further recursive calls, so it returns directly to the previous instance of the function that called it,
//which is callMe(1). The value 0 is printed, and callMe(1) continues its execution from where it left off, after the recursive call.
//Then, the same process repeats for callMe(1) and its recursive call to callMe(0).
//Once callMe(1) reaches its base case and prints 1, it returns to the previous instance callMe(2).
//This process continues, with each recursive call returning to the previous instance and...
//...printing its respective value until the original function call callMe(5) is reached and completes the execution.
//So, in summary after the base case (0 in this example) is printed,
//the function instances that were called in the recursion process print their respective values one by one as they return from their recursive calls.
//This process continues until the initial function call completes...
//..resulting in the reverse printing of values from the base case back to the original call.

}


//Recursion as a means of finding the factorial of a number.


// -> this first code will not work.
//the function myFactorial does not have a base case, which is a condition to stop the recursion.
//the function myFactorial will keep calling itself with a smaller variable, down and past 0 and into infinity.
//This will result in an infinite loop and eventually cause a "StackOverflowError" because there is no base case to stop the recursion.
//The base case is essential to stop the recursion and prevent infinite loops.

/*
fun myFactorial(factorialNum: Int):Int{

    return factorialNum * myFactorial(factorialNum-1)
}

fun main(){
    println("The factorial of this number is: "+myFactorial(5))
}

*/

// -> this second code will work
//the issue from the first code is fixed by adding a base case: if(factorialNum == 1) factorialNum.toLong().
//When the factorialNum is equal to 1, the function simply returns 1, and the recursion stops.
//This way, the function can correctly calculate the factorial of a given number...
//...by repeatedly multiplying it with smaller factorial values until it reaches the base case.
//the line factorialNum * myFactorial(factorialNum - 1) results in a function call with a number one less than the current one.
//This is a crucial part of recursion because it breaks down the original problem into smaller, more manageable sub-problems.

/*

Let's find the factorial of 3 using this code:

We call the myFactorial function with the argument 3.
The function checks the base case: factorialNum == 1. Since factorialNum is 3, it does not equal 1, so we move to the else part.
In the else part, we have factorialNum * myFactorial(factorialNum - 1). Here, factorialNum is 3. So we calculate 3 * myFactorial(3 - 1).
We now have to calculate myFactorial(2). We call the myFactorial function again with the argument 2.
The function checks the base case: factorialNum == 1. Since factorialNum is 2, it does not equal 1, so we move to the else part.
In the else part, we have factorialNum * myFactorial(factorialNum - 1). Here, factorialNum is 2. So we calculate 2 * myFactorial(2 - 1).
We now have to calculate myFactorial(1). We call the myFactorial function again with the argument 1.
The function checks the base case: factorialNum == 1. Since factorialNum is 1, it equals 1. So the function returns 1.
Now, we have the value of myFactorial(1), which is 1. We go back to the previous step where we calculated 2 * myFactorial(2 - 1). Replace myFactorial(1) with 1, so it becomes 2 * 1, which equals 2.
Now, we have the value of myFactorial(2), which is 2. We go back to the previous step where we calculated 3 * myFactorial(3 - 1). Replace myFactorial(2) with 2, so it becomes 3 * 2, which equals 6.

*/

fun myFactorial(factorialNum: Int):Long{

    //the base case to prevent infinite loop
    return if(factorialNum == 1) factorialNum.toLong()

    else

        factorialNum * myFactorial(factorialNum-1)
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

//functions used in the when-else section of code to check for odd or even numbers from user input
fun oddNum(x: Int) = x%2 != 0
fun evenNum(x: Int) = x%2 == 0

//end of functions section



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


class Square (height: Double,length: Double){  //a simple class to give the perimeter of a Square when called in the main function.
    // Classes have first-letter caps
    var perimeter = (height + length) * 2
}


//MyFamily class
class MyFamily(val name: String, val age: Int){

    val yearBorn: Int

    //all properties to be accessed outside the class need to be declared outside the init block
    //If you place the yearBorn property inside the init block...
    //...it will be a local variable and not accessible outside the init block or from other parts of the class.
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

