package kotlin_basic_syntax

fun main() {
    compareToTest()
    equalsTest()
    operatorOverrideTest()
}

/*
* 코틀린은 객체를 비교하면 자동으로 compareTo를 호춣
* */
fun compareToTest() {
    val javaMoney1 = JavaMoney(1L)
    val javaMoney2 = JavaMoney(2L)
    if (javaMoney1 < javaMoney2) {
        println("true")
    }
}

/*
* 동등성 ==
* 동일성 ===
* */
fun equalsTest() {
    val javaMoney1 = JavaMoney(10L)
    val javaMoney2 = javaMoney1
    val javaMoney3 = JavaMoney(10L)
    println(javaMoney1 == javaMoney2)
    println(javaMoney1 === javaMoney2)
    println(javaMoney1 == javaMoney3)
    println(javaMoney1 === javaMoney3) // ===hash
}
/**/
/*
* in / !in
* a..b -> 반복문
* */


/*
* operator override
* 연산자 오버라이딩 가능
* */
fun operatorOverrideTest() {
    val money1 = Money(1L)
    val money2 = Money(2L)
    println(money1+money2)

}

data class Money(val amount: Long) {

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }

}

