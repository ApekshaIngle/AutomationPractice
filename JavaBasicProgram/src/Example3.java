
public class Example3 {
   Example3(){
	   System.out.println("This is zero parameterize xonstructor");
   }
   Example3(char c){
	   System.out.println("This is single parameterized cons ");
   }
   Example3(int num1,int num2){
	   System.out.println("this is int int parameterized cons");
   }
   Example3(double num1,int num2){
	   System.out.println("This is double int para cons ");
   }
   Example3(int num1,double num2){
	   System.out.println("this is int double para cons");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 e1= new Example3();
		Example3 e2= new Example3('f');
		Example3 e3= new Example3(10,20);
		Example3 e4= new Example3(45d,24);
		Example3 e5= new Example3(45,89d);
	}

}
