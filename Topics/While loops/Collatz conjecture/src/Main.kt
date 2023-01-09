fun main() {
    var n = readln().toInt()
    print("$n ")
    while (n != 1) {
        var n2 = n % 2
        n = if (n2 == 0){
            (n / 2)
        } else {
            (n * 3) + 1
        }
        print("$n ")
    }
}