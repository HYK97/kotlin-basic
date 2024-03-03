package kotlin_basic_syntax.etc.scope_function


/**
 * let 사용처
 * */

fun main() {

    //1번 예시
    //하나 이상의 함수를 CALL CHAIN 결과로 호출 할 때
    val strings = listOf("a", "b", "c", "d")
    strings.map { it.length }
        .filter { it > 1 }
        .let(::println)

    //2번 예시
    //non-null 값에 대해서만 code block을 실행시킬 때 safe call을 이용함
    var str: String? = ""
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    //3번예시
    //일회성으로 제한된 영역에 지역 변수를 만들 때 -> depth가 늘어나서 잘쓰진 않음
    val numbers = listOf("one", "two", "threesss", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) {
                firstItem
            } else {
                "!$firstItem"
            }
        }.uppercase()

    println(modifiedFirstItem)


    //4번
    //객체 초기화와 반환 값은 계산을 동시에 해야 할 때
    val person = Person("a", 1).run {
        println(this.name)
        //personRepository.save(this)
    }


    //5번
    //객체 설정을 할 때에 객체를 수정하는 로직이 call chain 중간에 필요할 때
    fun createPerson(
        name: String,
        age: Int,
        hobby: String
    ): Person {
        return Person(name = name, age = age)
            .apply {
            this.hobby = hobby
        }
    }


    //6번 WITH
    //특정 객체를 다른 객체로 변환해야하는데 모듈간 의존성때문에 정적 팩토리 혹은 TOCLASS 함수를 만들기 어려울 때
    //ex) dto -> entitiy 변경 할때 toEntity같은 메서드 대신 사용
    fun test() {
        return with(person){
            PersonDto("name",2)
        }
    }


}

data class PersonDto(val name: String, val age: Int) {

}

data class Person(
    val name: Int,
    val age: String,
    var hobby: String
){
    constructor(name: String, age: Int) : this(
        age, name, ""
    )

}