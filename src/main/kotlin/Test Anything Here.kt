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
    for (nestedForLoopOutContinue in 0..3){
        for (nestedForLoopInContinue in 0..3){
            println("$nestedForLoopOutContinue $nestedForLoopInContinue")
            if(nestedForLoopInContinue == 2) continue
        }
    }

    println()
    println()

}