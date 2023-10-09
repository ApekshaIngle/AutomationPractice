package day4;

public class ForLoopExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 4; ++i) {
			System.out.println("Hello :" + i);

			for (int m = 0; m <= 3; m++) {
				System.out.println("\tbye :" + m);

				for (int t = 0; t <= 2; ++t) {
					System.out.println("\t\tok :" + t);
				}
			}
		}
	}
}