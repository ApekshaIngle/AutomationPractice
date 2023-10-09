package day1.firstprogram;

public class StaticGlobaleVariableExample4 {
        static int age;
       static boolean res;
        static char grade;
        static float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("default value of age is :"+StaticGlobaleVariableExample4.age);
		System.out.println("default value of res is :"+StaticGlobaleVariableExample4.res);
		System.out.println("default value of grade is :"+StaticGlobaleVariableExample4.grade);
		System.out.println("default value of roi is :"+StaticGlobaleVariableExample4.roi);
		System.out.println();
		StaticGlobaleVariableExample4.age=25;
		StaticGlobaleVariableExample4.res=true;
		StaticGlobaleVariableExample4.grade='A';
		StaticGlobaleVariableExample4.roi=6.6f;
		System.out.println("update value of age is :"+StaticGlobaleVariableExample4.age);
		System.out.println("update value of res is :"+StaticGlobaleVariableExample4.res);
		System.out.println("update value of grade is :"+StaticGlobaleVariableExample4.grade);
		System.out.println("update value of roi is :"+StaticGlobaleVariableExample4.roi);
	}

}
