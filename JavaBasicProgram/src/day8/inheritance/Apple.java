package day8.inheritance;

class Fruits{
	public void box() {
		System.out.println(" i am box methode of fruits class");
	}
}
class mango extends Fruits{
	public static void fourbox() {
		System.out.println("I am fourbox methode of mango class");
	}
}
public class Apple extends Fruits{
           public void fivebox() {
        	   System.out.println("I am fivebox methode of Apple class");
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Apple f1=new Apple();
        f1.box();
        f1.fivebox();
        mango f2=new mango();
        f2.fourbox();
	}

}
