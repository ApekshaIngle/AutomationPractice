package StringClass;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1="Pune";
   String s2="Pune";
   String s3="Mumbai";
   System.out.println("s1 :"+s1);
   System.out.println("s2 :"+s2);
   System.out.println("s3 :"+s3);
   System.out.println("compare s and s2 based on the value :"+s1.equals(s2));
   System.out.println("compare s and s2 based on the adress :"+(s1==s2));
   System.out.println("compare s and s2 based on the value :"+s1.equals(s3));
   System.out.println("compare s and s2 based on the adress :"+(s1==s3));
   String s4=new String("Pune");
   System.out.println("s4 :"+s4);
   System.out.println();
   System.out.println("compare s4 and s1 based on the value :"+s1.equals(s4));
   System.out.println("compare s4 and s1 based on the adress :"+(s1==s4));
   System.out.println("==================================");
   String s5="Banglore";
   System.out.println("s5 :"+s5+"has total charector count as :"+s5.length());
   char IndexZeroChar=s5.charAt(2);
   System.out.println("2 number index charectre is :"+IndexZeroChar);
   for(int i=0;i<s5.length();i++) {
	   System.out.println("char index :"+i+": " +s5.charAt(i));
	   
   }
System.out.println("=======================");
    String s6="I am Apeksha ,I am staying in mumbai,I am working test engg";
     System.out.println("s6 :"+s6);
     System.out.println( s6.replaceFirst("am","was"));
     System.out.println( s6.replace("am","was"));
     System.out.println("===========================");
     System.out.println (s5.subSequence(1,4));
	}

}
