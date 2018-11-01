import java.util.Scanner;

public class Sunflowers {
    private static int n, mat[][];

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            mat = new int[n][n];

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    mat[i][j] = sc.nextInt();
                }
            }

            while (!isOriginal()) {
                rotate();
            }

            for (int[] row : mat) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

    private static void rotate() {
        int[][] newMat = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                newMat[j][n - i - 1] = mat[i][j];
            }
        }
        mat = newMat;
    }

    private static boolean isOriginal() {
        for (int i = 0; i < n - 1; ++i) {
            if (mat[i + 1][0] < mat[i][0]) {
                return false;
            }
            for (int j = 0; j < n - 1; ++j) {
                if (mat[i][j + 1] < mat[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
