package baekjoon.step07

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine()!!.toInt()

    repeat(t) {
        val st = StringTokenizer(br.readLine()!!)
        val r = st.nextToken().toInt()
        val s = st.nextToken()

        for (i in s.indices) {
            repeat(r) {
                bw.write("${s[i]}")
            }
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}