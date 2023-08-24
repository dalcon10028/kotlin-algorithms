class 단어_변환 {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        var answer = 0
        val visited = BooleanArray(words.size) { false }
        val queue = mutableListOf(begin)
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val current = queue.removeAt(0)
                if (current == target) return answer
                for (j in words.indices) {
                    if (visited[j]) continue
                    if (isConvertable(current, words[j])) {
                        visited[j] = true
                        queue.add(words[j])
                    }
                }
            }
            answer++
        }
        return 0
    }

    private fun isConvertable(current: String, s: String): Boolean {
        var count = 0
        for (i in current.indices) {
            if (current[i] != s[i]) {
                count++
            }
        }
        return count == 1
    }
}