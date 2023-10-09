package day10overriding;

class Human {
	  Human(){
		  System.out.println("i am non para cons ");
	  }public void eat() {
		  System.out.println("Human can eat");
	  }
}
class Boy extends Human {
	public void eat() {
		super.eat();
	}
	Boy (){
		System.out.println("I am non para cons of Boy class");
	
		System.out.println("Boy is drinking");
	}
}
public class overriding5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Boy e1=new Boy();
         e1.eat();
	}

}
