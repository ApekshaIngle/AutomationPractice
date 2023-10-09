package day6constructor;

public class Example2 {
         Example2(){
        	 System.out.println(" i am zero para cons");
         }
         Example2(char a){
        	 System.out.println("i am single para cons ");
         }
         Example2(int num1 ,int num2){
        	 System.out.println("I am int int para cons");
         }
         Example2(double num1,int num2){
        	 System.out.println("i am double int para cons");
         }
         Example2(int num1 , double num2){
        	 System.out.println("i am int double para cons");
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Example2 e1=new Example2();
         Example2 e2=new Example2(23,45);
         Example2 e3=new Example2(2.67,56);
         Example2 e4=new Example2('a');
         Example2 e5=new Example2(87,89.7);
         
	}

}
/**
 * Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */