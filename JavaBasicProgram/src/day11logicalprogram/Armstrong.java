package day11logicalprogram;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1534;
     int  temp,rem=0;
     int sum=0;
     temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("numis Armstrong num : true"+num);
		}
		else {
			System.out.println("num is not Armstrong num : false"+num);
		}
	}
	

	}


