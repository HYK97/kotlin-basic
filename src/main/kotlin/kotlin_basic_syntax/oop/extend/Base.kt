package kotlin_basic_syntax.oop.extend

open class Base(open val name: String="Base") {
    init {
        println("Base init")
        println(name)
    }
}

class Derived(override val name: String) : Base(name) {
    init {
        println("Derived init")
    }
}

fun main() {
    val derived = Derived("Derived")
    Base()
}