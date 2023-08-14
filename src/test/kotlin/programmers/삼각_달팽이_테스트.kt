package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 삼각_달팽이

internal class 삼각_달팽이_테스트 {
    @Test
    fun solution() {
        val n = 4
        val result = intArrayOf(1,2,9,3,10,8,4,5,6,7)
        assertArrayEquals(result, 삼각_달팽이().solution(n))
    }

    @Test
    fun solution2() {
        val n = 5
        val result = intArrayOf(1,2,12,3,13,11,4,14,15,10,5,6,7,8,9)
        assertArrayEquals(result, 삼각_달팽이().solution(n))
    }

    @Test
    fun solution3() {
        val n = 6
        val result = intArrayOf(1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11)
        assertArrayEquals(result, 삼각_달팽이().solution(n))
    }
}