package day1.firstprogram;

public class NonStaticGlobaleVariableExample5 {
           int age;
           boolean res;
           char grade;
           float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticGlobaleVariableExample5 ref7=new NonStaticGlobaleVariableExample5();
		System.out.println("default Nonstatic variable is :"+ref7.age);
		System.out.println("default Nonstatic variable is :"+ref7.res);
		System.out.println("default Nonstatic variable is :"+ref7.grade);
		System.out.println("default variable is :"+ref7.roi);
		System.out.println("update variable");
		ref7.age=65;
		ref7.res=true;
		ref7.grade='A';
		ref7.roi=6.6f;
		System.out.println("update Nonstatic variable is :"+ref7.age);
		System.out.println("update Nonstatic variable is :"+ref7.res);
		System.out.println("update Nonstatic variable is :"+ref7.grade);
		System.out.println("update Nonstatic variable is :"+ref7.roi);
	}

}