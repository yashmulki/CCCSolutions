import java.util.Scanner;
public class Problem4 {

	static int n;
	static int[][] table;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		n = myScanner.nextInt();
		table = new int[n][n];
	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				table[i][j] = myScanner.nextInt();
			}
		}
		
		if(isCorrect(table)) {
			printTable();
			return;
		}
		table = rotate();
		if(isCorrect(table)) {
			printTable();
			return;
		}
		table = rotate();
		if(isCorrect(table)) {
			printTable();
			return;
		}
		table = rotate();
		if(isCorrect(table)) {
			printTable();
			return;
		}
		
	}
	
	public static void printTable() {
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n-1) {
					System.out.println(table[i][j]);
				}else {
					System.out.print(table[i][j] + " ");
				}
			}
		}
	}
	
	public static int[][] rotate(){
		int[][] rotatedArray = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//index of table i,j
				rotatedArray[i][j] = table[n-1-j][i];
			}
		}
	
		return rotatedArray;
	}

	public static Boolean isCorrect(int[][] table) {
		Boolean isCorrect = true;
		int maximumY = table[0][0] - 1;
		for(int i = 0; i < n; i++) {
			if (table[i][0] <= maximumY) {
				isCorrect = false;
			} else {
				maximumY = table[i][0];
			}
			
			int minimumX = table[i][0] - 1;
			for (int j = 0; j < n; j++) {
				if (table[i][j] <= minimumX) {
					isCorrect = false;
				}else {
					minimumX = table[i][j];
				}
			}
			
		}
				
		return isCorrect;
	}
	
}
