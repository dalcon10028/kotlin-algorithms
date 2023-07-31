package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 추억_점수

class 추억_점수_테스트 {
    @Test
    fun test1() {
        val name = arrayOf("may", "kein", "kain", "radi")
        val yearning = intArrayOf(5, 10, 1, 3)
        val photo = arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni"))
        val problem = 추억_점수()
        assertArrayEquals(intArrayOf(19, 15, 6), problem.solution(name, yearning, photo))
    }

    @Test
    fun test2() {
        val name = arrayOf("kali", "mari", "don")
        val yearning = intArrayOf(11, 1, 55)
        val photo = arrayOf(arrayOf("kali", "mari", "don"), arrayOf("pony", "tom", "teddy"), arrayOf("con", "mona", "don"))
        val problem = 추억_점수()
        assertArrayEquals(intArrayOf(67, 0, 55), problem.solution(name, yearning, photo))
    }

    @Test
    fun test3() {
        val name = arrayOf("may", "kein", "kain", "radi")
        val yearning = intArrayOf(5, 10, 1, 3)
        val photo = arrayOf(arrayOf("may"), arrayOf("kein", "deny", "may"), arrayOf("kon", "coni"))
        val problem = 추억_점수()
        assertArrayEquals(intArrayOf(5, 15, 0), problem.solution(name, yearning, photo))
    }
}