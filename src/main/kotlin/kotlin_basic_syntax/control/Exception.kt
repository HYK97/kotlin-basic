package kotlin_basic_syntax.control

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

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

/*
* kotlin은 Checked Exception과 Unchecked Exception을 구분하지 않는다.
* */
fun uncheckedException() { //아무것도 안붙음 createnewFile 메서드는 IOException을 던짐
    val createNewFile = File("test").createNewFile()
}

/*
* kotlin은 try with resource를 지원하지 않는다.
* use 메서드를 사용하면 된다.
* */
fun tryWithResource(path: String) {
    BufferedReader(FileReader(path)).use {reader ->
        println(reader.readLine())
    }
}
