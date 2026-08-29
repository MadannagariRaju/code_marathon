import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int arr[] = {3,2,5,4,1};
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr,low,high);
    }

    public static void mergeSort(int arr[], int low, int high) {

        if(low >= high ) return ; // till it reaches to one element in an array

        int mid = (low + high)/2;
        mergeSort(arr,low,mid);
        // System.out.println("first half  :" + Arrays.toString(arr));
        mergeSort(arr,mid+1,high);
        // System.out.println("second half :" + Arrays.toString(arr));
        merge(arr,low,mid,high);
    }

    public static void merge(int arr[],int low, int mid, int high) {
        System.out.println("merge method :" + Arrays.toString(arr));
        int temp[] = new int[high-low+1];

        int left = low;
        int right = mid+1;
        int j = 0;

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[j] = arr[left];
                left ++;
            }
            else {
                temp[j] = arr[right];
                right++;
            }
            j++;
        }

        // left over elements in first half
        while(left <= mid) {
            temp[j] = arr[left];
            left++;
            j++;
        }

        // left over elements in second half
        while(right <= high ) {
            temp[j] = arr[right];
            right++;
            j++;
        }

        System.out.println(Arrays.toString(temp));

        for(int i=0;i<temp.length;i++) {
            arr[low+i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}