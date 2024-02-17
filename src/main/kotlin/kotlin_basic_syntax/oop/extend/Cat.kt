package kotlin_basic_syntax.oop.extend
/*
* 상속은 콜론으로 표현한다. extends x
* override 키워드를 사용해야한다.
* 상속시 항상 부모클래스의 생성자를 호출해야한다.
* */
class Cat(
    species: String
) : Animal(species, 4) { // Animal 상속 받고 Animal 생성자 호출
    override fun move() {
        println("고양이가 걷는다")
    }
}