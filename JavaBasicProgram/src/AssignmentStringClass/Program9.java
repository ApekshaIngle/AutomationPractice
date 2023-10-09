package AssignmentStringClass;

//How to reverse a string in java?

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Java Automation 145#$";
     
         int uppercasecount=0;
         int lowercasecount=0;
         int digits=0;
         int specChar=0;
         int length= s.length();
         for (int i=0;i<length;i++) {
        	 char ch=s.charAt(i);
        	 
        	 if (Character.isUpperCase(ch)) {
        		 uppercasecount++;
        	 }else if(Character.isLowerCase(ch)) {
        		 lowercasecount++;
        	 }else if (Character.isDigit(ch)) {
        		 digits++;
        	 }else {
        		 specChar++;
        	 }
         }
        double Uppercasepercentage=(uppercasecount*100.0);
        double lowercasepercentage    = (lowercasecount*100.0);
        double Digitspercentage       =    (digits*100.0);
        double specCharpercentage       =    (specChar*100.0);
        
       System.out.println("in given string "+s);
       
       System.out.println("upeer case per --->"+Uppercasepercentage);
       System.out.println("lowercase per -->"+lowercasepercentage);
       System.out.println("digits per =-->"+Digitspercentage);
       System.out.println("speccghar per -->"+specCharpercentage);
	}

}
