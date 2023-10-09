package DailyProgramingPractice;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int y=2021;
      if(y%100==0 && y%400==0 || y%100==0 && y%4==0) {
    	  System.out.println("is leap year");
      }else {
    	  System.out.println("is nonleap year");
      }
	}

}
