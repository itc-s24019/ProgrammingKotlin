package chapter_15

import kotlin.random.Random

fun main() {
    while (true) {
        val value = Random.nextInt(100)
        println("乱数: $value")
        if (value < 10) break //breakを下に改行するとき以外では } を省略しない。
    }   //なみカッコを省略していまうとプログラムがループしないで一回で終わってしまう。
}