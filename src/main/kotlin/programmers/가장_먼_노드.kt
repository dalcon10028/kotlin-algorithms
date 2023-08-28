class 가장_먼_노드 {
    fun solution(n: Int, edge: Array<IntArray>): Int {
        val graph = Array(n + 1) { mutableListOf<Int>() }
        val visited = BooleanArray(n + 1) { false }
        val distance = IntArray(n + 1) { 0 }
        edge.forEach {
            graph[it[0]].add(it[1])
            graph[it[1]].add(it[0])
        }
        val queue = mutableListOf<Int>()
        queue.add(1)
        visited[1] = true
        while (queue.isNotEmpty()) {
            val node = queue.removeAt(0)
            graph[node].forEach {
                if (!visited[it]) {
                    queue.add(it)
                    visited[it] = true
                    distance[it] = distance[node] + 1
                }
            }
        }
        val max = distance.maxOrNull()!!
        return distance.count { it == max }
    }
}