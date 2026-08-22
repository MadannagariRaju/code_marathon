// Count Digits in a Number
// Solved
// Difficulty: EasyAccuracy: 42.13%Submissions: 124K+Points: 2
// Given a number n, return the count of digits in this number.

// Examples :

// Input: n = 1567
// Output: 4
// Explanation: There are 4 digits in 1567, which are 1, 5, 6 and 7.
// Input: n = 99999
// Output: 5
// Explanation: Number of digit in 99999 is 5
// Constraints:
// 1 ≤ n ≤ 109

class CountNumberOfDigits {
    public static int countDigits(int n) {
        // Code here
        // int count = 0;
        // while(n>0) {
        //     count ++;
        //     n=n/10;
            
        // }
        // return count ;
        
        // using log10
        
        int count = (int)Math.log10(n)+1;
        return count;
    }
}
