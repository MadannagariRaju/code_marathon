import java.util.HashMap;

public class NumberMapping {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,4,5,3,6,2,1,20};
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<a.length;i++) {
            if(!map.containsKey(a[i])) {
                map.put(a[i],0);
            }
            map.put(a[i], map.get(a[i])+1);
        }

        System.out.println(map);


        // or you can use getOrDefault() instead of if() condition

        HashMap<Integer,Integer>map2 = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            map2.put(a[i], map2.getOrDefault(a[i], 0)+1);
        }

        System.out.println(map2);

    }
}
