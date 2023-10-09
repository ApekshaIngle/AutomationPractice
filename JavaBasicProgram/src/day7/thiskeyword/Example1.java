package day7.thiskeyword;

public class Example1 {
              static int age;
              int salary;
              int empid;
              void disply(int salary) {
            	  System.out.println("salary :"+salary);
            	  System.out.println("NSGV salary :"this.salary);
            	  this.salary=25000;
            	  System.out.println("NSGV salary "+this.salary);
              }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
