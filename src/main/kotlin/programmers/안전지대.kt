class 안전지대 {
    fun solution(board: Array<IntArray>): Int {
        for (row in board.indices) {
            for (col in board[row].indices) {
                if (board[row][col] == 1) {
                    if (row-1 >= 0 && col -1 >= 0 && board[row-1][col-1] != 1) board[row-1][col-1] = 2
                    if (row-1 >= 0 && board[row-1][col] != 1) board[row-1][col] = 2
                    if (row-1 >= 0 && col + 1 < board[row].size && board[row-1][col+1] != 1) board[row-1][col+1] = 2
                    if (col -1 >= 0 && board[row][col-1] != 1) board[row][col-1] = 2
                    if (col + 1 < board[row].size && board[row][col+1] != 1) board[row][col+1] = 2
                    if (row+1 < board.size && col -1 >= 0 && board[row+1][col-1] != 1) board[row+1][col-1] = 2
                    if (row+1 < board.size && board[row+1][col] != 1) board[row+1][col] = 2
                    if (row+1 < board.size && col + 1 < board[row].size && board[row+1][col+1] != 1) board[row+1][col+1] = 2
                }
            }
        }

        return board.sumOf { row -> row.count { it == 0 } }
    }
}