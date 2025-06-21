package baekjoon.step03

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine()!!.toInt()

    for (i in 1..n) {
        for (k in n - i downTo 1) {
            bw.write(" ")
        }
        for (j in 1..i) {
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}