class Kitty {
    var color: String = ""
    var age: Int = 0

    constructor(color: String, age: Int) {
        this.color = color
        this.age = age
    }
    constructor(age: Int, color: String) {
        this.age = age
        this.color = color
    }
    constructor(color: String) {
        this.color = color
    }
    constructor(age: Int) {
        this.age = age
    }
}