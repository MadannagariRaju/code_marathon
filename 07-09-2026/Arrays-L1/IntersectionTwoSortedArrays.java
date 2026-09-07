import java.util.*;

public class IntersectionTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,2,3,3,4,5,6};
        int arr2[] = {2,3,3,5,6,6,7};

        // Brute Force Approach
        List<Integer>al = new ArrayList<>();
        int visited[] = new int[arr2.length];

        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr2.length;j++) {
                if(arr1[i] == arr2[j] && visited[j] !=1) {
                    visited[j] = 1;
                    al.add(arr1[i]);
                    break;
                }
                if(arr2[j] > arr1[i]) break;
            }
        }
        System.out.println(al);

        // Optimal two pointer approach
        visited = new int[arr2.length];
        al = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr2[j] < arr1[i]) {
                j++;
            }
            else {
                al.add(arr1[i]);
                i++;
                j++;
            }
            
        }
        System.out.println(al);
    }
}
