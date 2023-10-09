package AssignmentStringClass;

//How to reverse each word of a string in java?

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name ="Apeksha";
     int length=name.length();
     String revers=" ";
     for(int i=length-1;i>=0; i--)
     {
    	 revers=revers+name.charAt(i);
     }
     System.out.println( "Revers of"+name+revers);
	}

}
