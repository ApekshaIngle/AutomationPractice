package day8.inheritance;

   class abc{
	   abc(){
		   
	   }
	   public void disply() {
		   System.out.println(" I am disply methode ");
	   }
   }
   class abcd extends abc{
	   abcd(){
		   
	   }
	   public void calling () {
		   System.out.println(" i am callingn methode ");
	   }
   }
public class Example3 extends abcd {
                void printing() {
                	System.out.println("I am printing method ");
                }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Example3 e2=new Example3();
                   e2.disply();
                   e2.printing();
                   e2.calling();
	}

}
