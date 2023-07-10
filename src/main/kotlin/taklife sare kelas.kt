fun main() {
    val st_wellcome: String = "hi please inter your name"
    println(st_wellcome)

    val name = readln()
    println("hi $name do you like benaana please inter n or y")

    var st_ask = readln().toString()
    if (!(st_ask == "y" || st_ask == "n")) {
        println("kos maghz dorost vared kon")
        st_ask = readln().toString()
    }
    if (st_ask == "y") {
        println("موز کیلو چند؟")
        var st_ask2 = readln().toInt()
        if (st_ask2 < 30) {
            println("ایول برو بریم بخریم")
        } else if (st_ask2 in 30..50) {
            println("خوبه! دنیا هنوز قشنگیاش‌و داره...")
        } else if (st_ask2 > 50) {
            println("عامو چه خبره... مگه توش موزه...")
        }


        } else if (st_ask == "n") {
                println("برو درت‌و بذار کونده موز هم تو رو دوس نداره...")
        } else {
            println("کص مغز درست وارد کن فارسی نوشتم بفهمی")
        }

    }