package day1.firstprogram;

public class IfCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year=2000;
if (((year%4==0) && (year%100!=0)) || (year%400==0)) {
	System.out.println("leap year");
}else {
	System.out.println("common year");
}
	}

}
