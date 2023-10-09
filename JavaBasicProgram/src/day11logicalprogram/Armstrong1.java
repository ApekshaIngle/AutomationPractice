package day11logicalprogram;
         //153---->1*1*1+5*5*5+3*3*3 =1+125+27=153 it is nothing but 
         // armstrong num
public class Armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=153;
        int temp ,rem=0;
        int sum=0;
        temp=num;
        while(temp>0) {
        	rem=temp%10;
        	sum=sum+rem*rem*rem;
        	temp=temp/10;
        }
        if(sum==num) {
        	System.out.println(num +"The num is armstrong num:true ");
        }
        else {
        	System.out.println(num+"The num is not armstrong num :false");
        }
	}

}
