package baekjoon

import java.util.*

/**
 *  https://www.acmicpc.net/problem/11404
 */
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val INF = 1000000000
    val n = nextInt()
    val m = nextInt()
    val graph = Array(n + 1) { IntArray(n + 1) { INF } }
    for (i in 1..n) graph[i][i] = 0
    for (i in 1..m) {
        val a = nextInt()
        val b = nextInt()
        val c = nextInt()
        if (graph[a][b] > c) graph[a][b] = c
    }
    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                if (graph[i][j] > graph[i][k] + graph[k][j]) graph[i][j] = graph[i][k] + graph[k][j]
            }
        }
    }

    for (i in 1..n) {
        for (j in 1..n) {
            if (graph[i][j] == INF) print("0 ")
            else print("${graph[i][j]} ")
        }
        println()
    }
}
