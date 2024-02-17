package kotlin_basic_syntax.control

fun main() {
    listPrint1()
    listPrint2()
    whileLoop()
}

/*
* 콜론대신 in을 쓴다
* */
private fun listPrint1() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}

/*
* 전통 for문
* downTo, step 도 함수다.
* .. -> rangeTo 메서드 등차 수열을 사용
* */
private fun listPrint2() {
    //1 ~ 10까지
    for (i in 1..10) {
        print(i)
    }
    println()
    //10 에서 1까지
    for (i in 10 downTo  1) {
        print(i)
    }
    println()
    //1 ~ 5까지 2씩 증가
    for (i in 1..5 step 2) {
        print(i)
    }
}

/*
* java와 동일
* */
fun whileLoop() {
    var i = 0
    while (i < 10) {
        println(i)
        i++
    }
}