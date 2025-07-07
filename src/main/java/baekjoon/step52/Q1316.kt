package baekjoon.step52

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()
    var count = 0
    repeat(n) {
        val word = br.readLine()!!
        val groupWord = mutableSetOf<Char>()
        var prev: Char? = null
        var isGroup = true
        for (ch in word) {
            if (ch != prev) {
                if (groupWord.contains(ch)) {
                    isGroup = false
                    break
                }
                groupWord.add(ch)
            }
            prev = ch
        }
        if (isGroup) {
            count++
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
}