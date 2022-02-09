import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        // printPatternIteratively(n);
        printPatternRecursively(1, n/2 + 1);
    }

    public static void printRow(int nTabs, int nStars){
        for(int i = 0; i < nStars; i++) System.out.print("*\t");
        for(int i = 0; i < nTabs; i++) System.out.print("\t");
        for(int i = 0; i < nStars; i++) System.out.print("*\t");
        System.out.println();
    }

    public static void printPatternIteratively(int n){
        for(int i = 0; i < n; i++){
            if(i <= n/2) printRow(2*i + 1, (n/2 - i) + 1);
            else printRow(2*(n - i) - 1, (i - n/2) + 1);
        }
    }

    public static void printPatternRecursively(int nTabs, int nStars){
        if(nStars == 1){
            printRow(nTabs, nStars);
            return;
        }

        printRow(nTabs, nStars);
        printPatternRecursively(nTabs + 2, nStars - 1);
        printRow(nTabs, nStars);
    }


}