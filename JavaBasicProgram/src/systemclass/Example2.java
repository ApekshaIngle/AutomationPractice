package systemclass;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1,num2,result;
      
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter number1");
      num1=scn.nextInt();
      System.out.println("Enter number2");
      num2=scn.nextInt();
      result=num1+num2;
      System.out.println("Result :"+result);
      char opps;
      System.out.println("Enter opretor");
      opps=scn.next().charAt(0);
      calculator( num1, num2, opps);
	}
  static void calculator(int num1,int num2,char opps) {
	  if(opps=='+') {
		  System.out.println("perform addition");
	  }else if(opps=='-') {
		  System.out.println("perform subtraction");
		  
	  }
  }
}
