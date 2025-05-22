package chapter_18

import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.measureTimeMillis

fun main() {
    val targetSet = mutableSetOf<Int>()
    for (x in 1..1000) {
        targetSet += Random.nextInt(0..100_000_000)
    }
    val targetList = targetSet.toList()

    val listTime = measureTimeMillis {
        for (x in 0..100_000_000) {
            //
            val result = targetList.contains(x)
        }
    }
    println("MutableList の検索時間: $listTime ミリ秒")

    val setTime = measureTimeMillis {
        for (x in 1..100_000_000) {
            //0から1億まで、リストに存在するかチェック
            val result = targetList.contains(x)
        }
    }
}   //わかったこと　▶　listを使うよりsetを使うほうが検索が早い。