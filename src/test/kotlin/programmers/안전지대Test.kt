package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 안전지대

internal class 안전지대Test {
    @Test
    fun solution() {
        val board = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
        val result = 안전지대().solution(board)
        assertEquals(16, result)
    }

    @Test
    fun solution2() {
        val board = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 1, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
        val result = 안전지대().solution(board)
        assertEquals(13, result)
    }

    @Test
    fun solution3() {
        val board = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1)
        )
        val result = 안전지대().solution(board)
        assertEquals(0, result)
    }
}