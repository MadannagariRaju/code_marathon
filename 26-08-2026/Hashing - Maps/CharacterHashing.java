import java.lang.reflect.Array;
import java.util.Arrays;

public class CharacterHashing {
    public static void main(String[] args) {
        String s = "skdafjlsafksdjfk";

        // here hash array can be 26 because of alphabetes available are 26
        // and atmost the available character are 256
        // hashing on character is become simple because of size (256)

        // 'a' ---> ascii value is 97
        // s.charAt(i) - 'a' ---> gives you the array index
        // 97-97 = 0 'a'
        // 98-97 = 1 'b'
        // 99-97 = 2 'c'   .... so on

        int hash[] = new int[26];

        for(int i=0;i<s.length();i++) {
            hash[s.charAt(i)-'a']++;
        }

        System.out.println(Arrays.toString(hash));
    }
}
