fun main() {
    // write your code here
    val number = readln().toInt()

    println(if (number == 0) {
        "zero"
    } else if (number > 0) {
        "positive"
    } else {
        "negative"
    })
}