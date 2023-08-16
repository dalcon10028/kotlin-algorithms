class 양과_늑대 {
    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        val answers: MutableList<Int> = mutableListOf()
        val visited = BooleanArray(info.size)

        fun dfs (sheep: Int, wolf: Int) {
            if (sheep <= wolf) return
            answers.add(sheep)

            for (edge: IntArray in edges) {
                val (p: Int, c: Int) = edge
                if (visited[p] && !visited[c]) {
                    visited[c] = true
                    if (info[c] == 0) dfs(sheep + 1, wolf)
                    else dfs(sheep, wolf + 1)
                    visited[c] = false
                }
            }

        }
        visited[0] = true
        dfs(1, 0)

        return answers.max()
    }
}