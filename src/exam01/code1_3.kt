package exam01

import kotlin.random.Random
import kotlin.random.nextInt

/**
 * お釣りの金種計算
 * ランダムで100~9000の数値を生成します。
 * 支払う金額をキーボードから入力します。
 * お釣りを計算して、金種ごとにその枚数を出力してください。
 * 支払う金額が足りない場合は、「足りません」と出力してください。
 */



fun main() {
    // 100～9000のランダムな金額を生成
    val price = Random.nextInt(100, 9001)
    println("商品代: $price 円")

    print("支払う金額を入力してください: ")
    val payment = readLine()?.toIntOrNull()

    if (payment == null || payment < price) {
        println("足りません")
        return
    }

    val change = payment - price
    println("お釣り: $change 円")

    // 金種の配列（大きい順）
    val denominations = arrayOf(10000, 5000, 1000, 500, 100, 50, 10, 5, 1)

    var remaining = change

    for (denomination in denominations) {
        val count = remaining / denomination
        if (count > 0) {
            println("${denomination}円: ${count}枚")
        }
        remaining %= denomination
    }
}
