package kotlin_basic_syntax.etc

/**
 * 이렇게 라벨을 이용해서 JUMP를 할수는 있지만 코드의 흐름이 복잡해 지기 떄문에 사용을 지양하는것이 좋다.
 *
* */
fun main() {
    break1@ for( i in 1..100){
        for (j in 1..100){
            if(j==5) break@break1
            println("i : $i, j : $j")
        }
    }
}


/**
 * foreach를 사용하면서 break와 continue를 사용할수 없다.
 * run{}을 사용하면 break와 continue를 사용할수 있다.
 * 하지만 break와 continue를 사용한다면 일반 for문을 사용하는것이 좋다.
 * */
fun foreach() {
    val list = listOf(1, 2, 3, 4, 5)
    list.forEach {
        if (it == 3) {
            //break
            //continue
        }
    }

}