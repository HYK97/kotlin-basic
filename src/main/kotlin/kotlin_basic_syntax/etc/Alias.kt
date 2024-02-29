package kotlin_basic_syntax.etc



/**
 * 이렇게 같은 이름 타입이 2개일 경우
 * 기존 자바에서는 축약 하지 못하고 모든 path를 써야 했는데 코틀린읜 as import를 사용하면 다음과 같이 이름을 정의 해서 사용할수있다.
 *
 * */

import kotlin_basic_syntax.fp.lambda.Fruit as fruitA
import kotlin_basic_syntax.fp.collection_function_type.Fruit as fruitB



typealias FruitFilter = (fruitA) -> Boolean

/*
이 코드를 Type Alias를 사용하면
fun filterFruits(fruit: List<Fruit>, filter: (Fruit) -> Boolean) {

}*/

/**
 * 다음과 같이 사용이 가능하다.
* */
fun filterFruits(fruit: List<fruitA>, filter: FruitFilter) {

}

fun filterFruits2(fruit: List<fruitB>, filter: FruitFilter) {

}
