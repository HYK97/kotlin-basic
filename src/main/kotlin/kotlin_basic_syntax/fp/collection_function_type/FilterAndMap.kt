package kotlin_basic_syntax.fp.collection_function_type

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)

fun main() {
    val fruits = listOf(
        Fruit(1, "apple", 1000, 1200),
        Fruit(2, "banana", 2000, 2200),
        Fruit(3, "kiwi", 3000, 3200),
        Fruit(4, "apple", 1000, 1200)
    )

    val apples = fruits.filter { fruit -> fruit.name == "apple" }
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "apple"
    }

    val applesMap = fruits.filter { fruit -> fruit.name == "apple" }
        .map { fruit -> fruit.currentPrice }

    val applesMapIndex = fruits.filter { fruit -> fruit.name == "apple" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.currentPrice
        }

    val applesMapNotNull = fruits.filter { fruit -> fruit.name == "apple" }
        .mapNotNull { fruit -> fruit.currentPrice }

    //모두 apple인지 확인 true / false
    val isAllApple = fruits.all { fruit -> fruit.name == "apple" }
    //모두 불만족 하면 true / false
    val isNoApple = fruits.none { fruit -> fruit.name == "apple" }
    //조건을 하나라도 만족하면 true / false
    val isNoApple2 = fruits.any { fruit -> fruit.name == "apple" }

    val fruitCount = fruits.count { fruit -> fruit.name == "apple" }

    //오름차순 정령
    val fruitCountSort = fruits.sortedBy { fruit -> fruit.currentPrice }

    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    //orNull 차이는 없으면 null을 반환 한다 그냥 first last의 경우 데이터가 없으면 에러가 발생한다.
    fruits.first()
    fruits.firstOrNull()
    fruits.last()
    fruits.lastOrNull()


    // => 이름을 기준으로 그루핑
    val groupBy: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    for (entry in groupBy) {
        println(entry.key)
        println(entry.value)
    }


    // => id를 기준으로 그룹핑
    //중복되지 않는 키를 기준으로 그룹핑 할 때 좋은 코드이다
    val associateBy: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }


    //id를 key로 하고 factoryPrice를 value로 하는 맵을 만든다
    val idToFactoryPrice: Map<Long, Long> = fruits.associateBy(
        { fruit -> fruit.id },
        { fruit -> fruit.factoryPrice }
    )

    //평탄화
    val fruitsList = listOf(
        listOf(Fruit(1, "apple", 1000, 1200), Fruit(2, "banana", 2000, 2200)),
        listOf(Fruit(3, "kiwi", 3000, 3200), Fruit(4, "apple wang", 1000, 1000))
    )
    //하나의 리스트로 평탄화
    val flattenFruits = fruitsList.flatten()

    println("=====")
    //출고가와 현재가가 동일한 과일 고르기
    val flatMap = fruitsList.flatMap { list ->
        list.filter { fruit ->
            fruit.factoryPrice == fruit.currentPrice
        }
    }


    println(flatMap)


}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}
