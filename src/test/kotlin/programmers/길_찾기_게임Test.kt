package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 길_찾기_게임

internal class 길_찾기_게임Test {
    @Test
    fun solution() {
        val nodeinfo = arrayOf(
            intArrayOf(5, 3),
            intArrayOf(11, 5),
            intArrayOf(13, 3),
            intArrayOf(3, 5),
            intArrayOf(6, 1),
            intArrayOf(1, 3),
            intArrayOf(8, 6),
            intArrayOf(7, 2),
            intArrayOf(2, 2)
        )
        val result = 길_찾기_게임().solution(nodeinfo)
        val expected = arrayOf(
            intArrayOf(7, 4, 6, 9, 1, 8, 5, 2, 3),
            intArrayOf(9, 6, 5, 8, 1, 4, 3, 2, 7)
        )
        assertArrayEquals(expected, result)
    }
}