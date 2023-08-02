class 공원_산책 {

    private fun checkBoundaries(park: Array<String>, y: Int, x: Int): Boolean {
        return y in park.indices && x in park[y].indices
    }

    private fun checkObstacle(park: Array<String>, y: Int, x: Int): Boolean {
        return park[y][x] == 'X'
    }

    private fun getStartPos(park: Array<String>): IntArray {
        park.forEachIndexed { y, row ->
            row.forEachIndexed { x, cell ->
                if (cell == 'S') {
                    return intArrayOf(y, x)
                }
            }
        }
        return intArrayOf(0, 0)
    }

    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        return routes.fold(getStartPos(park)) { acc, route ->
            val (direction, distance) = route.split(" ")
            val (y1, x1) = acc
            when (direction) {
                "E" -> {
                    val movedX = x1 + distance.toInt()
                    (x1 .. movedX).forEach { x ->
                        if (!checkBoundaries(park, y1, x) || checkObstacle(park, y1, x)) {
                            return@fold intArrayOf(y1, x1)
                        }
                    }
                    intArrayOf(y1, movedX)
                }
                "W" -> {
                    val movedX = x1 - distance.toInt()
                    (movedX .. x1).forEach { x ->
                        if (!checkBoundaries(park, y1, x) || checkObstacle(park, y1, x)) {
                            return@fold intArrayOf(y1, x1)
                        }
                    }
                    intArrayOf(y1, movedX)
                }
                "S" -> {
                    val movedY = y1 + distance.toInt()
                    (y1 .. movedY).forEach { y ->
                        if (!checkBoundaries(park, y, x1) || checkObstacle(park, y, x1)) {
                            return@fold intArrayOf(y1, x1)
                        }
                    }
                    intArrayOf(movedY, x1)
                }
                "N" -> {
                    val movedY = y1 - distance.toInt()
                    (movedY .. y1).forEach { y ->
                        if (!checkBoundaries(park, y, x1) || checkObstacle(park, y, x1)) {
                            return@fold intArrayOf(y1, x1)
                        }
                    }
                    intArrayOf(movedY, x1)
                }
                else -> intArrayOf(y1, x1)
            }
        }
    }
}