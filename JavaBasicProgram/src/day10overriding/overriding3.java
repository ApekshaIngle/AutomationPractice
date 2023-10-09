package day10overriding;
  
class country {
	country (){
		System.out.println("i am cons of country");
	}
	public void main () {
		System.out.println(" I am main methode ");
		
	}
}
class state extends country{
	public void main () {
		
	} 
	public void call() {
		System.out.println(" I am sub methode ");
		super.main();
	}
}
public class overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        state e1= new state();
        e1.call();
        
	}

}
