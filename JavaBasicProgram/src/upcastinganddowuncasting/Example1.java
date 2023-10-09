package upcastinganddowuncasting;
  class fruits{
	  void shap() {
		  System.out.println("fruits shape is round");
	  }
	  void color() {
		  System.out.println("fruit color is green");
	  }
  }
  class Apple extends fruits{
	  void test() {
		  System.out.println(" Apple color is red ");
	  }
	  public void color() {
		  System.out.println("Apple is sweet");
	  }
  }
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       fruits t1=new Apple();
             t1.shap();
            t1.color();
            Apple a1=(Apple)t1;
                a1.color();
                a1.shap();
                a1.test();
	}

}
