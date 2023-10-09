package AssignmentStringClass;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="Apeksha";
    String s2="Apeksha";
    String s3=new String("Apeksha");
    String s4=s3.intern();
    System.out.println(s1==s2);
    System.out.println(s1==s4);
	}

}
