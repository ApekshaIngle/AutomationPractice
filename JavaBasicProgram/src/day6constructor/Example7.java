package day6constructor;

public class Example7 {
       int age;
       double sal;
       Example7(){
    	   System.out.println("========zero parameterized cons starts======");
    	   System.out.println("having no parameter");
    	   System.out.println("========zero parametarized cons end=====");
       }
       Example7(int a){
    	   System.out.println("=====parameterized cons started=====");
    	   System.out.println("having int parameter");
    	   age=25;
    	   System.out.println("====parameterized cons end======");
       } 
       Example7(double b){
    	   System.out.println("=====parameterized cons start=====");
    	   System.out.println("having double parameter");
    	   sal=56000;
    	   System.out.println("====para cons end=====");
       }
       Example7(int a,double b){
    	   System.out.println("========para cons start======");
    	   age=45;
    	   sal=670000;
    	   System.out.println("having double int parameter");
    	   System.out.println("======para cons end=====");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example7 e1=new Example7();
        System.out.println("After zero para cons,age :"+e1.age);
        System.out.println("After zero para cons ,sal :"+e1.sal);
        Example7 e2=new Example7(25);
        System.out.println("After int para cons ,age :"+e2.age);
        System.out.println("After int para cons ,sal :"+e2.sal);
        Example7 e3=new Example7(56000.7);
        System.out.println("After double para cons ,age :"+e3.age);
        System.out.println("After double para cons ,sal :"+e3.sal);
        Example7 e4=new Example7(45,76597.89);
        System.out.println("After double-int para cons ,age :"+e4.age);
        System.out.println("After double-int para cons ,sal :"+e4.sal);
	}

}
