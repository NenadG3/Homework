package p_6;

import java.util.Scanner;

public class zadatak3 {
	
	/*
	 * DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima ->
	 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva
	 * i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca
	 * najveci od unetih brojeva.
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int broj1 = 0, broj2 = 0, broj3 = 0;
		System.out.println("Unestite prvi broj: ");
		broj1 = s.nextInt();
		System.out.println("Unestite drugi broj: ");
		broj2 = s.nextInt();
		System.out.println("Unestite treci broj: ");
		broj3 = s.nextInt();

		int zbir = zbirBrojeva(broj1, broj2, broj3);
		System.out.println("Zbir je: " + zbir);
		int max = maxBroj(broj1, broj2, broj3);
		System.out.println("Najveci broj je: " + max);

		s.close();
	}

	public static int zbirBrojeva(int a, int b, int c) {
		int zbir = a + b + c;
		return zbir;
	}

	public static int maxBroj(int a, int b, int c) {

		if (a < b) {
			if (b < c) {
				return c;
			}
		} else if (a < b) {
			return b;
		} else {
			return a;
		}
		return a;

	}
	

}
