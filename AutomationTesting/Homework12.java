package p_6;

import java.util.Scanner;

public class zadatak1 {
	
	/*
	 * Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog
	 * ulaza (znaci da korisnik unosi tri broja) i taj program treba da pozove i
	 * ispise (u mainu) najmanji od ta tri unesena broja.
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
		int min = minBroj(broj1, broj2, broj3);
		System.out.println("Najmanji broj je: " + min);

		s.close();
	}

	public static int minBroj(int a, int b, int c) {

		if (a > b) {
			if (b > c) {
				return c;
			}
		} else if (a > b) {
			return b;
		} else {
			return a;
		}
		return a;

	}

}
