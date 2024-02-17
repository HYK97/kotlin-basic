package kotlin_basic_syntax.control.function

fun main() {
    repeat("안녕하세요", 5)
    println("=====================================")
    repeat("안녕하세요", 5, false)
    println("\n=====================================")
    repeat("안녕하세요")
    println("=====================================")
    // 이름있는 파라미터 : 매개변수 이름을 통해서 직접 지정하고 지정되지 않은 파라미터는 기본값을 사용한다.
    repeat("안녕하세요", useNewLine = false)
    //주의 named argument는 java의 메서드는 사용할수없다!
    printNAmeAndGender(name = "hy","man")

    println("=================가변인자===================")
    printAll("A", "B", "C")
    // spread operator : 배열을 가변인자로 전달하는 목적
    val strings = arrayOf("A", "B", "C")
    printAll(*strings)
}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNAmeAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}