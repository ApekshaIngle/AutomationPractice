package AssignmentStringClass;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="12345";
    int i=Integer.parseInt(s);
    System.out.println("using Integer.parseInt -->"+s);
    int i1=Integer.valueOf(s);
    System.out.println("using Integer.valueOf---> "+s);
    int i2=new Integer(s).intValue();
    System.out.println("using new Integer(s).intValue()---->"+s);
    System.out.println("Integer to string =======");
    int a=40;
     String b=Integer.toString(a);
     System.out.println("using Integer.toString --->"+a);
     String b1=String.valueOf(a);
     System.out.println("using String.valueOf --->"+a);
     String b2=String.format("%b2",a);
     System.out.println("using String.format---> "+a);
     
	}

}
