import java.util.Scanner;
public class Problem2 {
    public static void mbain(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numberOfSlots = myScanner.nextInt();
        int bothOccupied = 0;
        String todayInput = myScanner.next();
        String yesterdayInput = myScanner.next();
        for(int i = 0; i < numberOfSlots; i++) {
            if ((todayInput.charAt(i) == yesterdayInput.charAt(i)) && todayInput.charAt(i) == 'C' ) {
                bothOccupied++;
            }
        }

        System.out.println(bothOccupied);

    }
}
