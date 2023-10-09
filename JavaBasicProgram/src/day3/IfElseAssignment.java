package day3;

public class IfElseAssignment {

	public static void main(String[] args) {
	//check whether a number is even or odd 	
     int number=88;
     if(number%2==0) {
    	 System.out.println("number is even");
     }else {
    	 System.out.println("number is even");
     }
     System.out.println("-----------------------------------");
   //  check whwther an alphabet is vovel or consonant
     char ch='i';
     if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    	 System.out.println(ch+"is vovel");
     }else {
    	 System.out.println(ch+"is consonsnt");
     }
     System.out.println("--------------------------------------");
     //find largest among three numbers 
     int a=150, b=60, c=40;
     if(a>b) 
    	 if(a>c) {
    		 System.out.println("a is largest");
    	 }else {
    		 System.out.println("c is largest");
    	 }else 
    	 {
    		 if(b>c) 
    		 {
    			System.out.println("b is the largest"); 
    		 }else {
    			 System.out.println("c is the largest");
    		 }
    	 }
    	 
     
	}

}
