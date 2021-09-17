package dwl;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {

		// Napraviti program koji od korisnika zahteva da unese dva broja koja ce
		// sabratii ispisati rezultat korisniku.
		// Takodje nakon ispisa rezultata ponuditi korisniku da ponoviunos sa novim
		// brojevima ili da izadje iz aplikacije

		Scanner s = new Scanner(System.in);

		String odg;

		do {
			System.out.println("Unesite brojeve za sabiranje: ");
			int b1 = s.nextInt();
			int b2 = s.nextInt();
			int z = b1 + b2;
			System.out.println("zbir unetih brojeva je: " + z);
			System.out.println("Da li zelite da nastavite? ");
			odg = s.next();

		} while (odg.equals("da"));
		System.out.println("program je zavrsen");
	
		s.close();
	}

}
