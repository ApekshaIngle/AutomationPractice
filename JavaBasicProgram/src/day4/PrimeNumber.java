package day4;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i < n / 2; i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=19;
       if(isPrime(n)) {
    	   System.out.println("The number is prime");
       }else {
    	   System.out.println("The number is not prime");
       }
	}

}
