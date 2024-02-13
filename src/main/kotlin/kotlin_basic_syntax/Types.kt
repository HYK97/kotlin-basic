package kotlin_basic_syntax

/*
* 기본 타입은 자바와 비슷함
* 자바는 암시적 타입 변환이 가능했지만
* 코틀린은 명시적으로 타입 변환을 해야함 to ~ 메서드를 이용해서 변경하자
* */

fun main() {
    //Long 형은 L을 붙이면 자동으로 타입 추론이 된다.
    val LongVal = 10L

    //Float
    val floatVal = 10.0f

    //Double f 안붙이면 double
    val doubleVal = 10.0

}

/*
* to~ 메서드를 이용해서 타입을 변환해주어야함
* */
fun typeConversion() {
    val val1: Long = 10L
    var val2: Int = 5
    val2 = val1.toInt()
}

/*
* nullable 타입변환 처리는 Elvis 연산자 사용
* */
fun typeConversionWithNull() {
    val val1: Long? = 10L
    var val2: Int = 5
    val2 = val1?.toInt() ?: 0
}

/*
* 타입 캐스팅 -> instance of -> is 를 사용
* instance of 반대 !is
*
* value is Type -> true false 반환
* value as Type -> 해당 타입인 경우 타입으로 캐스팅후 반환 아닌경우는 예외발생
* value as? Type -> 해당 타입인 경우 타입으로 캐스팅후 반환 아닌경우나 null인 경우 둘다 null이 나옴
* */
fun typeCasting(obj: Any) {

    //null이 들어올수 있는경우
    if (obj is Person) {
        val i = obj as? Person
        println(i?.age)
    }

    if (obj is Person) {
        val i = obj as Person
        println(i.age)
    }
    //위와 같음 생략가능
    if (obj is Person) {
        println(obj.age)
    }

    if (obj !is Person) {
        //~
    }

}

/*
* Java 의 Object는 Kotlin에서는 Any임
* Any 자체로는 Null을 포함할 수 없기 때문에 포함하기위해서는 Any?로 표현
*
* Unit은 Java의 void와 동일한 역할
* Unit은 void(Void x)와 다르게 타입인자로 사용가능
*
* Nothing
* 정상적으로 끝나지 않았다는 사실을 표현하는 역할
* 무조건 예외를 반환하는 함수 등 ..
* */