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

fun main(){
    println("The factorial of this number is: "+myFactorial(3))
}


