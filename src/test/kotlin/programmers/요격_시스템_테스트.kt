import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class 요격_시스템_테스트 {
    @Test
    fun test1() {
        // targets	result
        //[[4,5],[4,8],[10,14],[11,13],[5,12],[3,7],[1,4]]	3
        val targets = arrayOf(intArrayOf(4, 5), intArrayOf(4, 8), intArrayOf(10, 14), intArrayOf(11, 13), intArrayOf(5, 12), intArrayOf(3, 7), intArrayOf(1, 4))
        val problem = 요격_시스템()
        assertEquals(3, problem.solution(targets))
    }
}