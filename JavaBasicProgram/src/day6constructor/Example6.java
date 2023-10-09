package day6constructor;

public class Example6 {
             Example6(){
            	 System.out.println("i am zero para cons ");
            	 System.out.println("having no para ");
             }
             Example6(int a){
            	 System.out.println("i am parametarized cons ");
            	 System.out.println("having int parameter");
             }
             Example6(double b){
            	 System.out.println("i am parametarized cons");
            	 System.out.println("having double parameter");
             }
             Example6(int a,double b,long c){
            	 System.out.println("i am paramitterized cons ");
            	 System.out.println("having int double long parameter");
             }
             Example6(long a,int b,double c){
            	System.out.println("i am parameterized cons"); 
            	System.out.println("having long int double parameter");
             }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example6 e1=new Example6();
        Example6 e2=new Example6(23);
        Example6 e3=new Example6(45.8);
        Example6 e4=new Example6(23,45.8,58);
        Example6 e5=new Example6(65,78,87.9);

	}

}
