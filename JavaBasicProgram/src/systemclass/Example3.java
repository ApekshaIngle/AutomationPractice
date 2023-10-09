package systemclass;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,counter;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter any number");
       num =s.nextInt();
       System.out.println("enter counter");
       counter=s.nextInt();
     
       for (int i=1;i<=num;i++) {
       	if(num%i==0) {
       		counter++;
       	}
       }
       if(counter==2) {
       	System.out.println("The num is prime num :"+num);
       }else {
       	System.out.println("The num is not prime num :"+num);
       }

	}

}
