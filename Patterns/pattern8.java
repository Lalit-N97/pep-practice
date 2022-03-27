import java.util.*;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(0, 0, n);
	}

	public static void printPattern(int row, int col, int n){

		if(row == n) return;

		if(col == n){
			System.out.println();
			printPattern(row + 1, 0, n);
			return;
		}

		if(row + col == n - 1) {
			System.out.print("*");
		}

		System.out.print("\t");
		printPattern(row, col + 1, n);
	}

}