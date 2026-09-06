import java.util.*;

public class UnionTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5};
        int arr2[] = {2,3,4,4,5,6};

        // brute force approach 
        Set<Integer>set = new HashSet<>();

        for(int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++) {
            set.add(arr2[i]);
        }

        int union[] = new int[set.size()];

        int j1 = 0;
        for(int i : set) {
            union[j1] = i;
            j1++;
        }
        System.out.println("brute : "+Arrays.toString(union));

        // optimal approach  -> two pointer approach

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer>al = new ArrayList<>();
        while(i < n1 && j < n2) {
            if(al.contains(arr1[i])){
                i++;
                continue;
            }
            if(al.contains(arr2[j])) {
                j++;
                continue;
            }
            // System.out.println(al);
            System.out.println(arr1[i]+ "  "  +arr2[j]);
            if(arr1[i] <= arr2[j]) {
                al.add(arr1[i]);
                i++;
            }
            else {
                al.add(arr2[j]);
                j++;
            }
            }

        while (i<n1) {
            if(al.contains(arr1[i])) {
                i++;
                continue;
            }
            else{
                al.add(arr1[i]);
            }
        }
        while (j<n2) {
            if(al.contains(arr2[j])) {
                j++;
                continue;
            }
            else {
                al.add(arr2[j]);
            }         
        }

        System.out.println("optimal : "+al);

    }
}