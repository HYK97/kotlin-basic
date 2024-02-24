package kotlin_basic_syntax.fp.collection

/*
* tip 불변으로 먼저 만들고 꼭필요한 경우에 가변리스트로 바꾸는걸 추천
* */
fun main() {
    val numbers = listOf(100,200) //-> 불변리스트
    val mutableList = mutableListOf(200, 100) //-> 가변리스트
    val emptyList = emptyList<Int>() //비어있는 리스트는 명시적으로 타입을 지정해야한다
    printNumbers(emptyList()) //추론가능 하면 생략가능

    println(numbers[0])
    for (number in numbers) {
        println(number)
    }


    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

}

private fun printNumbers(numbers: List<Int>) {

}