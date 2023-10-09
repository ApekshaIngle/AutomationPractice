package day6constructor;

class Anum{
	int i=10;
	Anum(){
		System.out.println("running class Anum");
	}
	void display() {
		System.out.println("i am display methode class of Anum");
	}
}
class Bnum{
	int j=20;
	Bnum(){
		System.out.println("running class Bnum");
	}
	void display() {
		System.out.println("i am display method of clss Bnum");
	}
}

public class Example9 {
           int a=40;
           Example9(){
        	   System.out.println("running class Example9");
           }
           void display () {
        	   System.out.println("i am display methode of class Example9");
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Anum e1=new Anum();
        e1.display();
        System.out.println("global variable i :"+e1.i);
        Bnum e2=new Bnum();
        e2.display();
        System.out.println("globale variable j :"+e2.j);
        Example9 e3=new Example9();
           e3.display();
           System.out.println("globale variable a :"+e3.a);
	}

}
