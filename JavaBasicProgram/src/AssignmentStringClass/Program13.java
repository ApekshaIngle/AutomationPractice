package AssignmentStringClass;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="java learn";
      
      for( int i=0;i<s.length();i++) {
    	  int count =0;
    	  for(int j=0;j<s.length();j++) {
    		  if(s.charAt(i)==s.charAt(j)) {
    			  count++;
    		  }
    	  }
    	  if (count>1) {
    		  System.out.println("First reapeting charector is :"+s.charAt(i));
    	  }break;
      }
	}

}
