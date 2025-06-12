package varsha;


import java.util.*;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (char[] row : board)
            Arrays.fill(row, '.');

        // Start solving from the first row
        solve(0, board, solutions, n);
        return solutions;
    }

    private void solve(int row, char[][] board, List<List<String>> solutions, int n) {
        if (row == n) {
            // All queens placed safely
            solutions.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';            // Place queen
                solve(row + 1, board, solutions, n); // Recur for next row
                board[row][col] = '.';            // Backtrack
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board, int n) {
        // Check column above
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> config = new ArrayList<>();
        for (char[] row : board)
            config.add(new String(row));
        return config;
    }

    public static void main(String[] args) {
        NQueens solver = new NQueens();
        int n = 4;  // Change n to test different board sizes
        List<List<String>> solutions = solver.solveNQueens(n);

        System.out.println("Total Solutions for " + n + "-Queens: " + solutions.size());
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
