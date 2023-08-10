package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 최대공약수와_최소공배수

internal class 최대공약수와_최소공배수Test {
    @Test
    fun solution() {
        val n = 3
        val m = 12
        val result = intArrayOf(3, 12)
        assertArrayEquals(result, 최대공약수와_최소공배수().solution(n, m))
    }

    @Test
    fun solution2() {
        val n = 2
        val m = 5
        val result = intArrayOf(1, 10)
        assertArrayEquals(result, 최대공약수와_최소공배수().solution(n, m))
    }
}