package day12interface;

interface watcheble{
	int salary=56748;
	void get();
}
interface printable{
	int age=26;
	void print();
}
interface showable{
	public void show();
} 
class interface3 implements printable,showable,watcheble{
	public static int age =56;
	public void print() {
		System.out.println("Hello,print ");
	}
	public void show() {
		System.out.println("Welcome, show");
	}
	public void get () {
		System.out.println("Hii , I am watcheble ");
	}
}
public class Multipleinheritace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        interface3 r=new interface3();
               r.print();
               r.show();
               System.out.println("age :"+printable.age);
               System.out.println("age :"+interface3.age);
               System.out.println("salary :"+watcheble.salary);
                   r.get();
	}

}
