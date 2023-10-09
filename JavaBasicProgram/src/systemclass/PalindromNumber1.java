package systemclass;
 import java.util.Scanner;
public class PalindromNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num,c,s=0,r;
     Scanner e1=new Scanner(System.in);
     System.out.println("Enter any number");
     num=e1.nextInt();
     c=num;
     while(num>0) {
    	 r=num%10;
    	 s=s*10+r;
    	 num=num/10;
     }
     if(c==s) {
    	 System.out.println("Given number is palindron number");
     }else {
    	 System.out.println("Given number is not palindrom number");
     }
	}

}
