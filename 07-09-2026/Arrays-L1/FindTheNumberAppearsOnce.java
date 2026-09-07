import java.util.*;

public class FindTheNumberAppearsOnce {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};


        // hashing approach
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        int hash[] = new int[max+1];

        for(int i=0;i<arr.length;i++) {
            hash[arr[i]]++;
        }
        

        for(int i=0;i<hash.length;i++) {
            if(hash[i] == 1) {
                System.out.println(i);
                break;
            }
        }

        // you can also solve using HashMap approach

        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer>entry : map.entrySet()) {
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
