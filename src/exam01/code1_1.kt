package exam01

/**
 * キーボードから数字を入力して、１から入力された数までの
 * FizzBuzz を出力します。
 *
 * FizzBuzzとは
 * 3の倍数のときに Fizz
 * ５の倍数のときに Buzz
 * ３と５の倍数のときに FizzBuss
 * それ以外のときは 数字をそのまま出力する
 * よくあるプログラムの演習問題です
 */
//fun main() {
//    print("数字を入力してください: ")
//    val input = readLine()
//    val number = input?.toIntOrNull()
//
//    if (number == null || number <= 0) {
//        println("正の整数を入力してください。")
//        return
//    }
//
//    for (i in 1..number) {
//        when {
//            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
//            i % 3 == 0 -> println("Fizz")
//            i % 5 == 0 -> println("Buzz")
//            else -> println(i)
//        }
//    }
//}

fun main() {
    print("数字を入力してください:")
    val end = readln().toInt()
    (1..end).forEach {
        val result = if(it % 15 == 0) {
            "FizzBuzz"
        }else if (it % 5 == 0) {
            "Buzz"
        }else if (it % 3 == 0) {
            "Fizz"
        }else {
            it.toString()
        }
        println(result)
    }
}