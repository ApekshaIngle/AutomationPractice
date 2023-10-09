package day6constructor;

public class Example3 {
         int age;
         double sallary;
         Example3(){
        	 System.out.println("********** user define zero para cons");
        	 age=25;
        	 sallary=32675.87;
        	 System.out.println("************** user define zero para cons ends");
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Example3 e1=new Example3();
       System.out.println(e1.age);
       System.out.println(e1.sallary);
       e1.age=55;
       System.out.println("updated value of age"+e1.age);
       Example3 e2=new Example3();
       System.out.println(e2.age);
       System.out.println(e2.sallary);
	}

}
