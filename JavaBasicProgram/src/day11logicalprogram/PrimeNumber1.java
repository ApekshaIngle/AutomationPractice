package day11logicalprogram;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4, counter = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				counter++;
			}

		}
		if(counter==2) {
			System.out.println("Num is prime number :"+num);
		}else {
			System.out.println("Num is not prime number :"+num);
		}
	}
}