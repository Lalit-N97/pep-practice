import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            printRow(i, 1);
        }

    }

    public static void printRow(int nTabs, int nStars){
        for(int i = 0; i < nTabs; i++) System.out.print("\t");
        for(int i = 0; i < nStars; i++) System.out.print("*\t");
        System.out.println();
    }

}