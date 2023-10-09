package day8.inheritance; /* HierericalInheritance*/

  class hiererical1{
	  hiererical1(){
		  System.out.println("I am non Para cons of hiererical1 class");
	  }
	  public static void main() {
		  System.out.println("i am static methode of class hiererical1");
	  }
  }
  class hiererical2 extends hiererical1{
	  hiererical2(){
		  System.out.println("i am non para cons of hiererical2");
	  }
	  public void sub() {
		  System.out.println(" I am nonstatic methode of hiererical2");
	  }
  }
public class HierericalInheritance extends hiererical1 {
        public void child() {
        	System.out.println(" I am child methode of HierericalInheritance class ");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierericalInheritance t1=new HierericalInheritance();
		       t1.child();
		       t1.main();
	  hiererical2 t2=new hiererical2();
	           t2.sub();
	}

}
