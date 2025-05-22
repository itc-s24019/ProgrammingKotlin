package exam01

/**
 *映画館の入場料を計算するプログラム
 * シニア ➜ 一般 ➜ 子供の順で人数を入力して
 * 一人あたりの料金はシニア: 1,300円 一般:2,000円 子供:1,000円
 * ただし、１０名以上の場合は、各２００円割引
 */

fun main() {
    print("シニアの人数を入力してください: ")
    val seniorCount = readLine()?.toIntOrNull() ?: 0

    print("一般の人数を入力してください: ")
    val adultCount = readLine()?.toIntOrNull() ?: 0

    print("子供の人数を入力してください: ")
    val childCount = readLine()?.toIntOrNull() ?: 0

    val totalCount = seniorCount + adultCount + childCount

    // 割引の有無によって料金を設定
    val seniorFee = if (totalCount >= 10) 1100 else 1300
    val adultFee = if (totalCount >= 10) 1800 else 2000
    val childFee = if (totalCount >= 10) 800 else 1000

    val totalPrice = seniorCount * seniorFee + adultCount * adultFee + childCount * childFee

    println("合計人数: $totalCount 人")
    println("合計金額: ${totalPrice}円")
}
