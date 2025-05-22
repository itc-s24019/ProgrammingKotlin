package chapter_18

fun main() {
    val s: Set<String> = setOf("あ","い","う","え","お")
    print(s)
    println("-----")
    for (x in s) {
        println(x)
    }
}