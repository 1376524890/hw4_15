import java.util.Scanner;

public class hw8_6 {

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        double[][] c = new double[rowsA][colsB];
        int to1f;

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    to1f = (int)(c[i][j]*10);
                    c[i][j] = (double) to1f /10;
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix1:");
        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter matrix2:");
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // 计算乘积
        double[][] result = multiplyMatrix(matrix1, matrix2);

        System.out.println("The multiplication of the matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

