package day8.inheritance;
    class class1{
    	public void display() {
    		System.out.println("I am display methode of calss1");
    	}
    }
    class class2 extends class1{
    	public void calling() {
    		System.out.println("i am calling methode of class2");
    	}
    }
    
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      class2 e1= new class2();
            e1.display();
            e1.calling();
	}

}
