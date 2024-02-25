package kotlin_basic_syntax.fp.function

fun main() {
    val string = "ABC"
    println(string.lastChar())
            // 생성 기준
    val mu = Train("무궁화", 10)
    val se = Train("새마을", 20)
    val srt = Srt()

    println(mu.isExpensive()) // 실제 인스턴스 (리턴)타입에 따라서 나뉘는걸 볼수있다. Train ->  사용함
    println(se.isExpensive()) // Train -> 확장변수 사용
    println(srt.isExpensive()) // SRT -> 오버라이드 선택
    /*
    * 결과
    * */

}


/*
* 확장 클래스 -> java 코드를 그대로 둔상태로 코틀린으로 코드를 추가하려는 니즈로 부터 탄생했음
* private or protected는 가져올수 없음
* 만약 기존 자바 클래스 메서드와 시그니처가 같으면 ?
* 원본 멤버 함수를 먼저 호출된다.  -> 원본 클래스에 다른 똑같은 기능의 멤버 함수가 생기면 오류가 발생할 수 있음
* 확장함수가 오버라이드 된다면?
*
* fun 확장하려는클래스.함수명(파라미터) : 리턴타입
* // this를 통해서 실제 클래스 접근 -> 수신 객체
* // this의 타입 ->  수신객체 타입
*
* java 에서도 이 코드를 사용할 수 있는가? -> 가능하다 메서드 뿐만아니라 getter setter과 같이 확장 프로퍼티도 만들수있다.
* */
fun String.lastChar(): Char {
    return this[this.length - 1]
}


open class Train(
    val name: String = "새마을",
    val price: Int = 5_0
)

fun Train.isExpensive(): Boolean {
    println(" 확장함수 입니다~ ")
    return this.price >= 0
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println(" 오버라이드 입니다. ")
    return this.price >= 0
}
