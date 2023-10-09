package day1.firstprogram;

public class StaticGlobaleVariableExample5 {
     static int age;
    static  boolean res;
     static char grade;
     static float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value of age is :"+StaticGlobaleVariableExample5.age);
System.out.println("default value of res is :"+StaticGlobaleVariableExample5.res);
System.out.println("default value of res is :"+StaticGlobaleVariableExample5.grade);
System.out.println("default value of roi is :"+StaticGlobaleVariableExample5.roi);
System.out.println("update value");
StaticGlobaleVariableExample5.age=45;
StaticGlobaleVariableExample5.res=false;
StaticGlobaleVariableExample5.grade='A';
StaticGlobaleVariableExample5.roi=6.7f;
System.out.println("update value of age is :"+StaticGlobaleVariableExample5.age);
System.out.println("update value of res is :"+StaticGlobaleVariableExample5.res);
System.out.println("update value of grade is :"+StaticGlobaleVariableExample5.grade);
System.out.println("update value og roi is :"+StaticGlobaleVariableExample5.roi);
	}

}
