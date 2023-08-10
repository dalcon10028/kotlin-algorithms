package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 하노이의_탑

internal class 하노이의_탑Test {

    @Test
    fun solution() {
        val c = 하노이의_탑()
        assertArrayEquals(
            arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3)),
            c.solution(2)
        )
    }
}