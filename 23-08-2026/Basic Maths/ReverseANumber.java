// Reverse Digits
// Solved
// Difficulty: BasicAccuracy: 46.92%Submissions: 155K+Points: 1
// You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

// Examples:

// Input: n = 122
// Output: 221
// Explanation: By reversing the digits of number, number will change into 221.
// Input : n = 200
// Output: 2
// Explanation: By reversing the digits of number, number will change into 2.
// Input : n = 12345 
// Output: 54321
// Explanation: By reversing the digits of number, number will change into 54321.
// Constraints:

// 1 ≤ n ≤ 106


class ReverseANumber {
    public int reverseDigits(int n) {
        // Code here
        int sum = 0;
        while(n>0) {
            int lastDigit = n%10;
            sum = (sum*10) + lastDigit;
            n=n/10;
        }
        return sum;
    }
}