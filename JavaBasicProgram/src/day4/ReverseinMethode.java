package day4;

public class ReverseinMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getreversnumber(34567);
	}

	static void getreversnumber(int num) {
		System.out.println("actual no is rev :" + num);
		int rev = 0, rem;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("rev no is :" + rev);
	}
}
