package chapter_05

fun main() {
    val h: Int = 8
    val message1 = "本日働いた時間は、${h}hours"
    val message2 = "このペースで一ヶ月働くと、${h * 30}hours の労働になります。"
    val message3 = "このペースで一年間働くと、${h * 365}hours の労働になります。"
    println(message1)
    println(message2)
    println(message3)
}