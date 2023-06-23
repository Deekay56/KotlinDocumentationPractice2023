class MyBook (val bookTitle: String, val bookPublished: Int, var bookPages: Int)
{
    init {
        bookPages = 234
    }
}


fun main(){

    val harryPotter = MyBook("Harry Potter", 2003, 345)

    println("My favourite book is ${harryPotter.bookTitle}. It was published in ${harryPotter.bookPublished} and has ${harryPotter.bookPages} pages.")

}

