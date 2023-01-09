class Rectangle(val width: Int, val height: Int)

fun printArea(rectangle: Rectangle) {
    var areaPrinter = rectangle.width * rectangle.height
    println(areaPrinter)
}