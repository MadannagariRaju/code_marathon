import java.util.Arrays;

public class NumberHashing {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,4,5,3,6,2,1,20};

        // here 20 is the size we are assuming but maximum array may be 10^7, check once
        // or we can take maximum number from the given array and declare the size of hash array. simple !!!!

        int hash[] = new int[21]; // size can upto maximum int array size beyound that we will get outOfMemoryError
        
        for(int i=0;i<a.length;i++) {
            hash[a[i]]++;
        }

        System.out.println(Arrays.toString(hash));
    }
    
}
