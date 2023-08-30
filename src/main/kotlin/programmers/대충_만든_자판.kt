class 대충_만든_자판 {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        return targets.map { target ->
            val b = target.map { char ->
                val a = keymap.map { it.indexOf(char) + 1 }
                if (a.sum() == 0) return@map -1 else a.filter { it > 0 }.minOf { it }
            }
            if (b.contains(-1)) return@map -1 else b.sum()
        }.toIntArray()
    }
}