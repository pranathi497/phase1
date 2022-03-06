package map;
import java.util.*;
public class Map {

	public class Entry {

	}

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"pintu");    
	      hm.put(2,"rosy");    
	      hm.put(3,"jaanu");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(java.util.Map.Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"munna");  
	      ht.put(5,"dolly");  
	      ht.put(6,"prav");  
	      ht.put(7,"nani");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(java.util.Map.Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Anitha");    
	      map.put(9,"rohit");    
	      map.put(10,"pavan");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(java.util.Map.Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}




