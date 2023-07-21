fun main(){

    //unlabelled continue statement in a simple for loop
    //The continue statement is placed before the print statement.
    //This means that when the condition forLoopSimpleContinue == 2 is true, the continue statement is executed.
    // This causes the loop to skip the print statement for that iteration.
    // Therefore, the value 2 is not printed in the output (0, 1, 3)

    for(forLoopSimpleContinue in 0..3){
        if (forLoopSimpleContinue == 2) continue
        print(forLoopSimpleContinue)
    }

    println()
    println()

    //unlabelled continue statement in a simple for loop
    //The continue statement is placed after the print statement.
    //This means that the print statement is executed before the continue statement is encountered.
    //Therefore, the value 2 is printed in the output (0, 1, 2, 3)

    for(forLoopSimpleContinue in 0..3){
        print(forLoopSimpleContinue)
        if (forLoopSimpleContinue == 2) continue
    }

    println()
    println()

    //unlabelled continue statement in a nested for loop
    //this will only skip the iteration for the inner loop
    //when the value of nestedForLoopInContinue is 2 the continue statement is executed.
    //which only skips that particular iteration of the inner loop.
    //the outer loop continues unaffected.

    for (nestedForLoopOutContinue in 0..3){
        for (nestedForLoopInContinue in 0..3){
            println("$nestedForLoopOutContinue $nestedForLoopInContinue")
            if(nestedForLoopInContinue == 2) continue
        }
    }

    println()
    println()

    //labelled continue statement in a nested for loop
    //this will only skip all iterations for both the inner and outer loops
    //When the value of nestedForLoopInContinue is 2, the labelled continue statement (continue@label) is executed
    //which causes the program to skip all remaining iterations of both the inner and outer loops labeled with "label."

    label@ for (nestedForLoopOutContinue in 0..3){
        for (nestedForLoopInContinue in 0..3){
            println("$nestedForLoopOutContinue $nestedForLoopInContinue")
            if(nestedForLoopInContinue == 2) continue@label
        }
    }

    println()
    println()

    //unlabelled continue for a simple while-loop, continue statement after the print statement

    //the "if" statement comes after the println(continueWhileLoop) and continueWhileLoop++ statements.
    //As a result, the println and increment operations are executed...
    //...before checking if continueWhileLoop is equal to the variable in question and the continue statement is encountered.
    //As such, the output below will be 0,1,2,3
    //In other words, since continueWhileLoopA is never 0 at this point (it is initialized with 0 and then immediately incremented),
    //the if condition will never be true, and the continue statement will never be executed.

    var continueWhileLoopA = 0

    while (continueWhileLoopA<=3){
        println(continueWhileLoopA)
        continueWhileLoopA++
        if (continueWhileLoopA == 0) continue
    }

    println()
    println()

    ///unlabelled continue for a simple while-loop, continue statement after the print statement

    //continueWhileLoopB is 0, and the loop enters its first iteration.
    //The loop checks if continueWhileLoopB is equal to 1. Since it is not (it is 0), the if condition is not satisfied, and the print statement is executed, printing 0.
    //continueWhileLoopB is incremented to 1.
    //The loop starts its second iteration.
    //Now continueWhileLoopB is 1, and the loop checks if it is equal to 1. The condition is satisfied, and the continue statement is executed.
    //The continue statement causes the loop to skip the rest of the current iteration, which means the print statement is skipped.
    //The loop proceeds to the next iteration, which doesn't happen in this case because the continue statement jumped out of the loop, effectively terminating it.

    var continueWhileLoopB = 0

    while (continueWhileLoopB<=3){
        if (continueWhileLoopB == 1) continue
        println(continueWhileLoopB)
        continueWhileLoopB++
    }

    println()
    println()

    println("End of Class!")


}