package baekjoon.step52

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val gradeMap = mapOf(
        "A+" to 4.5, "A0" to 4.0,
        "B+" to 3.5, "B0" to 3.0,
        "C+" to 2.5, "C0" to 2.0,
        "D+" to 1.5, "D0" to 1.0,
        "F" to 0.0
    )

    var totalScore = 0.0
    var totalCredit = 0.0

    repeat(20) {
        val st = StringTokenizer(br.readLine()!!)
        val subject = st.nextToken()
        val credit = st.nextToken().toDouble()
        val grade = st.nextToken().toString()

        if (grade == "P") return@repeat

        val score = gradeMap[grade]!!
        totalScore += credit * score
        totalCredit += credit
    }

    bw.write("%.6f".format(totalScore / totalCredit))
    bw.flush()
    bw.close()
}