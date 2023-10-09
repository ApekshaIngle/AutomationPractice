package day1.firstprogram;

public class StaticGlobaleVariableExample5 {
       int age;
       boolean res;
       char grade;
       float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticGlobaleVariableExample5 ref6=new StaticGlobaleVariableExample5();
		System.out.println("default nonstatic variable age :"+ref6.age);
		System.out.println("default nonstati variable res :"+ref6.res);
		System.out.println("default nonstatic variable grade :"+ref6.grade);
		System.out.println("default nonstatic variable roi :"+ref6.roi);
		System.out.println("update variable");
		ref6.age=25;
		ref6.res=true;
		ref6.grade='A';
		ref6.roi=6.6f;
		System.out.println("update nonstatic variable age :"+ref6.age);
		System.out.println("update nonstatic variable res :"+ref6.res);
		System.out.println("update nonstatic variable grade :"+ref6.grade);
		System.out.println("update nonstatic variable roi aaa;"+ref6.roi);
	}

}
