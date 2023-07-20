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

    //unlabelled continue for a simple while-loop

    /*

    The while loop starts. When the condition continueWhileLoop <= 3 is evaluated, it is true because continueWhileLoop is 0, so the loop body is executed.
    Inside the loop, there is an if condition: if (continueWhileLoop == 1) continue.
    Since continueWhileLoop is 0 and not equal to 1, the if condition is not satisfied, and the continue statement is not executed.
    The println(continueWhileLoop) statement is executed, and it prints 0.
    After the first iteration, continueWhileLoop is incremented to 1, and the second iteration starts.
    In the second iteration, continueWhileLoop is now 1, which matches the if condition (continueWhileLoop == 1).
    Therefore, the continue statement is executed, and the loop skips the remaining statements in the loop body, including the println(continueWhileLoop) statement.
    Since the continue statement causes the loop to skip the second iteration,
    the loop does not proceed to the third iteration. The condition continueWhileLoop <= 3 is not met due to continueWhileLoop being 1, and the loop terminates.
    So, the actual output is just 0, and the continue statement in the first iteration causes the loop to skip the second iteration when continueWhileLoop is equal to 1,
    leading to an early termination of the loop.

     */

    var continueWhileLoop = 0

    while (continueWhileLoop<=3){
        if (continueWhileLoop == 1) continue
        println(continueWhileLoop)
        continueWhileLoop++

    }

}