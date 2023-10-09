package day5;

public class AbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maheshphone obj=new suresh();
          obj.call();
          obj.dance();
          obj.move();
          obj.call();
	}

}
 abstract class maheshphone
{
	public void call() {
		System.out.println("calling .....");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}
 class Ramesh extends maheshphone
 {
	 public void maove() {
		 System.out.println("moving....");
	 }
 }
 class suresh extends Ramesh
 {
	 public void dance() {
		 System.out.println("dancing");
	 }
 }