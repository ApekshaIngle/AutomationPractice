package day1.firstprogram;

public class NonStaticGlobaleVariableExample2 {
	int age;
	boolean res;
	char grade;
	float roi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticGlobaleVariableExample2 ref3 = new NonStaticGlobaleVariableExample2();
		System.out.println("default nonstatic variable age :" + ref3.age);
		System.out.println("default nonstatic variable res :" + ref3.res);
		System.out.println("default nonstatic variable grade :" + ref3.grade);
		System.out.println("default nonstatic variable roi" + ref3.roi);
		System.out.println("update variable");
		ref3.age = 25;
		ref3.res = true;
		ref3.grade = 'A';
		ref3.roi = 6.5f;
		System.out.println("update nonstatic variable age :" + ref3.age);
		System.out.println("update nonstatic variable res :" + ref3.res);
		System.out.println("update nonstatic variable grade :" + ref3.grade);
		System.out.println("update nonstatic variable roi :" + ref3.roi);
		NonStaticGlobaleVariableExample2 ref4 = new NonStaticGlobaleVariableExample2();
		System.out.println("default nonstatic variable age :" + ref4.age);
		System.out.println("default nonstatic variable res :" + ref4.res);
		System.out.println("default nonstatic variable grade :" + ref4.grade);
		System.out.println("default nonstatic variable roi :" + ref4.roi);
		System.out.println("update variable");
		ref4.age = 35;
		ref4.res = false;
		ref4.grade = 'B';
		ref4.roi = 8.6f;
		System.out.println("update nonstatic variable age :" + ref4.age);
		System.out.println("update nonstatic variable res :" + ref4.res);
		System.out.println("update nonstatic variable grade :" + ref4.grade);
		System.out.println("update nonstatic variable roi :" + ref4.roi);
		System.out.println("update variable");
		ref4.age = 85;
		ref4.res = true;
		ref4.grade = 'A';
		ref4.roi = 5.6f;
		System.out.println("update nonstatic variable age :" + ref4.age);
		System.out.println("update nonstatic variable res :" + ref4.res);
		System.out.println("update nonstatic variable grade :" + ref4.grade);
		System.out.println("update nonstatic variable roi :" + ref4.roi);
	}

}
