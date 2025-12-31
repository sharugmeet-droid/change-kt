class Change {

    fun issue(amount: Int, denominations: List<Int>): List<Int> {
        require(amount >= 0)

        val dp = Array(amount + 1) { mutableListOf<Int>() }
        dp[0] = mutableListOf()

        for (i in 1..amount) {
            var best: List<Int>? = null

            for (coin in denominations) {
                if (coin <= i && dp[i - coin].isNotEmpty() || i - coin == 0) {
                    val candidate = dp[i - coin] + coin
                    if (best == null || candidate.size < best.size) {
                        best = candidate
                    }
                }
            }

            dp[i] = best?.toMutableList() ?: mutableListOf()
        }

        if (dp[amount].isEmpty() && amount != 0) {
            throw IllegalArgumentException("Cannot make change")
        }

        return dp[amount].sorted()
    }
}
