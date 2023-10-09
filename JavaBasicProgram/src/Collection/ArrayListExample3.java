package Collection;
import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();//Generic
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("An initial list of elements: " + al);
		// Removing specific element from arraylist
		System.out.println("remove Vijay from collection: "+al.remove("Vijay"));
	}

}
