package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 순위

internal class 순위Test {
    @Test
    fun solution() {
        val n = 5
        val results = arrayOf(
            intArrayOf(4, 3),
            intArrayOf(4, 2),
            intArrayOf(3, 2),
            intArrayOf(1, 2),
            intArrayOf(2, 5)
        )
        val result = 순위().solution(n, results)
        assertEquals(2, result)
    }

    @Test
    fun solution2() {
        val n = 5
        val results = arrayOf(
            intArrayOf(4, 3),
            intArrayOf(4, 2),
            intArrayOf(3, 2),
            intArrayOf(1, 2),
            intArrayOf(2, 5)
        )
        val result = 순위().solution(n, results)
        assertEquals(2, result)
    }
}