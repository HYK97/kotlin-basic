package kotlin_basic_syntax.type


fun main() {

}

/*
* 코틀린에서 널처리
* */
fun startsWithA1(str: String?): Boolean { // ?는 파라미터로 널이 들어올수 있음
    if (str == null) {
        throw IllegalArgumentException("null")
    }
    return str.startsWith("A")
}


fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null;
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false;
    }
    return str.startsWith("A")
}

/*
* Safe Call Elvis 연산자
* */

//safe - call
fun length1(str: String?): Int? {
    return str?.length
}

// Elvis
fun length2(str: String?): Int {
    return str?.length ?: 0
}


/*
* null 단언!
* !! -> 변수가 절때 null이 아닌것을 단언
* 만약 혹시 널이 발생할 경우에는 NPE 발생
* */

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

/*
* 플랫폼 타입
* 자바에서 객체에 변수가 널인지 널이 아닌지 컴파일 타임에 확인하려면
* 자바 변수에 @Nullable -> 어노테이션을 적용하면
* ide에서 컴파일 타임에 해당 필드에 대한 notify를 준다.
* */
