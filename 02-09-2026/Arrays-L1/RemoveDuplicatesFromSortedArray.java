import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        
        int arr[] = {1, 1, 2, 2, 2, 3, 3};

        //  Brute force approach (Hash set)

        Set<Integer>set = new HashSet<>();

        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        System.out.println("set length : " + set.size());

        int i=0;
        for(Integer value : set) {
            arr[i] = value;
            i++;
        }

        System.out.println(i);

        // Better approach using two pointer approach

        int arr1[] = {1, 1, 2, 2, 2, 3, 3};
        i = 0;
        for(int j =1;j<arr1.length;j++) {
            if(arr1[i] != arr1[j]) {
                arr1[i+1] = arr1[j];
                i++;
            }
        }
        System.out.println(i+1);


    }
}
