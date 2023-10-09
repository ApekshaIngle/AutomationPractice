package day1.firstprogram;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num1=45 , num2=30;
  if (num1!=num2) {
	  System.out.println("number1 is not equals to numbers2");
  }else {
	  System.out.println("number1 is equqls to numbers2");
  }
	if (num1>num2){
		System.out.println("number1 is greater than numbers2");
	}else {
		System.out.println("number1 is smaller than numbers2");
	}
  if (num1<=num2) {
	  System.out.println("number1 is either equel to number2 or greater than number2 ");
  }else {
	  System.out.println("number1 is smaller than number2");
  }
	if (num1==num2 || num1>num2) {
		System.out.println("number1 is ether equel to numbers2 or greater than numbers2");
	}else {
		System.out.println("number1 is smaller than numbers2");
	}
	if(num1>=num2 && num1>num2) {
		System.out.println("number1 is either equelto number2 orgreater than number2 ");
	}else {
		System.out.println("number1 is smaller than numbers2");
	}
	}

}
