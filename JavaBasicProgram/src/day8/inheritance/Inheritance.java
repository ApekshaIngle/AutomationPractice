package day8.inheritance;

class Father{
	Father(){
		System.out.println("i am cons of father class");
	}
	public void move() {
		System.out.println("I am move metthode faher class ");
	}
	public void display() {
		System.out.println("I am display methode");
	}
}
class son extends Father{
	son(){
		System.out.println("I am cons of son class");
		super.move();
	}
	public void move() {
		System.out.println("I am  overriden move methode of son class");
	}
	public void calling(int i) {
		System.out.println("I am calling methode ");
	}
	public void calling () {
		System.out.println("I am overloding calling methode ");
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     son e1= new son();
         e1.display();
         e1.move();
         e1.calling(25);
         e1.calling();
	}

}
