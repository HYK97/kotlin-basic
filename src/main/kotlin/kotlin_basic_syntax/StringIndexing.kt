package kotlin_basic_syntax

/*
* 비슷한 기능으로 java에 21에도 실험적으로 도입했다.
* string-templates
* */
fun main() {
    main1()
    main2()
    main3()
}

fun main1() {
    val name ="김현용"
    val age = "28"

    println("이름은 ${name} 나이는 ${age}")
}

fun main2() {
    val test ="test string"
    val name = """
        ABC
        EFG
        ${test}
        
    """.trimIndent()

    println(name)
}

/*
* String을 배열의 index 번호로 접근 가능
* */
fun main3() {
    val str ="ABC"
    println(str[0])
    println(str[1])
    println(str[2])
}