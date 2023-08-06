package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 저주의_숫자_3

internal class 저주의_숫자_3Test {
    @Test
    fun solution() {
        val n = 15
        val result = 25
        assertEquals(result, 저주의_숫자_3().solution(n))
    }

    @Test
    fun solution2() {
        val n = 40
        val result = 76
        assertEquals(result, 저주의_숫자_3().solution(n))
    }
}