package systemclass;
 import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num;
     Scanner e2=new Scanner(System.in);
     System.out.println("Enter range");
     num=e2.nextInt();
     for(int i=0;i<=num;i=i+2) {
    	 System.out.println(i);
     }
	}

}
