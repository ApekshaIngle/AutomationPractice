package day8.inheritance;
 abstract class city{
	public abstract void  move(); 
		
	
}
class village {
	public  void  move() {
		System.out.println("i am abstract ovrride methode");
	}

	public void home(int i) {
		System.out.println("There are five member in my home");
		
	}
}
class colony extends village{
	public void home() {
		System.out.println("There are 50 homes in colony");
	}
	public void publics(double j) {
		System.out.println("There are 58k public in colony ");
		
	}
	public void publics(int i) {
		System.out.println("I am overloading methode with int parameter");
		
	}
}
public class inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         colony e2= new colony();
              e2.home(5);
              e2.home();
              e2.publics(50000.4);
        	 e2.publics(23);
        	 e2.move();
	}

}
