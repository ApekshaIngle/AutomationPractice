package day4;

public class _ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 3; ++i) {
			System.out.println("Hello  :" + i);

			for (int j = 0; j <= 2; j++) {
				System.out.println("\tHi " + j);

				for (int k = 0; k <= 2; k++) {
					System.out.println("\t\tbye" + k);
				}
			}
		}
	}

}
