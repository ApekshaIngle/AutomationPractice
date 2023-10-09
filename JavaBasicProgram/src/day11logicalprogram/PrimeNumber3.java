package day11logicalprogram;

public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=46,counter=0;
        for (int i=1;i<=num;i++) {
        	if(num%i==0) {
        		counter++;
        	}
        }
        if(counter==2) {
        	System.out.println("The num is prime num :"+num);
        }else {
        	System.out.println("The num is not prime num :"+num);
        }
        System.out.println("========================================");
        int a=123;
        int temp,rem=0;
        int sum=0;
        temp=a;
        while(temp>0) {
        	   rem=temp%10;
        	   sum=sum+rem*rem*rem;
        	   temp=temp/10;
        }
        if(sum==a) {
        	System.out.println("The num is armstrong num :"+num);
        }else {
        	System.out.println("The num is not armstrong num :"+num);
        }
	}

}
