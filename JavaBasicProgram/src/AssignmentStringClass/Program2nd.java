package AssignmentStringClass;

public class Program2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a="we        are      learning    java     program";
      System.out.println("Before removing white spaces"+a);

      
      a=a.replaceAll("\\s", "");
      
      System.out.println("After removing white spaces"+a);
	}

}
