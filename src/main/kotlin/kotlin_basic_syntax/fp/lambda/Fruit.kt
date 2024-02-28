package kotlin_basic_syntax.fp.lambda


fun main() {
    val fruits = listOf(
        Fruit("apple", 1000),
        Fruit("banana", 2000),
        Fruit("kiwi", 3000)
    )


    // 함수 이름이 없음
    //해당 메서드의 타입은 (Fruit) -> Boolean 이다 (생략 가능)
    //val isApple = fun(fruit: Fruit): Boolean { }
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "apple"
    }

    //람다의 다른 생성방법
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "apple" }

    //두가지 호출 하는 방법임
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    //다양한 사용방법
    //isApple
    filterFruits(fruits,isApple)
    filterFruits(fruits, fun(fruit: Fruit): Boolean {
        return fruit.name == "apple"
    })
    //isApple2
    filterFruits(fruits,isApple2)
    filterFruits(fruits,{ fruit: Fruit -> fruit.name == "apple" })

    //filterFruits 마지막 파라미터가 람다인경우 사용가능
    //이방법을 추천 it은 호출하는쪽에서 it이 무엇인지 알기 힘들기 때문에
    filterFruits(fruits){ fruit: Fruit -> fruit.name == "apple" }

    //람다의 파라미터가 하나인경우
    filterFruits(fruits){ it.name == "apple" }


    filterFruits(fruits){
        println("람다의 파라미터가 하나인경우")
        //람다는 마지막 값이 리턴값이다.
        it.name == "apple"
    }

}


private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val returnList = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            returnList.add(fruit)
        }
    }
    return returnList
}

class Fruit(
    val name: String,
    val price: Int
) {
}