package kotlin_basic_syntax.etc.scope_function

import kotlin_basic_syntax.etc.Person

/**
 * scope function이란?
 * 람다를 사용해서 일시적인 영역을 만들고 코드를 더 간결하게 만들거나, method chaining에 활용 하는 함수를 뜻한다.
 * 종류 :
 * 1. let (람다의 결과를 반환함) let 사용
 * 2. run (람다의 결과를 반환함) this 사용
 * 3. apply (객체 그자체를 반환) this 사용
 * 4. also (객체 그자체를 반환) let 사용
 * 5. with (확장함수가 아님)
 *
 * this의 경우에는 생략가능 -> 다른이름을 붙일수 없음
 * let 생략 불가능 -> 다른 이름을 붙일 수 있음
 * */
fun printPerson(person: Person?) {
    person?.let { //let이라는 확장 함수를 사용
        println(it.name)
        println(it.age)
    }


    /**
     *  T type을 파라미터로 받고 R 타입을 리턴하는 일반 함수를 받는다
     *  T.let(
     *     block: (T) -> R
     * ): R
     * */
    person?.let { p ->
        println(p.name)
        println(p.age)
    }

    /**
     * 확장 함수를 받음
     *
     * T.apply(
     *     block: T.() -> Unit
     * ): T
     * */
    person?.apply {
        println(this.name)
        println(age) //생략 가능
    }

}

fun main() {
    val person = Person("a", 1)
    with(person) {
        println(this.name)
        println(age)
        println(person.age)
    }
}