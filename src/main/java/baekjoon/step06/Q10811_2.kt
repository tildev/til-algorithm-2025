package baekjoon.step06

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var st = StringTokenizer(br.readLine()!!)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val basket = IntArray(n) { it + 1 }

    repeat(m) {
        st = StringTokenizer(br.readLine()!!)
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()

        basket.reverse(i - 1, j)
    }
    bw.write(basket.joinToString(" "))

    bw.flush()
    bw.close()
}