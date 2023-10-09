package day1.firstprogram;

public class StaticGlobalVariableExample1 {
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts");
		System.out.println("default value of age is :" + age);
		System.out.println("default value of res is :" + res);
		System.out.println("default value of grade is :" + grade);
		System.out.println("default value of roi is :" + roi);
		System.out.println("program ends");

		StaticGlobalVariableExample1.age = 25;
		StaticGlobalVariableExample1.res = true;
		StaticGlobalVariableExample1.grade = A;
		StaticGlobalVariableExample1.roi = 6.5f;
		System.out.println("update value of age is :" + StaticGlobalVariableExample1.age);
		System.out.println("update value of res is :" + StaticGlobalVariableExample1.res);
		System.out.println("update value of grade is :" + StaticGlobalVariableExample1.grade);
		System.out.println("update value of roi is :" + StaticGlobalVariableExample1.roi);
	}

}
