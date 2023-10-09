package abstractclass;
  abstract class A1{
	   abstract void M1();
  }
  class A2 extends A1{
	  public void M1() {
		  System.out.println("i am girl");
	  }
	  public void M2() {
		  System.out.println("i am Apeksha");
	  }
  }
  class A3 extends A2{
	  public void M1() {
		  System.out.println("i am overriden methode of A3 class");
		  super.M1();
	  }
	  public void M4() {
		  System.out.println("I am M4 methode ");
	  }
  }
public class Abstractclass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A3 t4=new A3();
           t4.M1();
           t4.M2();
           t4.M4();
           
	}

}
