package chapter_17

fun main() {
    val s: MutableList<String> = mutableListOf(
        "あ","い","う","え","お"
    )
    println(s)
    s.add("か")
    s += "き"
    s += "く"
    println("-----")
    println(s)
}