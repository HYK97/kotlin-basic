package kotlin_basic_syntax

import java.util.Objects


/*
 * 코틀린은 2가지 변수 선언 키워드가 존재함
 * 1. val -> java의 final 불변
 * 2. var -> 값 변환 가능
 * 코틀린에서는 val로 선언을 기본으로 하고 필요할떄 var로 바꾸자
 * 코틀린에서는 primitive 타입과 reference 타입에 대한 차이가 없다 내부적으로 코틀린이 최적화 해서 사용한다
 * */
fun main() {
    var testVal = 10L
    testVal = 20L

    val testVal2 = 20L
    //컴파일 오류
    //testVal2 = 30L


    //타입 지정
    val testVal3: String = "testValue"

    //null 이 가능한 변수 ?
    val testVal4: String? = null

    //인스턴스 생성 new 연산자를 사용하지 않음
    val test = Object()

}
