package baekjoon.step08

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine()!!)
    var n = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    val sb = StringBuilder()

    while (n > 0) {
        val remainder = n % b
        val digitChar = if (remainder < 10) {
            '0' + remainder
        } else {
            'A' + (remainder - 10)
        }
        sb.append(digitChar)
        n /= b
    }

    bw.write(sb.reverse().toString())

    bw.flush()
    bw.close()
}