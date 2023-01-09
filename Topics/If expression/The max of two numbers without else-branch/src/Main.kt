fun main() {

    val a = readln().toInt()
    val b = readln().toInt()

    // put your code here
    /*if (a > b ) {
        println(a)
    }
    if (b > a ) {
        println(b)
    }*/
    val max = if (a > b) a else b
    println(max)
}