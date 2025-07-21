package baekjoon.step08

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x = br.readLine()!!.toLong()

    var k = 1L
    var sum = 1L

    while (sum < x) {
        k++
        sum += k
    }

    val prevSum = sum - k
    val offset = (x - prevSum)

    val numerator: Long
    val denominator: Long

    if (k % 2 == 0L) {
        numerator = offset
        denominator = (k + 1 - offset)
    } else {
        numerator = (k + 1 - offset)
        denominator = offset
    }

    bw.write("$numerator/$denominator")

    bw.flush()
    bw.close()
}