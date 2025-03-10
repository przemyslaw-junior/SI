package n_hetman;


public class Board {

    public static void print_board(int N, int[] board) {
        System.out.print("board = [");
        for (int i = 0; i < N; i++) {
            System.out.print("(" + i + "," + board[i] + ")");
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
