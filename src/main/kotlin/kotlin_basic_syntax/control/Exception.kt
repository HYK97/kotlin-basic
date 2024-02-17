package kotlin_basic_syntax.control

fun main() {
   /* val str = "sss"
    val num = parseIntORThrow(str)
    println(num)*/
    val parseIntOTThrowNull = parseIntOTThrowNull("Asd")
    println(parseIntOTThrowNull)
}

fun parseIntORThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("문자열을 숫자로 변환할 수 없습니다.")
    }
}

fun parseIntOTThrowNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
