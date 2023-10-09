package day1.firstprogram;

public class StaticGlobaleVariableExample2 {
      static int age;
      static boolean res;
      static char grade;
      static float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value of age is :" +StaticGlobaleVariableExample2.age);
System.out.println("default value of res is :" +StaticGlobaleVariableExample2.res);
System.out.println("default value of grade is :" +StaticGlobaleVariableExample2.grade);
System.out.println("default value of roi is :" +StaticGlobaleVariableExample2.roi );

StaticGlobaleVariableExample2.age=25;
StaticGlobaleVariableExample2.res=true;
StaticGlobaleVariableExample2.grade='A';
StaticGlobaleVariableExample2.roi=6.5f;
System.out.println("update value of age is :"+StaticGlobaleVariableExample2.age);
System.out.println("update value of res is :"+StaticGlobaleVariableExample2.res);
System.out.println("update value of grade is :"+StaticGlobaleVariableExample2.grade);
System.out.println("update value of roi is :"+StaticGlobaleVariableExample2.roi);


	}

}
