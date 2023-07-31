fun myRec(recEl: Int){

    println(recEl-1)

    if(recEl>0){
        myRec(recEl-1)
    }

}



fun main() {
    myRec(1)
}
