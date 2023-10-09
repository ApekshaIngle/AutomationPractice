package day6constructor;

public class Example5 {
	       int i=10;
           Example5(){
        	   System.out.println("Running class example5");
           }
           void display() {
        	   System.out.println("i am a display methode of class 5");
           }
           
    class Anum{
    	int j=20;
    	Anum(){
    		System.out.println("Running class A");
    	}
    	void display() {
    		System.out.println("i am display methode of class A");
    	}
    }
    class Bnum{
    	int t=60;
    	Bnum(){
    		System.out.println("Running class B");
    	}
    	void display() {
    		System.out.println("i am display methode of class B");
    	}
    }
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() of is started ");
    Example5 e1= new Example5();
         e1.display();
       System.out.println(e1.i);
       Anum a1=new Anum();
           a1.display();
           System.out.println(a1.j);
      Bnum b1=new Bnum();
      b1.display();
      System.out.println(b1.t);
	}

}
