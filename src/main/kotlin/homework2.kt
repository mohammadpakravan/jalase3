fun main() {
    val st_wellecome = "Hello, enter two integer numbers."
    println(st_wellecome)
    var numb1 = readln().toInt()
    var  numb2 = readln().toInt()
    val st_ask = "which do you choose? prime number or even number or " +
            "odd number? please enter one of the numbers above. 1: prime " +
            "2: even 3: odd."
    println(st_ask)
    var numb3 = readln().toInt()

    if (numb3 == 2){
       if ((numb1%2) == 0 ) {
           while (numb1< numb2){
               numb1 +=2
           println(numb1)}
       }
    }
    if (numb3==2){
        if ((numb1%2)== 1){
            var numb4 = numb1 + 1
            println(numb4)

            while (numb4< numb2){
                numb4 +=2
                println(numb4)
            }
        }
    }
    if (numb3 == 3){
        if ((numb1%2) == 0 ) {
            var numb5= numb1 +1
            println(numb5)

        while (numb5< numb2){
          numb5 +=2
            println(numb5)
    } }}

    if (numb3==3){
        if ((numb1%2)== 1){

            while (numb1< numb2){
                numb1 +=2
                println(numb1)
            }
        }
    }

}