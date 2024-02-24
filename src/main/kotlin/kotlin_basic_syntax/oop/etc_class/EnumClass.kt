package kotlin_basic_syntax.oop.etc_class


fun main() {

}

fun countryHandler(country: Country) {
    when (country) { //컴파일 타임에 enum에 안전성 보장가능
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }

}
enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}

