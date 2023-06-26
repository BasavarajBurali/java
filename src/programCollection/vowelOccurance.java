package programCollection;

import java.util.HashMap;
import java.util.Map;

public class vowelOccurance {
    public static void main(String[] args) {
        HashMap<Character,Integer> obj=new HashMap<>();
        String str="Rama";
        for (int i=0;i<=str.length()-1;i++){
            char c=str.charAt(i);
            if (obj.containsKey(c)){
                obj.put(c,obj.get(c)+1);
            }else {
                obj.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> e:obj.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
