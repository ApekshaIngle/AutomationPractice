package day6constructor;

public class Example10 {
          static int salary;
          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           show(1500.56);
	}
static void display() {
	System.out.println("I am display method od example10");
	System.out.println("sbg sal:"+salary);
}
    static void show(double sal) {
    	System.out.println("local variable "+salary);
    	System.out.println("sgv sal :"+salary);
    	double salary=2500.56;
    	System.out.println("local sal"+salary);
    	System.out.println("sgv :"+Example10.salary);
    }
}
