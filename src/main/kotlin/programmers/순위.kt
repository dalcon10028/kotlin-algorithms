class 순위 {
    fun solution(n: Int, results: Array<IntArray>): Int {
        val graph = Array(n) { BooleanArray(n) }

        results.forEach { result ->
            val (winner, loser) = result
            graph[winner - 1][loser - 1] = true
        }

        for (k in 0 until n) {
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (graph[i][k] && graph[k][j]) {
                        graph[i][j] = true
                    }
                }
            }
        }

        var answer = 0
        for (i in 0 until n) {
            var count = 0
            for (j in 0 until n) {
                if (graph[i][j] || graph[j][i]) {
                    count++
                }
            }
            if (count == n - 1) {
                answer++
            }
        }

        return answer
    }
}