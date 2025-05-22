package chapter_08

fun main() {
    val original: Int = 100

    val a: Byte = original.toByte()
    val b: Short = original.toShort()
    val c: Int = original.toInt()
    val d: Long = original.toLong()
    val e: Float = original.toFloat()
    val f: Double = original.toDouble()
    val g: String = original.toString()
    val h: UByte = original.toUByte()
    val i: UShort = original.toUShort()
    val j: UInt = original.toUInt()
    val k: ULong = original.toULong()

    println("a = &a")
    println("a = &b")
    println("a = &c")
    println("a = &d")
    println("a = &e")
    println("a = &f")
    println("a = &g")
    println("a = &h")
    println("a = &i")
    println("a = &j")
    println("a = &k")
}