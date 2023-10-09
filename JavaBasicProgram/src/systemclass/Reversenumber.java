package systemclass;//reverse num//

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num,r;
    Scanner s2=new Scanner(System.in);
    System.out.println("Enter any value");
      num=s2.nextInt();
      while(num>0) {
    	  r=num%10;
    	  System.out.print(r);
    	  num=num/10;
      }
	}

}
