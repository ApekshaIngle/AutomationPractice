package ExceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Main methode  started ");
          int a=10,b=0,c;
          try {
          c=a/b;
          System.out.println("c"+c);
          }
          catch(ArithmeticException e) {
        	  System.out.println("can't devided by zero :"+e);
          }
          System.out.println("Main methode end");
	}

}
