package dwl;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji oponasa kviz za pogadjanje glavnog grada. - Program
		 * treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa.
		 * 1. Francuska 2. Italija 3. Srbija 4. Izlaz - Nakon odabira drzave, potrebno
		 * je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' - Ako korisnik
		 * odgovori tacno, ispisuje se poruka 'Odgovor je tacan' - Ako korisnik odgovori
		 * netacno, ispisuje se poruka 'Odgovor nije tacan' - Nakon davanja odgovora
		 * (bilo da je tacan ili netacan), ponovo treba da se postave sve pocetne opcije
		 * i ponudi korisniku da odabere neku od njih. - Program se zavrsava kad korisni
		 * odabere 4. opciju 'Izlaz' - Program uraditi koriscenjem dosad naucenog +
		 * do-while petlje
		 */

		Scanner s = new Scanner(System.in);

		String odgovor;
		int o;

		do {
			System.out.println("Izaberite ponudjenu zemlju ili izlaz programa(od 1 do 4): ");
			System.out.println("1. Francuska");
			System.out.println("2. Italija");
			System.out.println("3. Srbija");
			System.out.println("4. Izlaz");
			o = s.nextInt();

			if (o == 1) {
				System.out.println("Koji je glavni grad Francuske? ");
				s.nextLine();
				odgovor = s.nextLine();
				odgovor = odgovor.toLowerCase();
				if (odgovor.equals("pariz")) {
					System.out.println("Odgovor je tacan!");

				}

				else {
					System.out.println("Odgovor je netacan!");
				}

			} else if (o == 2) {
				System.out.println("Koji je glavni grad Italije? ");
				s.nextLine();
				odgovor = s.nextLine(); // ili odgovor = s.next();
				odgovor = odgovor.toLowerCase();
				if (odgovor.equals("rim")) {
					System.out.println("Odgovor je tacan!");

				}

				else {
					System.out.println("Odgovor je netacan!");
				}
			}

			else if (o == 3) {
				System.out.println("Koji je glavni grad Srbije? ");
				s.nextLine();
				odgovor = s.nextLine();
				odgovor = odgovor.toLowerCase();
				if (odgovor.equals("beograd")) {
					System.out.println("Odgovor je tacan!");

				}

				else {
					System.out.println("Odgovor je netacan!");
				}

			}

		} while (o != 4);
		{
			System.out.println("Program je zavrsen!");
		}
		s.close();

	}

}
