class 옹알이_1 {
    fun solution(babbling: Array<String>): Int {
        val canBabblings = listOf("aya", "ye", "woo", "ma")

        return babbling.count { b: String ->
            b.isNotBlank() && canBabblings.fold(b) { acc, s -> acc.replace(s, "#") }.matches("#+".toRegex())
        }
    }
}