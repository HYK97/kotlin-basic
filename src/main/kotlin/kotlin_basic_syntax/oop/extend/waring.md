코틀린에서 상속에서는 잘못사용하면 위험한 경우가 발생할 수 있습니다.
예를 들어서

```kotlin
open class Base(open val name: String = "Base") {
    init {
        println("Base init")
        println(name) //Derived("Derived")로 생성하면 name은 Derived의 name변수를 찍는것이다. 따라서 null이 나옴
    }
}

class Derived(override val name: String) : Base(name) {
    init {
        println("Derived init")
    }
}

fun main() {
    val derived = Derived("Derived")
    Base() // 이경우에는 default값이 들어가서 잘찍히게 된다.
}
```

이렇게 하면 어떤 결과가 나올까?
우리가 예상 하기로는 name을 찍으면 Base 아니면 Derived가 나올 것이라고 예상을 했을것이다 하지만
실제로는 null이 찍히게 된다.

이유는 Base의 init에서 name을 찍을때 Derived의 name이 초기화 되기 전이기 때문이다.

- 실제 결과

```
Base init
null
Derived init
```