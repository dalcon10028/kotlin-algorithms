package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 가장_먼_노드

internal class 가장_먼_노드Test {
    @Test
    fun solution() {
        val n = 6
        val edge = arrayOf(
            intArrayOf(3, 6),
            intArrayOf(4, 3),
            intArrayOf(3, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 2),
            intArrayOf(2, 4),
            intArrayOf(5, 2)
        )
        val expected = 3
        val actual = 가장_먼_노드().solution(n, edge)
        assertEquals(expected, actual)
    }
}