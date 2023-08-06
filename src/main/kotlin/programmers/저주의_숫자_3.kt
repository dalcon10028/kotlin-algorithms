class 저주의_숫자_3 {
    fun solution(n: Int): Int {
        var v = n
        var i = 0
        while (i < v) {
            i ++
            if (i % 3 == 0 || i.toString().contains("3")) {
                v ++
            }
        }
        return i
    }
}