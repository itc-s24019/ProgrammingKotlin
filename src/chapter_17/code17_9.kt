package chapter_17

fun main() {
    val a: MutableList<String> = mutableListOf(
        "こんにちは","Kotolin","どうぞ","よろしく"
    )
    a.removeAt(2)
    for ((i,x) in a.withIndex()) {
        println("$i : $x")
    }
}