package Collection;


import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer, String> map1=new HashMap<Integer, String>();
         map1.put(1,"mango");
         map1.put(2,"apple");
         map1.put(1,"graphs");
         map1.put(3,"banana");
         System.out.println("map1 element :"+map1);
        System.out.println("Iterating HashMap....");
        for(Entry m : map1.entrySet()){
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer, String> map2=new HashMap<Integer, String>();
        map2.put(100, "Amit ");
        map2.put(101, "vijay ");
        map2.put(102, "Rahul ");
        System.out.println("Initial list of element :"+map2);
        System.out.println("After invoking put() method");
        		for(Entry m:map2.entrySet()) {
        			System.out.println(m.getKey()+" "+m.getValue());
        		}
           map2.putIfAbsent(103, "Gaurav");
           System.out.println("After invoving putifabsent method() :"+map2);
           for(Entry m:map2.entrySet()) {
        	   System.out.println(m.getKey()+ " "+m.getValue());
           }
	}

}
