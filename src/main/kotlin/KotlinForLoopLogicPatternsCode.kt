fun main() {
    for(i in 1..3){
        for (j in 1..3){
            print("-") //this inner loop will be executed first.
                      //this is the only code dealing with the inner loop.
                     //for every iteration, the work of this loop is to print out "-" three times in a line, nothing else.
                    //NOTE that the inner loop is always executed in fullness first, for each iteration of the outer loop.
        }
        println(">")
        println()//this is the only code dealing with the outer loop. 
                //for every iteration of this loop, the work of this loop is to print a ">" on the same line as the inner loop, then skip a line
               //AND then also skip another line
                 
  
    }
    //------------------------------------------------------------      NEXT CODE BELOW     --------------------------------------------------------------//
    println()
    //the next for loop does something a bit different
    for(i in 1..5){
        for(j in 1..i+1){
            print("x") //this inner loop will be executed first.
                      //for every iteration of the outer loop, which is 5 times, this inner loop will print "x"s in a line.
                     //the number of times that the "x"s will be printed is dependent on the value of (i+1).
                    //this means that for the first iteration of the outer loop, the number of "x"s in the inner loop will be (i=1 + 1), so 2 "x"s
                   //in the second iteration, the no of "x"s will be (i=1+2), so 3 "x"s
                  //note that after each time the xs are printed, the code will go to the outer loop and jump a line (due to the println()), and this will be 5 times
                 //if the println() for the outer loop did not exist, all that would be is a long line of "xs" increasing with (x+1)
        }
       println()//the outer loop (with i loop variable) will skip a line 5 times, nothing else.
    }
    
}
