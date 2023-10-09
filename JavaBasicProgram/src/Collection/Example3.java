package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List <Integer> a1= new ArrayList<Integer>();
            a1.add(12);
            a1.add(34);
            a1.add(45);
            a1.add(55);
            a1.add(61);
            a1.add(20);
            a1.add(69);

            System.out.println("size :"+a1.size());
            System.out.println("Element of collection :"+a1);
            Collections.sort(a1);
            System.out.println("After sorting :"+a1);
            Collections.reverse(a1);
            System.out.println("After reversing elementes :"+a1);
             ArrayListExample3 a2= new ArrayListExample3();
             a2.display();
	}

}
