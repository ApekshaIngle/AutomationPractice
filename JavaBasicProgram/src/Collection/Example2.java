package Collection;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(12);
	    ArrayList<Boolean> a2=new ArrayList<Boolean>();
        a2.add(true);
	    ArrayList<Character> a3=new ArrayList<Character>();
        a3.add('A');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        ArrayList<String> a4= new ArrayList<String>();
          a4.add("Ankita ");
          a4.add("Nikita ");
          a4.add("Pranita ");
          a4.add("Kavita");
          a4.add("Vinita ");
          System.out.println("An initial list of elements :"+a4);
          System.out.println("Remove Kavita from element :"+a4.remove("Kavita"));
          System.out.println("After invoving remove object :"+a4);
       // Removing element on the basis of specific position
          System.out.println("Remove index 0 from collection :"+a4.remove(0));
          System.out.println("After invoving index :"+a4);         
          // Creating another arraylist
          ArrayList<String> a5= new ArrayList<String>();
          a5.add("sita");
          a5.add("gita ");
          a5.add("rita");
       // Adding new elements to arraylist
        a4.addAll(a5);
        System.out.println("Update List :"+a4);
     // Removing all the new elements from arraylist
        a4.removeAll(a5);
          System.out.println("After invovin remove all :"+a4);
	}

}
