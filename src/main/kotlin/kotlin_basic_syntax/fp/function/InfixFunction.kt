package kotlin_basic_syntax.fp.function

fun main() {
    val infixFunction = InfixFunction("a", "name1")
    infixFunction printFunc "newName"
    infixFunction addName "testAddname"

}
class InfixFunction(
    val data: String,
    val name: String
) {

    /*
    * 멤버변수도 사용가능
    * */
    infix fun printFunc(extendsString: String) {
        println("${this.data} ${this.name}  $extendsString")
    }
}

/*
* 확장함수에도 사용가능
* */
infix fun InfixFunction.addName(name2: String) {
    println("${this.name}   $name2")
}