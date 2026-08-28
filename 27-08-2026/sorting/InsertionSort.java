import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {14, 9, 15, 12, 6, 8, 13};
        int n = arr.length;

        for(int i=0;i<=n-1;i++) {
            int j=i;
            while(j > 0 && arr[j-1] > arr[j]) {
                swap(arr, j-1, j);
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int m , int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}