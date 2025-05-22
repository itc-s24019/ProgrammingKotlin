package chapter_20

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`) //「` `」◀名前バッククオート

    print("なにか入力してください:")
    val line = scan.nextLine()
    println(line)

    print("なにか入力してください(空白はダメ):")
    val string = scan.nextLine()
    println(string)

    print("整数を入力してください:")
    val num = scan.nextInt()
    println("${num}の２倍の数: ${num * 2}")

}