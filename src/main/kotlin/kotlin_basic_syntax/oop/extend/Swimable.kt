package kotlin_basic_syntax.oop.extend

interface Swimable {

    /*
    * interface에서 프로퍼티를 선언하면 반드시 getter를 제공해야한다.
    * */
    val swimAbility: Int
        get() = 10  //기본값을 지정할수있다.

    fun act(){
        println(swimAbility)
        println("수영하다")
    }
}