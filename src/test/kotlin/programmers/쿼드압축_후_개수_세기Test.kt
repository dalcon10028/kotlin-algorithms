package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 쿼드압축_후_개수_세기

internal class 쿼드압축_후_개수_세기Test {
    @Test
    fun solution() {
        val arr1 = arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 0, 0, 1),
            intArrayOf(1, 1, 1, 1)
        )
        val result1 = intArrayOf(4, 9)

        assertArrayEquals(result1, 쿼드압축_후_개수_세기().solution(arr1))

    }

    @Test
    fun solution2() {
        val arr2 = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1),
            intArrayOf(0, 1, 1, 1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 1, 1, 1, 1),
            intArrayOf(0, 1, 0, 0, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0, 0, 1, 1),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 1, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 1, 1, 1, 1)
        )

        val result2 = intArrayOf(10, 15)
        assertArrayEquals(result2, 쿼드압축_후_개수_세기().solution(arr2))
    }

}