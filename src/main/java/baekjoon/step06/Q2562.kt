package baekjoon.step06

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = 9
    var index = 1
    var maxIndex = 1
    var max = Int.MIN_VALUE
    repeat(n) {
        val num = br.readLine()!!.toInt()
        if (num > max) {
            max = num
            maxIndex = index
        }
        index++
    }
    bw.write("$max\n$maxIndex")
    bw.flush()
    bw.close()
}