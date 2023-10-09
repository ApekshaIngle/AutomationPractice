package day8.inheritance;
   
  class xyz {
	  xyz(){
		  System.out.println("i am non para cons of Example1");
	  }
	  public void display() {
		  System.out.println("i am display methode of Exmple1");
	  }
	  public void teach() {
		  System.out.println("i am teach methode of Example1");
	  }
	  public void learn () {
		  System.out.println("i am learn methode of Example1");
	  }
  }
  class pmr extends xyz{
	  pmr (){
		  System.out.println("i am non para cons of Example2");
	  }
	  public void understand () {
		  System.out.println("i am understand methode of Example2");
	  }
	  public void not() {
		  System.out.println("i am not methode of Example2");
	  }
  }
public class Example4 extends pmr{
             Example4(){
            	 System.out.println("i am non para cons of Example4");
             }
             public void abc() {
            	 System.out.println(" i am abc methode of Example4");
             }
            	 
             
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example4 c=new Example4();
                c.abc();
                c.learn();
                c.not();
                c.display();
                c.teach();
                c.understand();
	}

}
