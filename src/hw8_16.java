public class hw8_16 {

    public static void sort(int[][] m) {
        sortRows(m);
        sortColumns(m);
    }
    // 对行进行排序
    private static void sortRows(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m.length - i - 1; j++) {
                if (compareRows(m[j], m[j + 1]) > 0) {
                    int[] temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = temp;
                }
            }
        }
    }
    // 对列进行排序
    private static void sortColumns(int[][] m) {
        for (int col = 0; col < m[0].length; col++) {
            for (int i = 0; i < m.length - 1; i++) {
                for (int j = 0; j < m.length - i - 1; j++) {
                    if (m[j][col] > m[j + 1][col]) {
                        int temp = m[j][col];
                        m[j][col] = m[j + 1][col];
                        m[j + 1][col] = temp;
                    }
                }
            }
        }
    }

    // 比较两行
    private static int compareRows(int[] row1, int[] row2) {
        for (int i = 0; i < row1.length; i++) {
            if (row1[i] != row2[i]) {
                return Integer.compare(row1[i], row2[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        System.out.println("Original array:");
        printArray(array);

        sort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
