package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 공원_산책

class 공원_산책_테스트 {
    @Test
    fun test1() {
        val park = arrayOf("SOO", "OOO", "OOO")
        val routes = arrayOf("E 2", "S 2", "W 1")
        val problem = 공원_산책()
        assertArrayEquals(intArrayOf(2, 1), problem.solution(park, routes))
    }

    @Test
    fun test2() {
        val park = arrayOf("SOO", "OXX", "OOO")
        val routes = arrayOf("E 2", "S 2", "W 1")
        val problem = 공원_산책()
        assertArrayEquals(intArrayOf(0, 1), problem.solution(park, routes))
    }

    @Test
    fun test3() {
        val park = arrayOf("OSO", "OOO", "OXO", "OOO")
        val routes = arrayOf("E 2", "S 3", "W 1")
        val problem = 공원_산책()
        assertArrayEquals(intArrayOf(0, 0), problem.solution(park, routes))
    }
}