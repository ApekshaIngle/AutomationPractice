package day1.firstprogram;

public class UnaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=5;
      int b= ++a + a++ + ++a +a;
      System.out.println("a="+a);
      System.out.println("b="+b);
      int x=6;
      int y= a++ + ++a + a++ + a;
      System.out.println("x="+x);
      System.out.println("y="+y);
	}
}
