package dwl;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int broj = 0;
		int zbir = 0;
		
		do {
			System.out.print("Unesite broj za sabiranje: ");
			zbir = zbir + broj;
			broj = s.nextInt();

		}

		while (broj > 0);
		System.out.println("Zbir unetih brojeva je: " + zbir);
		s.close();

	}

}
  //test1 = 5, 145, 375,-1
   		//test2 = 13, 29, -11
		//test1 = 29, 175, 228, 1, -28