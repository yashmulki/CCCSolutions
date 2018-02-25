import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
	// write your code here

        Scanner myScanner = new Scanner(System.in);
        int[] numbers = new int[4];
        numbers[0] = myScanner.nextInt();
        numbers[1] = myScanner.nextInt();
        numbers[2] = myScanner.nextInt();
        numbers[3] = myScanner.nextInt();

        Boolean isTelemarketerNumber = true;

        if (numbers[0] == 8 || numbers[0] == 9) {

        } else {
            isTelemarketerNumber = false;
        }

        if (numbers[3] == 8 || numbers[3] == 9) {

        } else {
            isTelemarketerNumber = false;
        }

        if (numbers[1] == numbers[2]) {

        } else {
            isTelemarketerNumber = false;
        }

        if (isTelemarketerNumber == true) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }

    }
}
