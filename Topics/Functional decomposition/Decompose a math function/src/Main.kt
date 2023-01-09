import kotlin.math.pow

fun f(x: Double): Double {
    // call your implemented functions here
    when {
        x <= 0 -> return f1(x)
        0 < x && x < 1 -> return f2(x)
        x >= 1 -> return f3(x)
    }
    return x
}

// implement your functions here
fun f1(x: Double): Double { return  x.pow(2) + 1 }

fun f2(x: Double): Double { return 1 / x.pow(2) }

fun f3(x: Double): Double { return x * x - 1 }

/*
fun main(){

    val x = readln().toDouble()
    println(f(x))
}
*/