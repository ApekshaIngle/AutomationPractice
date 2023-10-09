package day1.firstprogram;

public class StaticGlobaleVariableExamlpe3 {
      static int age;
      static boolean res;
      static char grade;
      static float roi; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value of age is :"+StaticGlobaleVariableExamlpe3.age);
System.out.println("default value of res is :"+StaticGlobaleVariableExamlpe3.res);
System.out.println("default value of grade is :"+StaticGlobaleVariableExamlpe3.grade);
System.out.println("default value of roi is :"+StaticGlobaleVariableExamlpe3.roi);

StaticGlobaleVariableExamlpe3.age=25;
StaticGlobaleVariableExamlpe3.res=true;
StaticGlobaleVariableExamlpe3.grade='A';
StaticGlobaleVariableExamlpe3.roi=6.5f;
System.out.println("update value of age is :"+StaticGlobaleVariableExamlpe3.age);
System.out.println("update value of res is :"+StaticGlobaleVariableExamlpe3.res);
System.out.println("update value of grade is :"+StaticGlobaleVariableExamlpe3.grade);
System.out.println("update value of roi is :"+StaticGlobaleVariableExamlpe3.roi);

StaticGlobaleVariableExamlpe3.age=65;
StaticGlobaleVariableExamlpe3.res=false;
StaticGlobaleVariableExamlpe3.grade='C';
StaticGlobaleVariableExamlpe3.roi=7.5f;
System.out.println("update value of age is :"+StaticGlobaleVariableExamlpe3.age);
System.out.println("update value of res :"+StaticGlobaleVariableExamlpe3.res);
System.out.println("update value of grade is :"+StaticGlobaleVariableExamlpe3.grade);
System.out.println("update value of roi is :"+StaticGlobaleVariableExamlpe3.roi);
	}

}
