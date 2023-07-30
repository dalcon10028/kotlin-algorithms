class 요격_시스템 {
    fun solution(targets: Array<IntArray>): Int {
        var end = 0
        return targets.sortedBy { it[1] }
            .fold(0) { acc, (s, e) ->
                if (s < end) return@fold acc
                end = e
                return@fold acc + 1
            }
    }
}