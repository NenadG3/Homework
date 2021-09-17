package p_6;

import java.util.Scanner;

public class zadatak2 {
	
	/*
	 * Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog
	 * ulaza i taj program treba da pozove i vrati (u mainu) proizvod unetih
	 * brojeva.
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
		int proizvod = proizvodBrojeva(broj1, broj2, broj3);
		System.out.println("Proizvod je: " + proizvod);

		s.close();

	}

	public static int proizvodBrojeva(int a, int b, int c) {
		int pro = a * b * c;
		return pro;
	}

}
