package ExceptionHandling;

public class MultiplTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int a=10,b=0,c;
    	  c=a/b;
    	  System.out.println(c);
      }catch(ArithmeticException n) {
    	  System.out.println("can't devide by zero");
      }try {
    	  int []a= {10,20,30,40,};
    	  System.out.println(a[5]);
      }catch(ArrayIndexOutOfBoundsException m) {
    	  System.out.println("beyond the array limit ");
      }
	}

}
