package kotlin_basic_syntax.control.function

fun main() {

}

/*
* =을 쓰면 반환타입이 생략가능
* */
fun max(a: Int, b: Int) = if (a > b) a else b

/*
* 생략안되는 버전
* */
fun max2(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

