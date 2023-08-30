package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 대충_만든_자판

internal class 대충_만든_자판Test {
    @Test
    fun test() {
        val keymap = arrayOf("ABACD", "BCEFD")
        val targets = arrayOf("ABCD", "AABB")
        val result = 대충_만든_자판().solution(keymap, targets)
        assertArrayEquals(intArrayOf(9, 4), result)
    }

    @Test
    fun test2() {
        val keymap = arrayOf("AA")
        val targets = arrayOf("B")
        val result = 대충_만든_자판().solution(keymap, targets)
        assertArrayEquals(intArrayOf(-1), result)
    }

    @Test
    fun test3() {
        val keymap = arrayOf("AGZ", "BSSS")
        val targets = arrayOf("ASA", "BGZ")
        val result = 대충_만든_자판().solution(keymap, targets)
        assertArrayEquals(intArrayOf(4, 6), result)
    }

    @Test
    fun test4() {
        val keymap = arrayOf("BC", "CDB")
        val targets = arrayOf("BB")
        val result = 대충_만든_자판().solution(keymap, targets)
        assertArrayEquals(intArrayOf(2), result)
    }

    @Test
    fun test5() {
        val keymap = arrayOf("A", "AB", "B")
        val targets = arrayOf("B")
        val result = 대충_만든_자판().solution(keymap, targets)
        assertArrayEquals(intArrayOf(1), result)
    }

    @Test
    fun test6() {
        val keymap = arrayOf("ABCE")
        val targets = arrayOf("ABDE")
        val result = 대충_만든_자판().solution(keymap, targets)
        assertArrayEquals(intArrayOf(-1), result)
    }
}