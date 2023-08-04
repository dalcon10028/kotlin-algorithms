class 덧칠하기 {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        if (section.isEmpty()) return 0
        return section.fold(intArrayOf(0, 0)) { acc, s ->
            val ( painted, answer ) = acc
            if (painted >= s) return@fold acc
            intArrayOf(s + m - 1, answer + 1)
        }.last()
    }
}