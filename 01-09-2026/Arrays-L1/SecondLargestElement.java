import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SecondLargestElement {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,7,7,5};

        // Brute force approach
        // sort the array, and get the slargest from the last index by checking the duplicate values

        // Better approach

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        int slargest = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        // System.out.println(slargest);
        // TC : O(2n) , SC : O(1);


        // Optimal approach

        int lar = arr[0];
        int sLar = -1;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > lar) {
                sLar = lar;
                lar = arr[i];
            }
            else if(arr[i] != lar && arr[i] > sLar) {
                sLar = arr[i];
            }
        }
        System.out.println(sLar);

    }
}