fun main() {
//    var i = 0
//    while (true){
//        i++
//        println(i)
//        if (i >=100) {
//            break
//        }
//    }
    var numb = readln().toInt()
    var saveNumb = numb
    var i = 0
    while ((numb % 2) != 0) {
        println("please enter even number")
        numb = readln().toInt()
        i++
        if (i > 3) {
            break
        }
    }
    while (numb > 10) {
        numb -= 7
        println(numb)
    }
    while (numb<=0){
        numb += 7
        println(numb)
    }
while (saveNumb > 10){
        if (!(((saveNumb % 2) == 0) || ((saveNumb % 3) == 0) || ((saveNumb % 5) == 0) ||
                    ((saveNumb % 7) == 0))){
            println(saveNumb)

        }
    saveNumb--
}
}