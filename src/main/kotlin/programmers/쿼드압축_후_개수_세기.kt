class 쿼드압축_후_개수_세기 {
    private val answer: IntArray = intArrayOf(0, 0)
    private fun isZipable(arr: Array<IntArray>, x: Int, y: Int, size: Int): Boolean {
        val first = arr[x][y]
        for (i in x until x + size) {
            for (j in y until y + size) {
                if (arr[i][j] != first) return false
            }
        }
        return true
    }

    private fun quadTreeZip(arr: Array<IntArray>, x: Int, y: Int, size: Int) {
        if (isZipable(arr, x, y, size)) {
            if (arr[x][y] == 0) answer[0]++
            else answer[1]++
        }
        else {
            val half = size / 2
            quadTreeZip(arr, x, y, half)
            quadTreeZip(arr, x + half, y, half)
            quadTreeZip(arr, x, y + half, half)
            quadTreeZip(arr, x + half, y + half, half)
        }
    }

    fun solution(arr: Array<IntArray>): IntArray {
        quadTreeZip(arr, 0, 0, arr.size)
        return answer
    }
}