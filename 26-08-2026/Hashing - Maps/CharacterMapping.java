import java.util.HashMap;

public class CharacterMapping {
    public static void main(String[] args) {
        String s = "skdafjlsafksdjfk";

        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 0);
            }
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }

        System.out.println(map);

        // we can do using getOrDefault() method instead if() conditions

        HashMap<Character,Integer>map2 = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0)+1);
        }

        System.out.println(map2);
    }    
}
