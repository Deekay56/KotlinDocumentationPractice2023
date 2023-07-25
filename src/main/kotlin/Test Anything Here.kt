fun main(){

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
    //in this code, all iterations are printed out before the continue statement
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
}