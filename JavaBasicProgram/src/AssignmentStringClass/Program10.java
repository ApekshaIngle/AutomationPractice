package AssignmentStringClass;

//Write a java program to prove strings are immutable in java.

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="Apeksha";//literal
     System.out.println(s);
     
     String s1="Apeksha";
     System.out.println(s1);
     
     s.concat("Ingle");
     System.out.println(s);
     System.out.println("====================================");
     
     String a= new String ("java ");
      System.out.println(a);
      String b= new String ("java ");
       System.out.println(b);
       
       a.concat("Learn");
       System.out.println(a);
	}

}
