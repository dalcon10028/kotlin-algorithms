package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 두_원_사이의_정수_쌍

class 두_원_사이의_정수_쌍_테스트 {
    @Test
    fun test1() {
        val r1 = 2
        val r2 = 3
        val problem = 두_원_사이의_정수_쌍()
        assertEquals(20, problem.solution(r1, r2))
    }

    @Test
    fun test2() {
        val r1 = 25
        val r2 = 39
        val problem = 두_원_사이의_정수_쌍()
        assertEquals(2836, problem.solution(r1, r2))
    }
}