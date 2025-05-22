package chapter_21

import kotlin.time.TimedValue

fun main() {
    val answer: Int = getThreeTimes(5)
    println(answer)
}

fun getThreeTimes(value: Int): Int {
    return value * 3
}