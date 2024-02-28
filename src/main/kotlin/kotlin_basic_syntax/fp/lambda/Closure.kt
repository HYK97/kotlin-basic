package kotlin_basic_syntax.fp.lambda


/*
* java의 람다는 외부 변수를 사용할 때 해당 변수는 불변이여야 한다.
*
* 반대로 코틀린에서는 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.
* 이 가지고 있는 데이터 구조를 Closure 라고 한다.
*
* */

fun main() {
    var test = 10
    test = 20
    //이런식으로 Non-final 변수를 람다에서 사용할 수 있다.
    test { 10 > test }

}

fun test(testParam: (Int) -> Boolean) {
    println(testParam)
}