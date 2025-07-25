package baekjoon.step10

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, k) = br.readLine()!!.split(" ").map { it.toInt() }

    var count = 0
    var answer = 0

    for (i in 1..n) {
        if (n % i == 0) {
            count++
            if (count == k) {
                answer = i
                break
            }
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}