package AssignmentStringClass;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str= "java learn and prgram write";
     int length=str.length();
     
     char ch[]=str.toCharArray();
     for (int i=0;i<length-1;i++) {
    	 for(int j=i+1;j<length;j++) {
    		 if(ch[i]==ch[j]) {
    			 System.out.println("Duplicate char are :"+ch[j]);
    			 break;
    		 }
    	 }
     }
	}

}
