package kotlin_basic_syntax.oop.`object`


fun main() {
    Singleton.a = Singleton.a + 10
    println(Singleton.a)

    /*
    * 코틀린의 익명클래스
    * */
    moveSomeThing(object : Movable { // -> new Moveable() { ... }
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
) {

    /*
    *  static 대신 companion object를 사용
    * 이름을 지어줄수도있고 interface도 구현가능
    * companion object에 유틸성 함수를 넣어도 되지만 최상단 파일을 활용하는것이 나음
    * java에서 companion object를 사용하려면 @JvmStatic를 사용하거나 companion obeject의 이름을 사용하거나 사용해야함
    * */
    companion object Factory : Log {
        //const -> compile time 상수 진짜 상수
        const val MIN_AGE = 0 // static final int MIN_AGE = 0;

        //@JvmStatic
        fun create(name: String, age: Int): Person { // static Person create(String name, int age) { ... }
            return Person(name, MIN_AGE)
        }

        override fun log() { // 구현 가능
            println("log")
        }
    }
}

interface Log {
    fun log()
}

/*
* 싱글톤
* */
object Singleton {
    var a: Int = 10
}

interface Movable {
    fun move()
    fun fly()
}

private fun moveSomeThing(movable: Movable) {
    movable.move()
    movable.fly()
}