package kotlin_basic_syntax.oop.visibility_modifier

class Car(
    //getter setter 둘다 private로 설정
    private val name: String,
    val speed: Int,
    _price: Int) {

    //setter를 private로 설정
    //그런데 getter 같은 경우는 private로 설정하기는 어렵다
    var price = _price
        private set
        /*
        * gpt의 답변
        * 코틀린에서는 프로퍼티의 getter나 setter의 가시성을 프로퍼티 자체의 가시성과 다르게 설정하는 것을 허용하지 않습니다. 이는 코틀린의 디자인 원칙 중 하나인 '명확성'에 기반한 결정입니다.
        * 예를 들어, 프로퍼티가 public이고 getter만 private으로 설정한다면, 이 프로퍼티는 외부에서 접근 가능한 것처럼 보이지만 실제로는 값을 가져올 수 없게 됩니다. 이는 코드를 읽는 사람에게 혼란을 줄 수 있으므로, 코틀린에서는 이런 상황을 방지하기 위해 getter와 setter의 가시성을 프로퍼티와 동일하게 유지하도록 강제하고 있습니다.
        * 그래서 만약 프로퍼티의 값을 가져오는 것을 제한하고 싶다면, 프로퍼티 자체를 private으로 설정해야 합니다. 이렇게 하면 해당 프로퍼티는 선언된 클래스 내에서만 접근 가능하게 됩니다. 이외에도, 코틀린에서는 'internal'이라는 가시성 수정자를 제공하여 같은 모듈 내에서만 접근 가능하도록 제한하는 것도 가능합니다
        * */
        //private get
}
