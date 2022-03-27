import java.util.*;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(0, n);
	}

	public static void printRow(int pos, int n){
		for(int i = 0; i < n; i++){
			if(i == pos || i == n - 1 - pos) System.out.print("*\t");
			else System.out.print("\t");
		}
		System.out.println();
	}

	public static void printPattern(int starPos, int n){
		if(starPos == n/2) {
			printRow(starPos, n);
			return;
		}

		printRow(starPos, n);
		printPattern(starPos + 1, n);
		printRow(starPos, n);
		
	}

}