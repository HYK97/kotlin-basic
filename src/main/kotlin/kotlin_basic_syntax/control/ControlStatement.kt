package kotlin_basic_syntax.control

fun main() {
    println(expressionIf(30))
    println(validationScore(10))
    println(kotlinWhen(80))
}


/*
* 코틀린에서는 다음과 같이 if 문을 사용할 수 있어서 삼항연산자가 제거되었음
* */
fun expressionIf(score: Long): String {
    return if (score >= 50) {
        "true"
    } else {
        "false"
    }
}

/*
* in ~ .. ~ 가 가능함 between 기능
* */
fun validationScore(score: Long): String {
    return if (score in 0..10) {
        return "true"
    } else {
        "false"
    }
}

/*
* 코틀린은 스위치가 사라짐 대신 when이 생김
* when도 expression임
* */
fun kotlinWhen(score: Long): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }
}

/*
* when을 써서 타입별 분기가 가능함
* */
fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

/*
* 여러조건으로 분기가능함
* */
fun or(num: Int) {
    return when (num) {
        1, 2 -> println("1또는2")
        else -> println("둘다아님")
    }
}

/*
* when에 변수가 없는 경우 java의 if 조건으로 분기가 바로가능함
* */
fun orNonParameter(num: Int) {
    return when {
        num == 1 -> println("1임")
        num == 2 -> println("2임")
        else -> println("둘다아님")
    }
}
