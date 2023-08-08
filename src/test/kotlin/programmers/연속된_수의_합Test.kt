package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 연속된_수의_합

internal class 연속된_수의_합Test {
    @Test
    fun solution() {
        val num = 3
        val total = 12
        val result = 연속된_수의_합().solution(num, total)
        assertArrayEquals(intArrayOf(3, 4, 5), result)
    }

    @Test
    fun solution2() {
        val num = 5
        val total = 15
        val result = 연속된_수의_합().solution(num, total)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), result)
    }

    @Test
    fun solution3() {
        val num = 4
        val total = 14
        val result = 연속된_수의_합().solution(num, total)
        assertArrayEquals(intArrayOf(2, 3, 4, 5), result)
    }

    @Test
    fun solution4() {
        val num = 5
        val total = 5
        val result = 연속된_수의_합().solution(num, total)
        assertArrayEquals(intArrayOf(-1, 0, 1, 2, 3), result)
    }
}