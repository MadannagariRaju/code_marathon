import java.util.Arrays;

public class LeftRotateArrayByDplaces {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d =3;
        int n = arr.length;
        d = d%n;
        int temp[] = new int[d];

        // Brute force approach

        for(int i=0;i<temp.length;i++) {
            temp[i] = arr[i];
        }

        for(int i=d;i<n;i++) {
            arr[i-d] = arr[i];
        }

        for(int i=n-d;i<n;i++) {
            arr[i] = temp[i-(n-d)];
        }
        System.out.println(Arrays.toString(arr));


        // optimal approach(look Read.txt)

        int arr1[] = {1,2,3,4,5,6,7};
        
        reverse(arr1,0,d-1);
        reverse(arr1,d,n-1);
        reverse(arr1,0,n-1);

        System.out.println(Arrays.toString(arr1));

    }

    public static void reverse(int arr1[], int i, int j) {
        while (i<=j) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i++;
            j--;
        }
    }
}