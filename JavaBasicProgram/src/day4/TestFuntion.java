package day4;

public class TestFuntion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFuntion.additionoftwonumber();
		System.out.println("****************************");
		TestFuntion.sumoftwonumber( 24, 25);
		System.out.println("================================");
		TestFuntion.sumoftwonumber( 75, 25);

	}
      static void sumoftwonumber(int num1 ,int num2){
    	  int res=num1+num2;
    	  System.out.println("number1 is "+num1);
    	  System.out.println("number2 is "+num2);
    	  System.out.println("res is"+res);
      }
	
	
	static void additionoftwonumber() {
		int num1 = 10;
		int num2 = 20;
		int res;
		res = num1 + num2;
		System.out.println("number1 is" + num1);
		System.out.println("number2 is " + num2);
		System.out.println("result is" + res);
	}

}
