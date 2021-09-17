package dwl;

import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Koliko puta zelite Laku noc?");
		int b = s.nextInt();
		int i = 0;

		while (b > i) {
			System.out.println("Laku noc");
			i++;
		}
		
		s.close();
	}
}
