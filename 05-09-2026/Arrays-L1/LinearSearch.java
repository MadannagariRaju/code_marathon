public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {6,7,8,4,1};
        int num = 4;
        int n = arr.length;

        for(int i=0;i<n;i++) {
            if(arr[i] == num) {
                System.out.println(i);
                break;
            }
        }
    }
}
