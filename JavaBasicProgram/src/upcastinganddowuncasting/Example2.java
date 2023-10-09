package upcastinganddowuncasting;
 class fruits1{
	 void shape1() {
		 System.out.println("Fruits are round in a shape");
	 }
	 void color1() {
		 System.out.println("fruits color is green");
	 }
 }
 class Apple1 extends fruits1{
	 void test1() {
		 System.out.println("Apple is sweet");
	 }
	 @Override
	 public void color1() {
		 System.out.println("Apple color is red");
	 }
 }
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           fruits1 e1= new Apple1();
                e1.color1();
                e1.shape1();
               
           Apple1 a1=(Apple1)e1;
                e1.color1();
                e1.shape1();
                e1.
                
                
	}

}
