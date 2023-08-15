class 합승_택시_요금 {
    val INF = 20000000

    fun solution(n: Int, s: Int, a: Int, b: Int, fares: Array<IntArray>): Int {
        var answer: Int = INF
        val dist = Array(n + 1) { IntArray(n + 1) { INF } }
        for (i in 1..n) dist[i][i] = 0
        for (fare in fares) {
            dist[fare[0]][fare[1]] = fare[2]
            dist[fare[1]][fare[0]] = fare[2]
        }
        for (k in 1..n) {
            for (i in 1..n) {
                for (j in 1..n) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) dist[i][j] = dist[i][k] + dist[k][j]
                }
            }
        }
        for (i in 1..n) {
            if (answer > dist[s][i] + dist[i][a] + dist[i][b]) answer = dist[s][i] + dist[i][a] + dist[i][b]
        }
        return answer
    }
}