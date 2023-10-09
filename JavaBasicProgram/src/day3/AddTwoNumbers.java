package day3;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=20;
       int b=30;
       int c=a+b;
       System.out.println("addition of two input is :"+c);
       System.out.println("------------------------------------");
      // multiply two floating points numbers
       float num=2.44f;
       double y=num*num;
       System.out.println("multiplication of two float number is :"+y);
       System.out.println("-----------------------------------------------");
    //   find ASCII value of  a character 
       char ch='G';
       int n=ch;
       System.out.println("ASCCI value :"+n);
       System.out.println("--------------------------------------");
      // compute quotient &remainder 
       int num1=25;
       int num2=4;
       int res1=num1/num2;
       int res2=num1%num2;
       System.out.println("quotient is :"+res1);
       System.out.println("remainder is :"+res2);
       System.out.println("------------------------------------");
      // swap two numbers using temperary variable 
       int first=20;
       int second=30;
       System.out.println("first value before swaping"+first);
       System.out.println("second value before swaping"+second);
       System.out.println("--------------------------------------------");
       int temp = first;
       first=second;
       second=temp;
       System.out.println("first value after swaping"+first);
       System.out.println("second value after swaping"+second);

       

       
	}

}
