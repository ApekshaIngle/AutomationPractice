package day3;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		if (isPrime(n)) {
			System.out.println("is prime number");
		} else {
			System.out.println("is prime number");
		}
	}

}
