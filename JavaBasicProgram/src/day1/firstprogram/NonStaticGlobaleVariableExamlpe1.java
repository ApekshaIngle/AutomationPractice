package day1.firstprogram;

public class NonStaticGlobaleVariableExamlpe1 {
int age;
boolean res;
char grade;
float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticGlobaleVariableExamlpe1 ref1=new NonStaticGlobaleVariableExamlpe1();
		System.out.println("Default,Non static variable age :"+ref1.age);
		System.out.println("Default,Non static variable res :"+ref1.res);
		System.out.println("Default,Nonstatic variable grade :"+ref1.grade);
		System.out.println("Default,nonstatic variable roi :"+ref1.roi);
		ref1.age=25;
		ref1.res=true;
		ref1.grade='A';
		ref1.roi=6.5f;
		System.out.println("update nonstatic variable age :"+ref1.age);
		System.out.println("update nonstatic variable res :"+ref1.res);
		System.out.println("update nonstatic variable grade :"+ref1.grade);
		System.out.println("update nonstatic variable roi :"+ref1.roi);
		
		NonStaticGlobaleVariableExamlpe1 ref2=new NonStaticGlobaleVariableExamlpe1();
		System.out.println("Default,Non static variable age :"+ref2.age);
		System.out.println("Default,Non static variable res :"+ref2.res);
		System.out.println("Default,Nonstatic variable grade :"+ref2.grade);
		System.out.println("Default,nonstatic variable roi :"+ref2.roi);


	}

}
