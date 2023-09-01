package programmers

import 지형_이동
import kotlin.test.*

internal class 지형_이동Test {

    @Test
    fun `테스트1`() {
        val land = arrayOf(
            intArrayOf(1, 4, 8, 10),
            intArrayOf(5, 5, 5, 5),
            intArrayOf(10, 10, 10, 10),
            intArrayOf(10, 10, 10, 20)
        )
        val height = 3
        val result = 15
        assertEquals(result, 지형_이동().solution(land, height))
    }

    @Test
    fun `테스트2`() {
        val land = arrayOf(
            intArrayOf(10, 11, 10, 11),
            intArrayOf(2, 21, 20, 10),
            intArrayOf(1, 20, 21, 11),
            intArrayOf(2, 1, 2, 1)
        )
        val height = 1
        val result = 18
        assertEquals(result, 지형_이동().solution(land, height))
    }
}