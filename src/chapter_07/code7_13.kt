package chapter_07

fun main() {
    println("true xor true: ${true xor true}")
    println("true xor true: ${true xor false}")
    println("true xor true: ${false xor true}")
    println("true xor true: ${false xor false}")

    val a =  true
    val b = false

    !a && !b == !(a || b)
    !a || !b == !(a && b)

}