package chapter_07

fun main() {
    val delicious = false
    val cheap = true
    println("このレストランは、おいしい: $delicious")
    println("このレストランは、安い: $cheap")
    val letsEat = delicious && cheap
    println("食事する？:$letsEat")
}