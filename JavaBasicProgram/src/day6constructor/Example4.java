package day6constructor;

public class Example4 {
           int roll;
           double sallery;
           Example4(int r, double s){
        	   roll=r;
        	   sallery=s;
        	   
           }
           void display() {
        	   System.out.println(roll+" "+sallery);
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Example4 e1= new Example4(101,387654);
            e1.display();
    Example4 e2=new Example4(654,63728.89);
            e2.display();
    Example4 e3= new Example4(234,27680977.67);
           e3.display();
           
	}

}
//parameterized constructor: 
//is used to initialize different values for non-static variable at the time of object creation

