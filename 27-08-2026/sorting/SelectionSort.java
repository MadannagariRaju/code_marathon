import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        for(int i=0;i<=n-2;i++) {
            int min = i;
            for(int j=i;j<=n-1;j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr,i,min);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}

// Time Complexity :  O(n^2) in Best, average, worst cases