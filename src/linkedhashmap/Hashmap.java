package linkedhashmap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
	    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
	    linkedHashMap.put(1, new String("apple"));
        linkedHashMap.put(2, new String("mango"));
        linkedHashMap.put(3, new String("grapes"));
        linkedHashMap.put(4, new String("pineapple"));
        linkedHashMap.put(5, new String("banana"));
        linkedHashMap.put(6, new String("custardapple"));
        linkedHashMap.put(7, new String("guva"));
        linkedHashMap.put(8, new String("dragon"));
        linkedHashMap.put(9, new String("orange"));
        linkedHashMap.put(10, new String("watermelon"));
        System.out.println(linkedHashMap);
        for(Integer key : linkedHashMap.keySet())
        {
         System.out.println(key+" "+linkedHashMap.get(key));
        }
        linkedHashMap.remove(4);
        linkedHashMap.remove(7);
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.hashCode());
		System.out.println("checking:"+linkedHashMap.containsValue("banana"));
		System.out.println("checking:"+linkedHashMap.containsValue("apple"));

		linkedHashMap.clear();
		
		System.out.println(linkedHashMap);
		
}
        
}
