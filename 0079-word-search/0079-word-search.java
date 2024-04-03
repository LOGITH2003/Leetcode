class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0)
            return false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] visit = new boolean[board.length][board[0].length];
                Stack<Integer> rowStack = new Stack<>();
                Stack<Integer> colStack = new Stack<>();
                if (word.charAt(0) == board[i][j]) {
                    if (existAns(board, visit, word, i, j, rowStack, colStack, 0))
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean existAns(char[][] board, boolean[][] visit, String word, int row, int col, Stack<Integer> rowStack, Stack<Integer> colStack, int index) {
        if (index == word.length() - 1)
            return true;

        rowStack.push(row);
        colStack.push(col);
        visit[row][col] = true;

        // top view
        if (row > 0 && !visit[row - 1][col] && word.charAt(index + 1) == board[row - 1][col]) {
            if (existAns(board, visit, word, row - 1, col, rowStack, colStack, index + 1))
                return true;
        }

        // bottom view
        if (row + 1 < visit.length && !visit[row + 1][col] && word.charAt(index + 1) == board[row + 1][col]) {
            if (existAns(board, visit, word, row + 1, col, rowStack, colStack, index + 1))
                return true;
        }

        // left view
        if (col > 0 && !visit[row][col - 1] && word.charAt(index + 1) == board[row][col - 1]) {
            if (existAns(board, visit, word, row, col - 1, rowStack, colStack, index + 1))
                return true;
        }

        // right view
        if (col + 1 < visit[0].length && !visit[row][col + 1] && word.charAt(index + 1) == board[row][col + 1]) {
            if (existAns(board, visit, word, row, col + 1, rowStack, colStack, index + 1))
                return true;
        }

        // Backtrack
        rowStack.pop();
        colStack.pop();
        visit[row][col] = false;

        return false;
    }
}