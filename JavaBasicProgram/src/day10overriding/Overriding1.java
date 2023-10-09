package day10overriding;
   
class Animal11{
	Animal11(){
		
	} public void move() {
		System.out.println("Animal can move");
	}
}  
 class Dog extends Animal11{
	 Dog(){
		 
	 }
	 public void move () {
		 System.out.println("dog can walk & run");
	 }
	 public void bark() {
		 System.out.println("dog can bark");
	 }
 }
public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal11 e1= new Animal11();
        e1.move();
        Dog e2= new Dog ();
        e2.move();
        e2.bark();
        Animal11 e3=new Dog();
        e3.move();
	}

}
