package programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import 바탕화면_정리

class 바탕화면_정리_테스트 {
    @Test
    fun test1() {
        val wallpaper = arrayOf(".#...", "..#..", "...#.")
        val result = intArrayOf(0, 1, 3, 4)
        assertArrayEquals(result, 바탕화면_정리().solution(wallpaper))
    }

    @Test
    fun test2() {
        val wallpaper = arrayOf("..........", ".....#....", "......##..", "...##.....", "....#.....")
        val result = intArrayOf(1, 3, 5, 8)
        assertArrayEquals(result, 바탕화면_정리().solution(wallpaper))
    }

    @Test
    fun test3() {
        val wallpaper = arrayOf(".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#....")
        val result = intArrayOf(0, 0, 7, 9)
        assertArrayEquals(result, 바탕화면_정리().solution(wallpaper))
    }

    @Test
    fun test4() {
        val wallpaper = arrayOf("..", "#.")
        val result = intArrayOf(1, 0, 2, 1)
        assertArrayEquals(result, 바탕화면_정리().solution(wallpaper))
    }
}