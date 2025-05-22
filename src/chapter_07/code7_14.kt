package chapter_07

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(from = 0, until = 100)
//    val rank = when {
//        a < 60 -> "D"
//        a < 70 -> "C"
//        a < 80 -> "B"
//        a < 90 -> "A"
//        else -> "S"
//    }
//    println("点数: $a → ランク: $rank")

    if (a < 60) {
        println("&a : D")
    }else if (a < 70) {
        println("&a : C")
    }else if (a < 80) {
        println("&a : B")
    }else if (a < 90) {
        println("&a : A")
    }else {
        println("&a : C")

    }


    //a が　0~59  なら D
    //a が　60~69 なら C
    //a が　70~79 なら B
    //a が　80~89 なら A
    //a が　90~   なら S
    // を a の値とともに出力してください



}