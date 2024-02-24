package kotlin_basic_syntax.fp.collection

fun main() {
    val mutableSetOf = mutableSetOf(100L)

    for (l in mutableSetOf) {
        println(l)
    }

    for ((index, value) in mutableSetOf.withIndex()) {
        println("$index , $value")
    }
}