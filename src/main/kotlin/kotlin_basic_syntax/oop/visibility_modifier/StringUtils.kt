package kotlin_basic_syntax.oop.visibility_modifier

import com.sun.tools.javac.util.StringUtils

/*
* 이런식으로 유틸성 메서드는 kt 파일로 만드는게 더유용하다
* ->
* java에서 사용할때는 실제로 호출시에는
* (파일명) StringUtilsKt.isDirecotryPath("/usr/local")  이런식으로 호출해야한다.
* */

fun isDirectoryPath(path: String): Boolean {
    return path.startsWith("/")
}