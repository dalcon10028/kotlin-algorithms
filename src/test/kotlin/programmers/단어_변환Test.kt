package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 단어_변환

internal class 단어_변환Test {
    @Test
    fun solution() {
        val begin = "hit"
        val target = "cog"
        val words = arrayOf("hot", "dot", "dog", "lot", "log", "cog")
        val result = 4
        assertEquals(result, 단어_변환().solution(begin, target, words))
    }

    @Test
    fun solution2() {
        val begin = "hit"
        val target = "cog"
        val words = arrayOf("hot", "dot", "dog", "lot", "log")
        val result = 0
        assertEquals(result, 단어_변환().solution(begin, target, words))
    }
}