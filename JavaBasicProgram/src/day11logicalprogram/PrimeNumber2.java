package day11logicalprogram;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int num=401,counter=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				counter++;
			}
		}
		if(counter==2) {
			System.out.println("The num is prime num :"+num);
		}else {
			System.out.println("The num is not prime num :"+num);
		}
	}
	
	

}
