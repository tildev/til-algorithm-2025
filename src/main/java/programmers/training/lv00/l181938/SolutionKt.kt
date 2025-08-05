package programmers.training.lv00.l181938

class SolutionKt {
    fun solution(a: Int, b: Int): Int {
        val ab = "$a$b".toInt()
        val product =  2 * a * b

        return maxOf(ab, product)
    }
}