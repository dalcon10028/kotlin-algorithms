class 튜플 {
    fun solution(s: String): IntArray {
        return s.subSequence(1, s.length - 1).split("},")
            .asSequence()
            .map { it.replace("{", "").replace("}", "") }
            .map { it.split(",").map { it1 -> it1.toInt() } }
            .sortedBy { it.size }
            .flatten()
            .toSet()
            .toIntArray()
    }
}