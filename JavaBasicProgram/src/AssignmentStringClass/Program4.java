package AssignmentStringClass;

import java.util.Arrays;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String x="Mother In Law";
          String y="Hitler Woman";
          
          char a[]=x.toCharArray();
          char b[]=y.toCharArray();
          
          Arrays.sort(a);
          Arrays.sort(b);
          
          Boolean result=Arrays.equals(a,b);
          if (result==true)
          {
        	  System.out.println("String is anagram ");
          }else {
        	  System.out.println("String is not anagram");
          }

	}

}
