// GCD of two numbers
// Solved
// Difficulty: BasicAccuracy: 51.03%Submissions: 236K+Points: 1
// Given two positive integers a and b, find GCD of a and b.

// Note: Don't use the inbuilt gcd function

// Examples:

// Input: a = 20, b = 28
// Output: 4
// Explanation: GCD of 20 and 28 is 4
// Input: a = 60, b = 36
// Output: 12
// Explanation: GCD of 60 and 36 is 12
// Constraints:
// 1 ≤ a, b ≤ 109



class GCDorHCF {
    public static int gcd(int a, int b) {
        // code here
        // in this approach we will get gcd by iteration from lower to higer number but we want higher number right which is greatest common factor
        // int gcd = 1;
        // for(int i=1;i<=Math.min(a,b);i++) {
        //     if(a%i == 0 && b%i == 0) {
        //         gcd = i;
        //     }
        // }
        // return gcd;
        
        // for(int i = Math.min(a,b);i>=1;i++) {
        //     if(a%i == 0 && b%i == 0){
        //         return i;
        //     }
        // }
        // return 0;
        
        
        // Euclidean Algorithm
        
        while(a>0 && b>0) {
            if(a>b) a = a%b;
            else b = b%a;
        }
        if(a == 0) return b;
        return a;
    }
}
