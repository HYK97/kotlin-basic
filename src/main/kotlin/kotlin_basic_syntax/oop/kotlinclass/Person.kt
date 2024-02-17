package kotlin_basic_syntax.oop.kotlinclass

fun main() {
    val person = Person("hy", 28)
    println(person.name)
    person.age = 10

    /*
    * 자바 클래스의 getter, setter도 .field로 접근가능하다
    * */
    val javaPerson = JavaPerson("hy", 28)
    println(javaPerson.name)
    javaPerson.age = 28
    println(javaPerson.age)

    /*sub*/
    val person1 = Person("us")
    println(person1.age)

    val person2 = Person()
    println(person2.age)
    println(person2.name)
}


class Person(val name: String, var age: Int) { // 이건 주생성자 -> 항상 존재해야한다. 파라미터가 없는 경우는 생략가능
    /*
    * init 블록은 생성자 호출시 가장 먼저 실행된다.
    * 여기서 validation을 진행할수있다
    * */
    init {
        println("init")
        if (age < 0) {
            throw IllegalArgumentException("나이는 0보다 작을수 없습니다.")
        }
    }

    /*
    * 코틀린에서는 부생성자 보다는 default parameter를 사용하는것을 권장한다. 필요할시에는 부생성자 보다 정적팩토리 메서드를 사용
    * */
    constructor(name: String) : this(name, 1){ // secondary constructor (부생성자)
        println("생성자 호출1")
    }
    constructor() : this("hy"){ //부생성자는 body를 만들수있다. 부생성자는 서로 호출할수있다.
        println("생성자 호출2")
    }

    // 생성자 실제 호출 순서는 init -> 부생성자1 -> 부생성자2

    //custom getter -> 함수처럼 만들거나 프로퍼티로 만들수있다.
    /*
    * tip -> 객체의 속성이면 custom getter로 만들고 그게아니면 함수로 사용하자
    * */
    val isAdult: Boolean
        get() = this.age >= 20
}

/*
* setter, custom setter도 잘안쓴다.
* */
class Person2(name: String, var age: Int) { // 이건 주생성자 -> 항상 존재해야한다. 파라미터가 없는 경우는 생략가능
    var name = name
        set(value) {
            println("name이 변경되었습니다.")
            //field(backing field)를 쓰는 이유는 setter에서 name을 변경하면 무한루프에 빠질수있기때문에 ( getter도 마찬가지)
            field = value.uppercase()
        }
}