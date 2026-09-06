import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int n = 5;

        // brute force approach

        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing number: " + i);
                break;
            }
        }

        // better approach (using hashing)

        int temp[] = new int[n+1];
        for(int i=0;i<arr.length;i++) {
            temp[arr[i]]++;
        }
        for(int i=1;i<temp.length;i++) {
            if(temp[i] == 0) {
                System.out.println(i);
                break;
            }
        }

        // optimal approach
        
        int nSum = 5 * (5 + 1) / 2;
        int sum = 0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            sum = sum + arr[i1];
        }
        System.out.println(nSum - sum);
    }
}
