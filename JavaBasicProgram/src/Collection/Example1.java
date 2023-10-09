package Collection;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> str=new ArrayList<String>();
    str.add("Apple");
    str.add("mango");
    str.add("banana");
    System.out.println("Fruits Name :"+str);
    str.add("orange");
    System.out.println("Fruits Name :"+str);
    str.add(2," Graphs");
    System.out.println("Fruits Name :"+str);
   str.add(0, "Watermelon");
   System.out.println("Fruits Name :"+str);
   str.add(6, "papaya");
   System.out.println("Fruits Name :"+str);
   System.out.println("=======================");
   str.remove(0);
   System.out.println("remove :"+str);
   str.add(1, "tomato");
   System.out.println("remove plus add :"+str);
   str.remove(5);
   System.out.println("remove"+str);
   str.set(0, "patato");
   System.out.println(" using set methode :"+str);
   str.clear();
   System.out.println("clear :"+str);
    
	}

}
