package chapter_05

import jdk.internal.org.jline.utils.Colors.h

fun main() {
    val message = """
         |こんにちは、世界！
         |私はKotlinに関して勉強しています。
         |Kotlinでは、とても簡潔なプログラムを書くことができます。
         |皆さん、一緒にプログラミングをしましょう！
         """.trimMargin()

    println(message)

    val message2 = """
        こんにちは、世界！
        私はKotlinに関して勉強しています。
        Kotlinでは、とても簡潔なプログラムを書くことができます。
        皆さん、一緒にプログラミングをしましょう！
        """.trimMargin()

    println(message2)

}