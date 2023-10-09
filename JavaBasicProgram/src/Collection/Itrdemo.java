package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itrdemo {

	public static void main(String[] args) {
		
	List l= new ArrayList();
      
      l.add("Appel");
      l.add("mango");
      l.add("banana");
      l.add("123");
      
      Iterator itr= l.iterator();
      System.out.println(itr.hasNext());
      System.out.println(itr.next());
      System.out.println(itr.next());
      System.out.println(itr.next());
      System.out.println(itr.next());

      System.out.println("==============");
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
      System.out.println(itr.hasNext());
      System.out.println("===================");
      Iterator itr1= l.iterator();
      while(itr1.hasNext()) {
    	  System.out.println(itr1.next());
      }
      System.out.println(itr1.hasNext());
	}

}
