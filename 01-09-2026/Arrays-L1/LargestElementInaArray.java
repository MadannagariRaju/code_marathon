import java.util.Arrays;

// Largest Element in an array

public class LargestElementInaArray {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,2};
        // Brute force approach
        Arrays.sort(arr);    // TC : O(nlogn) , SC : O(1)
        System.out.println(arr[arr.length-1]);

        // optimal approach

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        // TC : o(n) , SC : O(1)
        System.out.println(largest);
    }
}