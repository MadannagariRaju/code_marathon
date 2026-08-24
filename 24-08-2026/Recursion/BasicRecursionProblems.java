// package Recursion;

public class BasicRecursionProblems {

    public static void printNameRecursive(int n, int m) {
        if(n>m) return;
        n++;
        System.out.println("Raju");
        printNameRecursive(n,m);
    }

    public static void printNumbersLinearly(int n, int m) {
        if(n > m){
            return;
        }
        System.out.println(n);
        n++;
        printNumbersLinearly(n, m);
    }


    public static void printNumbersReverse(int n, int m) {
        if(n < m){
            return;
        }
        System.out.println(n);
        n--;
        printNumbersReverse(n,m);
    }

    public static void printNumbersLinearlyByBackTracking(int n, int m) {
        if(n < 1) return ;
        printNumbersLinearlyByBackTracking(n-1, m);
        System.out.println(n);
    
    }

    public static void printNumbersReverseByBackTracking(int n, int m) {
        if(n>m) return;
        printNumbersReverseByBackTracking(n+1, m);
        System.out.println(n);
    }
    public static void main(String args[]) {

        // Problems
        // 1. print Name 5 times
        // printNameRecursive(1,5);

        // 2.print from 1 to N
        // printNumbersLinearly(1,10);

        // 3. print linearly from N to 1
        // printNumbersReverse(10, 1);

        // 4. print from 1 to N (By BackTracking)
        // printNumbersLinearlyByBackTracking(3,3);

        // 5. print from N to 1 (By BackTracking)
        printNumbersReverseByBackTracking(1,3);
    }
}
