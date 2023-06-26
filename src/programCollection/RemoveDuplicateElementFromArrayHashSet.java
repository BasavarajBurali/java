package programCollection;

import java.util.HashSet;

public class RemoveDuplicateElementFromArrayHashSet {
    public static void main(String[] args) {
        int[] a={1,1,2,3,3,4,4,5};
        HashSet<Integer> hs=new HashSet<>();


        for (int i=0;i<a.length-1;i++){
            hs.add(a[i]);

        }
        for (Integer i:hs) {
            System.out.println(i);
        }
    }
}
