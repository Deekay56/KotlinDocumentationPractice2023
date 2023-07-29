/*
*
*
Consider the following steps during the backtracking process when the recursion returns from the deepest call:

The function myRecursive(0) is called, and since recursiveNum is not greater than 0, it does not make any recursive call and immediately proceeds to the print(0) statement. It prints 0 and returns to its previous call, which is myRecursive(1).

myRecursive(1) had made a recursive call to myRecursive(0), and after myRecursive(0) completes, it proceeds to the print(1) statement. It prints 1 and returns to its previous call, which is myRecursive(2).

myRecursive(2) had made a recursive call to myRecursive(1), and after myRecursive(1) completes, it proceeds to the print(2) statement. It prints 2 and returns to its previous call, which is myRecursive(3).

This process continues for each value of recursiveNum until all the recursive calls are completed. Each time a recursive call returns, the corresponding value of recursiveNum is printed.

Eventually, the last call to myRecursive(5) is reached, which had made a recursive call to myRecursive(4). After myRecursive(4) completes, it proceeds to the print(5) statement. It prints 5 and returns to the main function.

As a result, the print statements execute during the backtracking phase, and the values are printed in ascending order: 012345.

In essence, each recursive call waits for the next one to complete before executing the print statement. This is why the numbers are printed in ascending order, following the sequence of function calls that were made during the recursion.


*
*
* */


fun myRecursive(recursiveNum: Int){

    if (recursiveNum>0){
        myRecursive(recursiveNum-1)
    }

    print(recursiveNum)


}


fun main() {
    
    myRecursive(5)
}
