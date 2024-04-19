public class hw7_22chat {
        private static final int[] queens = new int[8]; // 存储皇后在每一行的列位置
        public static void main(String[] args) {
            solve(0);
        }

        private static void solve(int row) {
            if (row == 8) {
                print();
                return;
            }

            for (int col = 0; col < 8; col++) {
                if (isValid(row, col)) {
                    queens[row] = col;
                    solve(row + 1);
                }
            }
        }

        private static boolean isValid(int row, int col) {
            for (int i = 0; i < row; i++) {
                if (queens[i] == col || Math.abs(queens[i] - col) == row - i) {
                    return false;
                }
            }
            return true;
        }

        private static void print() {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (queens[i] == j) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

