package day10overriding;

class Fruits {
	Fruits(){
		System.out.println("i am cons");
	}
	public void move () {
		System.out.println("I am move methode of fruits class");
	}
}
class Apple extends Fruits{
	public void move () {
	
	}
	public void call() {
		System.out.println("HHHHHHHHHHHHHHHHHHHbbbb");
		super.move();
	}
}

public class overriding4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Apple d1=new Apple();
       d1.call();
	}

}
