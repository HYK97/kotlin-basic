package kotlin_basic_syntax.oop.nested_class


fun main() {

}

class JavaHouse(
    private var address: String,
    private var livingRoom: LivingRoom
) {
    inner class LivingRoom( //권장하지 않지만 바깥 클래스와 참조를 원하는 경우는 inner 키워드를 붙이고
        private var area: Double
    ) {
        val address: String
            get() = this@JavaHouse.address //이런식으로 this@바깥클래스 명으로 접근가능하다
    }

}

