package baekjoon.step07

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val word = br.readLine()!!

    var time = 0
    for (alphabet in word) {
        time += when (alphabet) {
            in 'A'..'C' -> 3
            in 'D'..'F' -> 4
            in 'G'..'I' -> 5
            in 'J'..'L' -> 6
            in 'M'..'O' -> 7
            in 'P'..'S' -> 8
            in 'T'..'V' -> 9
            else -> 10 // W X Y Z
        }
    }
    bw.write("$time")

    bw.flush()
    bw.close()
}