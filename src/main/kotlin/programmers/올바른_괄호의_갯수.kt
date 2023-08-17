class 올바른_괄호의_갯수 {
    fun solution(n: Int): Int {
        val dp = IntArray(n + 1)
        dp[0] = 1
        dp[1] = 1
        for (i in 2..n) {
            for (j in 0 until i) {
                dp[i] += dp[j] * dp[i - j - 1]
            }
        }
        return dp[n]
    }
}