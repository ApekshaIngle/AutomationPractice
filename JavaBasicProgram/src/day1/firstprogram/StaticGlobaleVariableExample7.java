package day1.firstprogram;

public class StaticGlobaleVariableExample7 {
static int age;
static boolean res;
static char grade;
static float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value of age :"+StaticGlobaleVariableExample7.age);
System.out.println("default value of res :"+StaticGlobaleVariableExample7.res);
System.out.println("default value of grade :"+StaticGlobaleVariableExample7.grade);
System.out.println("default value of roi :"+StaticGlobaleVariableExample7.roi);
System.out.println("update value ");
StaticGlobaleVariableExample7.age=45;
StaticGlobaleVariableExample7.res=false;
StaticGlobaleVariableExample7.grade='A';
StaticGlobaleVariableExample7.roi=6.7f;
System.out.println("update value of age is :"+StaticGlobaleVariableExample7.age);
System.out.println("update value of res is :"+StaticGlobaleVariableExample7.res);
System.out.println("update value of grade is :"+StaticGlobaleVariableExample7.grade);
System.out.println("update value of roi is :"+StaticGlobaleVariableExample7.roi);
	}

}
