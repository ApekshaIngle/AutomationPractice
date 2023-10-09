package systemclass;
import java.util.Scanner;
public class Reversenum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num,r;
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter any num");
        num=s1.nextInt();
        while(num>0) {
        	r=num%10;
        	System.out.print(r);
        	num=num/10;
        }
	}

}
