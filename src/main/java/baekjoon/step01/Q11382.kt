package baekjoon.step01

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    /**
     * Int의 최대값: 2,147,483,647 (약 2 * 10⁹)
     * Long의 최대값: 9,223,372,036,854,775,807 (약 9 * 10¹⁸)
     * 문제에서 주어진 10¹²는 Int 범위를 초과함
     */
    val a = st.nextToken().toLong()
    val b = st.nextToken().toLong()
    val c = st.nextToken().toLong()

    println(a + b + c)
}