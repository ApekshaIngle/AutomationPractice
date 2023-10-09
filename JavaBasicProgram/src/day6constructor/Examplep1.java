package day6constructor;

public class Examplep1 {
       int sal=60;
       int mark=45;
       void display() {
    	   System.out.println("my sallary is 60k ");
       }
       void print() {
    	   System.out.println("my mrks is abve 45");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Examplep1 e2= new Examplep1 ();
        e2.display();
        e2.print();
        System.out.println(e2.sal);
        System.out.println(e2.mark);
	}

}
