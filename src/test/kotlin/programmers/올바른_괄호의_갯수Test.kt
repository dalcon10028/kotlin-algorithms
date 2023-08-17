package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 올바른_괄호의_갯수

internal class 올바른_괄호의_갯수Test {
    @Test
    fun solution() {
        val result = 2
        assertEquals(result, 올바른_괄호의_갯수().solution(2))
    }

    @Test
    fun solution2() {
        val result = 5
        assertEquals(result, 올바른_괄호의_갯수().solution(3))
    }

    @Test
    fun solution3() {
        val result = 14
        assertEquals(result, 올바른_괄호의_갯수().solution(4))
    }
}