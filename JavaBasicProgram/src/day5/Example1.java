package day5;




public class Example1{
               /*java variable*/
	int a=10; //non static variable
	static long b=20; //static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int c=30;// local variable
      final int D=40;//final variable
      
      
      Example1 e1=new Example1();// object creation
      
      System.out.println(e1.a);
      System.out.println(b);
      
      System.out.println(c);
      System.out.println(D);
	}

}

