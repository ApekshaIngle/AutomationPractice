package day8.inheritance;
class App{
	void main() {
		System.out.println("I am main methode");
	}
}
class kit extends App{
	void sub() {
		System.out.println("i am sub method");
	}
}

public class Example2 extends kit {
	void pill() {
		System.out.println("i am pill methode of example 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example2 e1= new Example2();
               e1 .main();
               e1.sub();
               e1.pill();
	}

}
