class 연속된_수의_합{
    fun solution(num: Int, total: Int): IntArray {
        val startNum = total / num - (num - 1) / 2
        return (startNum until startNum + num).toList().toIntArray()
    }
}