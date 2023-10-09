package Collection;

import java.util.ArrayDeque;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String> name =new ArrayDeque<>();
     name.add("ankit");
     name.add("manish");
     name.add("satish");
     System.out.println(name);
     
     name.removeFirst();
     System.out.println(name);
	}

}
