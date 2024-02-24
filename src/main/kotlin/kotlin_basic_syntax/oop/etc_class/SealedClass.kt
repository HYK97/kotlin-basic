package kotlin_basic_syntax.oop.etc_class

//같은 패키지에 있는 경우에만 상속가능 하고 런타임에 타입이 추가될수없기떄문에 마찬가지로 when을 이용하면 효과가 좋다.
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante: HyundaiCar("Avante",1_000_000L)
class Sonata: HyundaiCar("Sonata",2_000_000L)
class Grandeur: HyundaiCar("Grandeur",3_000_000L)