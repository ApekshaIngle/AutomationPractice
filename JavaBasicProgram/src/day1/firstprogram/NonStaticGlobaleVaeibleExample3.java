package day1.firstprogram;

public class NonStaticGlobaleVaeibleExample3 {
         int age;
         boolean res;
         char grade;
         float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticGlobaleVaeibleExample3 ref5=new NonStaticGlobaleVaeibleExample3();
		System.out.println("default nonstatic variable is age :"+ref5.age);
		System.out.println("default nonstatic variable is res :"+ref5.res);
		System.out.println("default nonstatic variable is grade :"+ref5.grade);
		System.out.println("default nonstatic variable is roi:"+ref5.roi);
		System.out.println("update variable");
		ref5.age=25;
		ref5.res=false;
		ref5.grade='A';
		ref5.roi=6.6f;
		System.out.println("update nonstatic variable age is :"+ref5.age);
		System.out.println("update nonstatic variable res is :"+ref5.res);
		System.out.println("update nonstatic variable grade is :"+ref5.grade);
		System.out.println("update nonstatic variable roi is :"+ref5.roi);
	}

}
