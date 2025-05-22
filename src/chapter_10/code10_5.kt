package chapter_10

fun main() {
//  val  rangeA = 0..10
    val rangeA = 0..10
    val max = 5
    val rangeB = 0..max
    val rangeC = 0..max

    println("9 rangeA: ${9 in rangeA}")
    println("10 rangeA: ${10 in rangeA}")
    println("4 rangeB: ${4 in rangeB}")
    println("5 rangeB: ${5 in rangeB}")
    println("4 rangeC: ${4 in rangeC}")
    println("5 rangeC: ${5 in rangeC}")

}