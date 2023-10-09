package Collection;

import java.util.Stack;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Stack<String> b=new Stack<>();//LIFO
               b.push("Rita " );
               b.push("sita  " );
               b.push("mita " );
               System.out.println(b);
                  b.pop();
                  System.out.println(b);
	}

}
