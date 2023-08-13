package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 튜플

internal class 튜플Test {
    @Test
    fun solution() {
        val s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}"
        val result1 = intArrayOf(2, 1, 3, 4)
        assertArrayEquals(result1, 튜플().solution(s1))
    }

    @Test
    fun solution2() {
        val s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}"
        val result2 = intArrayOf(2, 1, 3, 4)
        assertArrayEquals(result2, 튜플().solution(s2))
    }

    @Test
    fun solution3() {
        val s3 = "{{20,111},{111}}"
        val result3 = intArrayOf(111, 20)
        assertArrayEquals(result3, 튜플().solution(s3))
    }

    @Test
    fun solution4() {
        val s4 = "{{123}}"
        val result4 = intArrayOf(123)
        assertArrayEquals(result4, 튜플().solution(s4))
    }

    @Test
    fun solution5() {
        val s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}"
        val result5 = intArrayOf(3, 2, 4, 1)
        assertArrayEquals(result5, 튜플().solution(s5))
    }
}