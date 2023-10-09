package abstractclass;
 abstract class Animal{
	 abstract void animalsound();
 }
 class cow extends Animal{
	 public void animalsound() {
		 System.out.println("I am override methode of abstract class");
	 }
	 public void animalmove() {
		 System.out.println("I am animal move methode of cow class");
	 }
 }
public class Abstract extends cow {
       public void animalrun() {
    	   System.out.println("I am animal methode ");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Abstract e3=new Abstract ();
             e3.animalmove();
             e3.animalrun();
             e3.animalsound();
             
	}

}
