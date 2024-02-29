package kotlin_basic_syntax.etc

import java.util.Random

val i = Random().nextInt(3)

fun main() {
    val number = getNumberOrNullV1()
    println(number)

    val number2 = getNumberOrNullV2()
    println(number2)

    val number3 = getNumberOrNullV3()
    println(number3)
}

fun getNumberOrNullV1(): Int? {
    return if (i <= 1) {
        null
    } else {
        i + 1
    }
}


/**
 *
 * takeIf -> 조건을 만족하면 해당 값을 반환하고 아니면 null을 반환한다.
 * takeUnless -> 조건을 만족하지 않으면 해당 값을 반환하고 아니면 null을 반환한다.
 * */

fun getNumberOrNullV2(): Int? {
    return i.takeIf { it > 1 }
}

fun getNumberOrNullV3(): Int? {
    return i.takeUnless { it > 1 }
}