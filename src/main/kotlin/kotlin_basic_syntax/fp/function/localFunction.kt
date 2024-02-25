package kotlin_basic_syntax.fp.function

fun main() {

}
/*
* 함수 안에 함수이다. 개인 적으로 코딩테스트시 dfs 와같은 문제를 풀때는 생각보다 도움이 많이 됬던것같다
* 하지만 depth가 지나치게 깊어지면 가독성을 해칠수있기 때문에 실제 프로덕션 코드에서는 권장하진 않음
* */

fun startDFS(param1: String, param2: String) {
    fun dfs(param1: String, param2: String) {
        if (param1 == "1" || param2 == "2") {
            return
        }
    }
    dfs(param1, param2)
}
