package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 덧칠하기

class 덧칠하기_테스트 {
    @Test
    fun test1() {
        val n = 8
        val m = 4
        val section = intArrayOf(2, 3, 6)
        val result = 2
        assertEquals(result, 덧칠하기().solution(n, m, section))
    }

    @Test
    fun test2() {
        val n = 5
        val m = 4
        val section = intArrayOf(1, 3)
        val result = 1
        assertEquals(result, 덧칠하기().solution(n, m, section))
    }

    @Test
    fun test3() {
        val n = 4
        val m = 1
        val section = intArrayOf(1, 2, 3, 4)
        val result = 4
        assertEquals(result, 덧칠하기().solution(n, m, section))
    }

    @Test
    fun test4() {
        val n = 4
        val m = 2
        val section = intArrayOf(3, 4)
        val result = 1
        assertEquals(result, 덧칠하기().solution(n, m, section))
    }

    @Test
    fun test5() {
        val n = 5
        val m = 2
        val section = intArrayOf(1, 4, 5)
        val result = 2
        assertEquals(result, 덧칠하기().solution(n, m, section))
    }

    @Test
    fun test6() {
        val n = 100
        val m = 4
        val section = intArrayOf(2, 3, 99)
        val result = 2
        assertEquals(result, 덧칠하기().solution(n, m, section))
    }

    @Test
    fun test7() {
        val n = 100
        val m = 4
        val section = intArrayOf()
        val result = 0
        assertEquals(result, 덧칠하기().solution(n, m, section))
    }
}
