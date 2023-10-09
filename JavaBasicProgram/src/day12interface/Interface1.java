package day12interface;

interface i1{
	
}
interface drawable{
	int salary=25000;
	int age =25;
	void Draw();
}
class rectangle implements drawable{
	public void Draw() {
		System.out.println("drawing rectangle");
	}
}
class circle implements drawable{
	public void Draw() {
		System.out.println("drawing circle");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("interface variable salary "+drawable.salary);
		System.out.println("age :"+drawable .age);
     rectangle e1=new rectangle();
              e1.Draw();
     circle e2=new circle();
            e2.Draw();
       drawable e3=new circle();
             e3.Draw();
	}

}
