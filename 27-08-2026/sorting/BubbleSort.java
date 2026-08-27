import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // int arr[] = {13, 46, 24, 52, 20, 9};
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        boolean isSwapped = false;

        for(int i=n-1;i>=0;i--) {
            for(int j=0;j<n-1;j++) {
                if(arr[j] > arr[j+1]) {
                    isSwapped = true;
                    swap(arr,j,j+1);
                }
            }
            if(!isSwapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}

// Time Complexity : O(n^2) in worst and average case
// O(n) in best case where the given array is already swapped
// in the first iteration if you did not find any swap then it means the given array is already swapped right.
// no need to check next iteration so break it. in this case the Time Complexity will be O(n)
