package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine()!!.toInt()

    repeat(t) {
        val (r, s) = br.readLine().split(" ")
        bw.write(s.flatMap { c -> List(r.toInt()) { c } }.joinToString("") + "\n")
    }
    bw.flush()
    bw.close()
}