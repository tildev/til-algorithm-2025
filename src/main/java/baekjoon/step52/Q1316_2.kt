package baekjoon.step52

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()
    var count = 0
    repeat(n) {
        val word = br.readLine()!!
        if (isGroupWord(word)) count++
    }

    bw.write("$count")
    bw.flush()
    bw.close()
}

fun isGroupWord(word: String): Boolean {
    val seen = mutableSetOf<Char>()
    var prev: Char? = null

    for (c in word) {
        if (c != prev) {
            if (seen.contains(c)) return false
            seen.add(c)
        }
        prev = c
    }

    return true
}