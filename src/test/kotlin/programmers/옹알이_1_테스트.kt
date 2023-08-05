package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 옹알이_1

internal class 옹알이_1_테스트 {
    @Test
    fun `옹알이 1 예제 1`() {
        val babbling = arrayOf("aya", "yee", "u", "maa", "wyeoo")
        val result = 1
        assertEquals(result, 옹알이_1().solution(babbling))
    }

    @Test
    fun `옹알이 1 예제 2`() {
        val babbling = arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")
        val result = 3
        assertEquals(result, 옹알이_1().solution(babbling))
    }
}