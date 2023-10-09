package AssignmentStringClass;

//Check whether given String is a palindrome or not?

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="madam";
    String s1="";
    for( int i=s.length()-1;i>=0;i--) 
    {
    	s1=s1+s.charAt(i);
    }
    
    if(s.equals(s1))
    {
    	System.out.println(" palindrom ");
    }else {
    	System.out.println("  not palindrom");
    }
	}
	}

