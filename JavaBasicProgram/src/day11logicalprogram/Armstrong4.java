package day11logicalprogram;

public class Armstrong4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=153;
       int temp,rem=0;
       int sum=0;
       temp=num;
       while(temp>0) {
    	   rem=temp%10;
    	   sum=sum+rem*rem*rem;
    	   temp=temp/10;
    	      }
       if(sum==num) {
    	   System.out.println("The num is armstrong num: true");
       }
       else {
    	   System.out.println("The num is not rmstrong num :false");
       }
	}

}
