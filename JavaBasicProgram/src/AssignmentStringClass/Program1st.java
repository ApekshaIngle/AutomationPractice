package AssignmentStringClass;

//How to reverse a string in java?//

public class Program1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int l;
     String a="Learn java";
     String a2="";
     l=a.length();
     
     for(int i=l-1;i>=0;i--) {
    	a2= a2 +a.charAt(i);
     }
     System.out.println(a2);
     System.out.println("===============================");
      
     //by using StringBuffer method//
     StringBuffer r=new StringBuffer("Learn coading");
     System.out.println(r.reverse());
     System.out.println("====================================");
     
     //by using StringBuilder method//
     StringBuilder r2=new StringBuilder("Java Program");
     System.out.println(r2.reverse());
	}

}
