package kotlin_basic_syntax.etc


/**
 * data class는 ComponentN 함수를 자동으로 생성해준다.
 * data class가 아닌경우에 구조분해를 사용하고 싶으면 componentN 함수를 직접 구현 해주면 된다
 * 참고로 componentN 함수는 연산자 속성을 가지고 있기 떄문에 operator 키워드를 사용해야 한다.
 * */
data class Person(
    val name: String,
    var age: Int
)
class NonDataPerson(
    val name: String,
    var age: Int
){
    operator fun component1() = name
    operator fun component2() = age
}


/**
 * 구조 분해 : 복합적인 값을 분해하여 여러 변수를 한 번에 초기화 하는것
 * */
fun main() {
    val person = Person("hy", 28)
    val (name, age) = person
    //위아래 코드는 같은 코드다 (name, age) -> 구조 분해를 하는데 내부 적으로 component1, component2를 호출한다.
    /*    val name2 = person.component1()
    val age2=person.component2()*/
    println("$name : $age")

    val (name2, age2) = NonDataPerson("hy", 28)
    println("$name2 : $age2")
}