package systemclass;
 import java.util.Scanner;
public class Palindromnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num,r,s=0,c;
       Scanner s3=new Scanner(System.in);
       System.out.println("Enter any number");
       num=s3.nextInt();
       c=num;
       while(num>0) {
    	   r=num%10;
    	   s=s*10+r;
    	   num=num/10;
       }
       if(c==s) {
    	   System.out.println("Given number is palindrom number");
       }
       else {
    	   System.out.println("Given number is not palindrom number");
       }
	}

}
