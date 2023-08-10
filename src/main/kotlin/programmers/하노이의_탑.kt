class 하노이의_탑 {
    fun hanoi(n: Int, from: Int, to: Int, via: Int, answer: MutableList<IntArray>) {
        if (n == 1) {
            answer.add(intArrayOf(from, to))
            return
        }
        hanoi(n - 1, from, via, to, answer)
        answer.add(intArrayOf(from, to))
        hanoi(n - 1, via, to, from, answer)
    }

    fun solution(n: Int): Array<IntArray> {
        val answer = mutableListOf<IntArray>()
        hanoi(n, 1, 3, 2, answer)
        return answer.toTypedArray()
    }
}