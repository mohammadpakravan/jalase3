fun main() {
    val st_wellecome: String = "Hi, please enter an integer between 0 and 1000 "
    println(st_wellecome)
    var numb = readln().toInt()
    while (numb <=1 || numb >=1000){
        println("please enter an integer between 0 and 1000")
        numb = readln().toInt()
    }
    if (!(numb == 2 || numb == 5 || numb == 3 || numb == 7)) {
        if (((numb % 2) == 0) || ((numb % 3) == 0) || (((numb % 5) == 0) || ((numb % 7) == 0))) {

            println("Your number isn't prime number")

        } else {

            println("Your number is prime number ")
        }
    } else {
        println("Your number is prime number ")
    }
}
