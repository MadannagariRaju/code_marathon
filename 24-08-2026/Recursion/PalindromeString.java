import java.util.Arrays;

public class PalindromeString {

    public static char[] reverseString(char s[], int l, int r) {
        if(l >= r) {
            System.out.println(Arrays.toString(s));
            return s;
        }
        swap(s,l,r);
        return reverseString(s, l+1, r-1);
    }

    public static char[] reverseStringByUsingSingleVariable(char s[], int l) {
        int n = s.length;
        if(l >= n/2) {
            System.out.println(Arrays.toString(s));
            return s;
        }
        swap(s, l, n-l-1);
        return reverseStringByUsingSingleVariable(s, l+1);
    }

    public static void swap(char s[], int l, int r) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }

    public static boolean isPalindrome(String s, int l, int r) {
        if(l >= r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return isPalindrome(s, l+1, r-1);
    }
    public static void main(String[] args) {
        String s = "MADAM";
        // char  res[] = reverseString(s.toCharArray(),0,s.length()-1);

        // by using single variable 
        // char res[] = reverseStringByUsingSingleVariable(s.toCharArray(), 0);

        // System.out.println("res : " + Arrays.toString(res));
        // String str = "";
        // for(char ch : res) {
        //     str = str + ch;
        // }
        // if(s.equals(str)) System.out.println("palindrome");
        // else System.out.println("not a palindrome");


       System.out.println(isPalindrome(s, 0, s.length()-1));
    }
}
