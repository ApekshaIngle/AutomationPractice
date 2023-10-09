package day8.inheritance;/*multi level inheritance*/

   class grandmother {
	   grandmother(){
		   System.out.println("I am non para ");
	   }
	 public void APP() {
		 System.out.println("I am APP methode of grandmother class ");
	 }
   }
   class mother extends grandmother{
	   mother(){
		   System.out.println("I am non para cons of mother class");
	   }
	 public void APD() {
		 System.out.println("I am APD methode of mother class");
	 }
   }
public class Example5 extends mother{
       Example5 (){
    	   System.out.println("I am non para cons Examle5");
       }
         public void  PSI(){
    	   System.out.println("I am PSI methode of Example5");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example5 a=new Example5 ();
                a.APD();
                a.APP();
                a.PSI();
	}

}
