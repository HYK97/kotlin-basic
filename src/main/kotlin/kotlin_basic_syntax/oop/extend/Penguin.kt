package kotlin_basic_syntax.oop.extend

class Penguin(
    species: String,
    private val wingCount: Int = 2
) : Animal(species, 2), Swimable, Flyable { //interface를 상속받을때는 콤마로 구분한다.

    override fun move() {
        println("펭귄이 걷는다")
    }

    /*
    * 추상 프로퍼티가 아니라면 꼭 open을 붙여야 오버라이드 가능
    * */
    override val legCount: Int
        //상위 클래스의 접근을 하려면 super를 사용해야한다.
        get() = super.legCount + this.wingCount

    /*
    * 중복 되는 인터페이스를 특정할때 super<타입>.메서드명()으로 호출한다.
    * */
    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    /*
    * interface에서 프로퍼티지정 할수있다
    * 어떻게 보면 getter에 대한 default 메서드를 만드는 것이라 생각할수있다.
    * */
    override val swimAbility: Int
        get() = super.swimAbility + 10
}