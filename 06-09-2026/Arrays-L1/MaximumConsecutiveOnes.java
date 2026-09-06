public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                if(max < count) {
                    max = count;
                    count = 0;
                }
            }
            else {
                count++;
            }
        }
        System.out.println("count : " + max);
    }
}
