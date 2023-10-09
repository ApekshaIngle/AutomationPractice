package systemclass;
  import java.util.Scanner;
public class Evennumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num;
    Scanner e3=new Scanner(System.in);
       System.out.println("Enter given range");
       num=e3.nextInt();
       for( int i=0;i<=num;i=i+2) {
    	  System.out.println(i); 
       }
	}

}
