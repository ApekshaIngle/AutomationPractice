package day8.inheritance;
class country {
	void display() {
		System.out.println("I am display methode of country class");
	}
}
   class state extends country{
	   void calling () {
		   System.out.println("I am calling methode of state");
	   }
   }

public class Examplep1 extends State {
	void testing () {
		System.out.println("I am testing methode of Example1");
	}


	public static void main(String[] args) {
		Examplep1 e1=new Examplep1();
		        e1.display();
		        e1.calling();
		        e1.testing();
	}
}