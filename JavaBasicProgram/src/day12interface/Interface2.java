package day12interface;
  interface i2{
	  
  }
  interface details{
	  char name='A';
	  int age=25;
	  double percentage=66.89;
	  void information();
  }
  class student implements details{
	  public void information() {
		  System.out.println(" first year student information");
	  }
  }
  class student1 implements details{
	  public void information() {
		  System.out.println("second year student information ");
	  }
  }
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("student name :"+details.name);
       System.out.println("student age :"+details.age);
       System.out.println("student percentage :"+details.percentage);
       student1 t1=new student1();
                t1.information();
                System.out.println("=====================");
       student t2=new student ();
               t2.information();
               System.out.println("student name :"+details.name);
               System.out.println("student age :"+details.age);
               System.out.println("student percentage :"+details.percentage);
               
	}

}
