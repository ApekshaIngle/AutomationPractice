package day8.inheritance;
  
  class Level1{
	  Level1(){
		  System.out.println("i am leve1 non para cons");
	  }
	  void display() {
		  System.out.println("i am display methode ");
	  }
  }
 class Level2 extends Level1{
	 Level2(){
		 System.out.println("i am level2 non para cons");
	 }
	 void calling() {
		 System.out.println("i am calling method");
	 }
 }
public class MultiLevelInheritance extends Level2 {
       void testing() {
    	   System.out.println("i am testing method");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance a1= new MultiLevelInheritance();
		                    a1.display();
		                    a1.calling();
		                    a1.testing();
	}

}
