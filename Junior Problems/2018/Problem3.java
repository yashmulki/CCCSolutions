import java.util.Scanner;

public class Problem3 {

    static int[] distances = new int[4];

    // CCC 2018 Problem 3
    public static void no(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        distances[0] = myScanner.nextInt();
        distances[1] = myScanner.nextInt();
        distances[2] = myScanner.nextInt();
        distances[3] = myScanner.nextInt();
        generateDistanceMatrix();
        myScanner.close();
    }

    public static void generateDistanceMatrix() {
        int[][] distanceMatrix = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                distanceMatrix[i][j] = distanceFrom(i,j);
                if (j==4) {
                    System.out.println(distanceMatrix[i][j]);
                }else {
                    System.out.print(distanceMatrix[i][j] + " ");
                }
            }
        }
    }

    public static int distanceFrom(int start, int end) {
        int stepsCount = Math.abs(end-start);
        int distance = 0;
        if (start > end) {
            int b = end;
            end = start;
            start = b;
        }
        for(int i = 0; i < stepsCount; i++) {

            distance += distances[start+i];
        }
        return distance;
    }

}
