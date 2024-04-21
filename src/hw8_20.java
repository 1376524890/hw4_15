import java.util.Scanner;

public class hw8_20 {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY = '-';
    private static final char RED = 'R';
    private static final char YELLOW = 'Y';

    private static final char[][] board = new char[ROWS][COLS];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        char currentPlayer = RED;
        boolean gameFinished = false;

        while (!gameFinished) {
            int col = getColumn(currentPlayer);
            dropPiece(currentPlayer, col);
            printBoard();

            if (checkWin(currentPlayer)) {
                System.out.println(currentPlayer + " wins!");
                gameFinished = true;
            } else if (checkDraw()) {
                System.out.println("It's a draw!");
                gameFinished = true;
            }

            currentPlayer = (currentPlayer == RED) ? YELLOW : RED;
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    private static int getColumn(char player) {
        int col;
        while (true) {
            System.out.print("Player " + player + ", enter column (0-6): ");
            col = scanner.nextInt();
            if (col >= 0 && col < COLS && board[0][col] == EMPTY) {
                break;
            } else {
                System.out.println("Invalid column, try again.");
            }
        }
        return col;
    }

    private static void dropPiece(char player, int col) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == EMPTY) {
                board[i][col] = player;
                break;
            }
        }
    }

    private static boolean checkWin(char player) {
        // 检查水平方向
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col <= COLS - 4; col++) {
                if (board[row][col] == player && board[row][col + 1] == player &&
                        board[row][col + 2] == player && board[row][col + 3] == player) {
                    return true;
                }
            }
        }

        // 检查垂直方向
        for (int row = 0; row <= ROWS - 4; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] == player && board[row + 1][col] == player &&
                        board[row + 2][col] == player && board[row + 3][col] == player) {
                    return true;
                }
            }
        }

        // 检查对角线方向
        for (int row = 0; row <= ROWS - 4; row++) {
            for (int col = 0; col <= COLS - 4; col++) {
                if (board[row][col] == player && board[row + 1][col + 1] == player &&
                        board[row + 2][col + 2] == player && board[row + 3][col + 3] == player) {
                    return true;
                }
                if (board[row][col + 3] == player && board[row + 1][col + 2] == player &&
                        board[row + 2][col + 1] == player && board[row + 3][col] == player) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean checkDraw() {
        for (int col = 0; col < COLS; col++) {
            if (board[0][col] == EMPTY) {
                return false;
            }
        }
        return true;
    }
}

