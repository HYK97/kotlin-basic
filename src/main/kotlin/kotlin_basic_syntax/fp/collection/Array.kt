package kotlin_basic_syntax.fp.collection

fun main() {
    val array = arrayOf(100, 200)
    for (i in array.indices) { //배열 인덱스 가져오기
        println("${i},${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    array.plus(300) // 배열에 새로운 앨리먼트 추가가 가능함 마치 리스트 같이
}