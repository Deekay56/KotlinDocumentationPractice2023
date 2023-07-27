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
}


fun main() {

    callMe(5)
}
