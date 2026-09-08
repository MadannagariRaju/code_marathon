public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;

        // brute force approach (O(n^2))
        // generate all sub arrays and find the longest len
        int len = 0;
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=i;j<arr.length;j++) {
                sum = sum + arr[j];
                if(sum == k) {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        System.out.println("Longest sub array with given sum : " + len);
    }
}