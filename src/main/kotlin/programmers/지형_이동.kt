import javax.swing.RowFilter
import kotlin.math.abs

class 지형_이동 {
    private val dx = arrayOf(0, 0, 1, -1)
    private val dy = arrayOf(1, -1, 0, 0)

    fun solution(land: Array<IntArray>, height: Int): Int {
        val visited = Array(land.size) { IntArray(land.size) }
        val queue = mutableListOf<Pair<Int, Int>>()
        var answer = 0

        var visitedNumber = 1

        var preAreaMaxValue = 0
        while (visited.any { it.contains(0) }) {
            land.minOf { raw -> raw.minOf { it } }.let {minValue ->
                answer += (if (visitedNumber == 1) 0 else minValue - preAreaMaxValue)
                land.forEachIndexed { y, ints ->
                    ints.forEachIndexed { x, i ->
                        if (i == minValue) {
                            preAreaMaxValue = minValue
                            queue.add(Pair(x, y))
                        }
                    }
                }
            }


            while (queue.isNotEmpty()) {
                val (x, y) = queue.removeAt(0)
                visited[y][x] = visitedNumber

                for (i in 0 until 4) {
                    val nx = x + dx[i]
                    val ny = y + dy[i]

                    if (nx < 0 || nx >= land.size || ny < 0 || ny >= land.size) continue
                    if (visited[ny][nx] > 0) continue

                    val diff = abs(land[y][x] - land[ny][nx])
                    if (diff > height) continue

                    preAreaMaxValue = maxOf(preAreaMaxValue, land[ny][nx])
                    queue.add(Pair(nx, ny))
                }
                land[y][x] = Int.MAX_VALUE
            }
            visitedNumber++
        }

        return answer
    }
}