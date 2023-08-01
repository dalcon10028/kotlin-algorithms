class MergeIntervals {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val sorted = intervals.sortedBy { it[0] }
        val result = mutableListOf<IntArray>()
        var current = sorted[0]
        for (i in 1 until sorted.size) {
            if (current[1] >= sorted[i][0]) {
                current = intArrayOf(current[0], maxOf(current[1], sorted[i][1]))
            } else {
                result.add(current)
                current = sorted[i]
            }
        }
        result.add(current)
        return result.toTypedArray()
    }
}