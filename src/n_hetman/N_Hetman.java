package n_hetman;


public class N_Hetman {

    private int N;
    private int[] board;
    private int solution_count = 0;

    // konstruktor
    public N_Hetman(int N) {
        this.N = N;
        this.board = new int[N];
    }

    private void print_board() {
        Board.print_board(N, board);
    }

    private boolean beatings(int row, int col) {
        for (int prev_row = 0; prev_row < row; prev_row++) {
            int prev_col = board[prev_row];
            if (prev_col == col || Math.abs(prev_row - row) == Math.abs(prev_col - col)) {
                return false;
            }
        }
        return true;
    }

    private void solve(int row) {
        if (row == N) {
            print_board();
            solution_count++;
            return;
        }
        for (int col = 0; col < N; col++) {
            if (beatings(row, col)) {
                board[row] = col;
                solve(row + 1);
            }
        }
    }

    public void solve_n_hetman() {
        solve(0);
        System.out.println("Liczba rozwiazań: " + solution_count);
    }
}
