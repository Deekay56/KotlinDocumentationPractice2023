fun main (){

    /* 10 b) CONTROL FLOW - BREAK STATEMENT PLACEMENT */

    //if the break statement appears before the print statement, then all characters will be printed up to 'k'
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

    //if the break statement appears after the print statement, then all characters up to and including 's' will be printed
    //thus, the output will be 'Geeks' before the loop is terminated by the break statement.
    val name2 = "GeeksforGeeks"
    for (i in name2){
        print("$i")
        if(i == 's') {
            break
        }
    }




}
