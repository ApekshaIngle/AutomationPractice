package day11logicalprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 71, counter = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				++counter;
			}
		}
		if (counter == 2) {
			System.out.println("Prime Number: " + num);
		} else {
			System.out.println("Given number is not a prime: " + num);
		}
	}

}
