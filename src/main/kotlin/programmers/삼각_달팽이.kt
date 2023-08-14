class 삼각_달팽이 {
    fun solution(n: Int): IntArray {
        val answer: Array<IntArray> = Array(n) { i -> IntArray(i + 1) }
        var x = -1
        var y = 0
        var num = 1
        for (i in n downTo 1 step 3) {
            for (j in 0 until i) answer[++x][y] = num++
            for (j in 0 until i - 1) answer[x][++y] = num++
            for (j in 0 until i - 2) answer[--x][--y] = num++
        }
        return answer.map { it.toList() }.flatten().toIntArray()
    }
}