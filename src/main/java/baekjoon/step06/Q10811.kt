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
        var i = st.nextToken().toInt()
        var j = st.nextToken().toInt()

        while (i < j) {
            val temp = basket[j - 1]
            basket[j - 1] = basket[i - 1]
            basket[i - 1] = temp
            i++
            j--
        }
    }
    bw.write(basket.joinToString(" "))

    bw.flush()
    bw.close()
}