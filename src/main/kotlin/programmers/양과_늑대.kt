class 양과_늑대 {
    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        var answer = 0
        val visited = BooleanArray(info.size)

        fun backTrack(sheep: Int, wolf: Int) {
            if (sheep <= wolf) return
            answer = answer.coerceAtLeast(sheep)

            edges.forEach { edge ->
                val (from, to) = edge
                if (visited[from] && !visited[to]) {
                    visited[to] = true
                    if (info[to] == 0) backTrack(sheep + 1, wolf)
                    else backTrack(sheep, wolf + 1)
                    visited[to] = false
                }
            }

        }

        visited[0] = true
        backTrack(1, 0)

        return answer
    }
}