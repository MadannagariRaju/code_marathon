import java.util.Arrays;

public class RightRotateArrayByDPlaces {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 3;
        d = d%n;
        int temp[] = new int[d];
        for(int i=n-d;i<n;i++) {
            temp[i-(n-d)] = arr[i];
        }

        for(int i=n-1;i>=d;i--) {
            arr[i] = arr[i-d];
        }

        for(int i=0;i<d;i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));

        // optimal approach

        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        reverse(arr1,0,d);
        reverse(arr1,d+1,n-1);
        reverse(arr1,0,n-1);

        System.out.println(Arrays.toString(arr1));
    }

    public static void reverse(int arr1[], int i, int j) {
        while(i<=j) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i++;
            j--;
        }
    }
}
