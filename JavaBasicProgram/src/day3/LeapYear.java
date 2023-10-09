package day3;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int year=2019;
   if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
	   System.out.println("leap year");
   }else {
	   System.out.println("non leap year");
   }
	}

}
