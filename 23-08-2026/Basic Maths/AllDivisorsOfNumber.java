// All Divisors of a Number
// Solved
// Difficulty: EasyAccuracy: 46.73%Submissions: 185K+Points: 2Average Time: 10m
// Given an integer n, return all the divisors of n in the ascending order.
 
// Examples:

// Input : n = 20
// Output: 1 2 4 5 10 20
// Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.
// Input: n = 21191
// Output: 1 21191
// Explanation: As 21191 is a prime number, it has only 2 factors(1 and the number itself).
// Constraints:
// 1 ≤ n ≤ 109


class AllDivisorsOfNumber {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer>result = new ArrayList<>();
        
        // Brute force Approach
        
        // for(int i=1;i<=n;i++) {
        //     if(n%i == 0) {
        //         result.add(i);
        //     }
        // }
        
        // optimal approach
        
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i == 0){
                result.add(i);
                if((n/i)!=i) {
                    result.add(n/i);
                }
            }
        }
        Collections.sort(result);
        return result ;
        
    }
}