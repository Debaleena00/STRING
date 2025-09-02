import java.util.*;
public class MpP{public static void main(String[] args) {
    String a="Aradyaa";
    char y[]=a.toCharArray();
    int n=y.length;
    Map<Character,Integer>map=new HashMap<>();
    int i=0;
    while(i!=n){
        if(map.containsKey(y[i])==false){
            map.put(y[i],1);
        }
        else{
            int ovl=map.get(y[i]);
            int nv=ovl+1;
        }
        i++;
    }
    Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
    for(Map.Entry<Character,Integer> data:hmap){
        System.out.print(data.getKey()+":");
        System.out.println(data.getValue());
    }

  }
}
