package leetcode

import MergeIntervals
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MergeIntervalsTest {
    @Test
    fun test1() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
        val problem = MergeIntervals()
        assertArrayEquals(arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)), problem.merge(intervals))
    }

    @Test
    fun test2() {
        val intervals = arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))
        val problem = MergeIntervals()
        assertArrayEquals(arrayOf(intArrayOf(1, 5)), problem.merge(intervals))
    }
}