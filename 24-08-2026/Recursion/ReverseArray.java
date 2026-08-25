import java.util.Arrays;

public class ReverseArray {

    public static void reverseArrayUsingRecursion(int a[], int l, int r) {
        if(l >= r) {
            System.out.println("reversed Array : " + Arrays.toString(a));
            return;
        }
        swap(a,l,r);
        reverseArrayUsingRecursion(a, l+1, r-1);
    }

    public static void reverseArrayUsingRecursionBySingleVariable(int a[], int l) {
        int n = a.length;

        if(l > n/2) {
            System.out.println("reversed Array : " + Arrays.toString(a));
            return;
        }
        swap(a, l, n-l-1);
        reverseArrayUsingRecursionBySingleVariable(a, l+1);
    }

    public static void swap(int a[], int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        // reverseArrayUsingRecursion(a,0,a.length-1);

        // can we solve using single variable , think !!!

        reverseArrayUsingRecursionBySingleVariable(a, 0);
    }
}
