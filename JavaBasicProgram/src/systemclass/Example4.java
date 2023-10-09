package systemclass;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num,r;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter any number");
        num=s.nextInt();
              
        for(; num>0;) {
        	r= num % 10;
        	System.out.print(r);

        	num=num/10;
         }
     
        	
        	
	}

}
