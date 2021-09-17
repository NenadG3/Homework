package p_3;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int b = 0;
		int z = 0;

		while (b >= 0) {

			System.out.print("Unesite broj: ");
			z = z + b;

			b = s.nextInt();

			
			if (b < 0) {
				System.out.println("Program je završen");
				break;
			}
		

		}
		System.out.println(z);
		s.close();
	}

}
