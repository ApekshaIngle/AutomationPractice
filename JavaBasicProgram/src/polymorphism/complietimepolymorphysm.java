package polymorphism; //static binding//early binding

public class complietimepolymorphysm {
   static void addnumber(int a,int b) {
	   int res=a+b;
	   System.out.println("Result :"+res);
   }
   static void addnumber(double a,double b) {
	   double res=a+b;
	   System.out.println("Result :"+res);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     addnumber(16,89);
     addnumber(23.6,56.7);
	}

}
/**
 * When a method gets to know its implementation at the
 *  time of compilation is known as compile
 * time poly this can be achieved by using static method overloading
 */