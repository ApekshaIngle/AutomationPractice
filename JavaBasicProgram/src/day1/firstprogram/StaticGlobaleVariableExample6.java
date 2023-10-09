package day1.firstprogram;

public class StaticGlobaleVariableExample6 {
static int age;
static boolean res;
static char grade;
static float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value og age :"+StaticGlobaleVariableExample6.age);
System.out.println("default value of res :"+StaticGlobaleVariableExample6.res);
System.out.println("default value of grade :"+StaticGlobaleVariableExample6.grade);
System.out.println("default value of roi :"+StaticGlobaleVariableExample6.roi);
System.out.println("update value");
StaticGlobaleVariableExample6.age=65;
StaticGlobaleVariableExample6.res=true;
StaticGlobaleVariableExample6.grade='A';
StaticGlobaleVariableExample6.roi=6.6f;
System.out.println("update value of age :"+StaticGlobaleVariableExample6.age);
System.out.println("update value of res :"+StaticGlobaleVariableExample6.res);
System.out.println("update value of grade :"+StaticGlobaleVariableExample6.grade);
System.out.println("update value of roi :"+StaticGlobaleVariableExample6.roi);
System.out.println("update value");
	}
}
class StaticGlobaleVariableDemo1{
	static int age;
	static boolean res;
	static char grade;
	static float roi;
	public static void main(String[] args) {
		System.out.println("default value of age :"+StaticGlobaleVariableDemo1.age);
		System.out.println("default value of res :"+StaticGlobaleVariableDemo1.res);
		System.out.println("default value of grade :"+StaticGlobaleVariableDemo1.grade);
		System.out.println("default value of roi :"+StaticGlobaleVariableDemo1.roi);
		
	}
}

