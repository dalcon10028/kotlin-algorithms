package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 이중우선순위큐

internal class 이중우선순위큐Test {
    @Test
    fun solution() {
        val operations = arrayOf("I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1")
        val result = 이중우선순위큐().solution(operations)
        assertArrayEquals(intArrayOf(0, 0), result)
    }

    @Test
    fun solution2() {
        val operations = arrayOf("I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333")
        val result = 이중우선순위큐().solution(operations)
        assertArrayEquals(intArrayOf(333, -45), result)
    }
}