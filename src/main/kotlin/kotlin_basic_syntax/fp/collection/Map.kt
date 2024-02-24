package kotlin_basic_syntax.fp.collection

fun main() {
    val oldMap = mutableMapOf<Int,String>() // -> 가변맵
    oldMap[1] ="M"
    oldMap[2] ="T"

    val mapOf = mapOf(1 to "M", 2 to "T") //=> 불변맵

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}