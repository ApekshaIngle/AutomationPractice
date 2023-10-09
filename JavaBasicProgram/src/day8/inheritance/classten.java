package day8.inheritance;

  class class8{
	  class8(){
		  System.out.println(" I am paramiterize cons ");
	  }
	  public void math() {
		  System.out.println("i am math methode of class8");
	  }
  }
  class class9 extends class8{
	  
	  class9(){
		  System.out.println(" i am cons of class9");
	  }
	  public void English() {
		  System.out.println("i am English  method of class9 ");
	  }
  }
public class classten extends class9 {
             public void machine() {
            	 System.out.println("i am machine methode of classten");
             }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classten b= new classten();
		       b.math();
		       b.English();
		       b.machine();
	}

}
