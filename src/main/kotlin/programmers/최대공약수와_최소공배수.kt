class 최대공약수와_최소공배수 {
    fun findLcm(n: Int, m: Int): Int {
        return n * m / findGcd(n, m)
    }

    fun findGcd(n: Int, m: Int): Int {
        var a = n
        var b = m
        var c: Int;
        while (b != 0) {
            c = a % b
            a = b
            b = c
        }
        return a
    }

    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(findGcd(n, m), findLcm(n, m))
    }
}