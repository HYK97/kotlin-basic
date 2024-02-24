package kotlin_basic_syntax.oop.etc_class

fun main() {
    val personDto = PersonDto("kh", 100)
    val personDto1 = PersonDto("kh", 100)
    val personDto2 = PersonDto("kh", 200)
    println(personDto == (personDto1))
    println(personDto == personDto2)
    println(personDto.toString())
}

data class PersonDto( //data class에는 equals,hashcode, toString 자동 생성
    val name: String,
    val age: Int
)
