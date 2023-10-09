package day10overriding;
       class abc {
    	   void API() {
    		   System.out.println(" I am super class methode ");
    	   }
       }
       class xyz extends abc{
    	   void API() {
    		   System.out.println("I am sublass methode ");
    		   super.API();
    	   }
       }
public class Overriding2 {
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         xyz e1= new xyz();
         e1.API();
	}

}
// super key word is use in the case of methode overriding if u want ur suer class implementation 
// alos gather with sub class implementation and that is why we use super keyword 
