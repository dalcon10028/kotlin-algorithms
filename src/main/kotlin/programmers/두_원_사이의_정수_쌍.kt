import kotlin.math.*

class 두_원_사이의_정수_쌍 {
    fun solution(r1: Int, r2: Int): Long {
        return (1..r2).fold(0.0) { count, r ->
             count + floor(sqrt(1.0 * r2 * r2 - 1.0 * r * r)).toInt() - ceil(sqrt(1.0 * r1 * r1 - 1.0 * r * r)).toInt() + 1
        }.toLong() * 4
    }
}