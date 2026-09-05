import java.util.Arrays;

public class MoveZerosToTheEndOfArray {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        int n = arr.length;

        // Brute force approach
        int temp[] = new int[n];

        int zeros = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] == 0) zeros++;
        }

        int j =0;
        for(int i=0;i<n;i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i=j;i<n;i++) {
            temp[i]=0;
        }
        System.out.println(Arrays.toString(temp));


        // optimal approach

        int j1 = -1;
        for(int i=0;i<n;i++) {
            if(arr[i]==0) {
                j1 = i;
                break;
            }
        }

        for(int i=j1+1;i<n;i++) {
            if(arr[i]!=0) {
                swap(arr,i,j1);
                j1++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}