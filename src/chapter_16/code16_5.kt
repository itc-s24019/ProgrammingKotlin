package chapter_16

fun main() {
    val a: IntArray = intArrayOf(1000,1200,1500,1800,2400,3000,3800)
    for (i in 0..4) {
    println("${i + 1}年目の給料は ${a[i]}円です。")
    }
}
