abstract class Bike1{
	abstract void run();
	void speed (int spd) {
		System.out.println("bike speed : "+spd);
	}
}
class Honda4 extends Bike1{
	
	void run() {
		System.out.println("running safely");
	}
	void color() {
		System.out.println("honda color is blue ");
	}
}

class abstractclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Honda4 e1=new Honda4();
    e1.run();
    e1.speed(60);
    e1.color();
    Bike1 e2=new Honda4();
       e2.run();
       e2.speed(20);
	}

}
