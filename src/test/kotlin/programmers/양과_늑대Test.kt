package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 양과_늑대

internal class 양과_늑대Test {
    @Test
    fun solution() {
        val info = intArrayOf(0,0,1,1,1,0,1,0,1,0,1,1)
        val edges = arrayOf(
            intArrayOf(0,1),
            intArrayOf(1,2),
            intArrayOf(1,4),
            intArrayOf(0,8),
            intArrayOf(8,7),
            intArrayOf(9,10),
            intArrayOf(9,11),
            intArrayOf(4,3),
            intArrayOf(6,5),
            intArrayOf(4,6),
            intArrayOf(8,9)
        )
        val result = 5
        assertEquals(result, 양과_늑대().solution(info, edges))
    }

    @Test
    fun solution2() {
        val info = intArrayOf(0,1,0,1,1,0,1,0,0,1,0)
        val edges = arrayOf(
            intArrayOf(0,1),
            intArrayOf(0,2),
            intArrayOf(1,3),
            intArrayOf(1,4),
            intArrayOf(2,5),
            intArrayOf(2,6),
            intArrayOf(3,7),
            intArrayOf(4,8),
            intArrayOf(6,9),
            intArrayOf(9,10)
        )
        val result = 5
        assertEquals(result, 양과_늑대().solution(info, edges))
    }
}