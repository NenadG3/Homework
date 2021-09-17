package dwl;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		// -Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera. (Koristiti for petlju)
		
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite broj zvezdica: ");
		int brojZ = s.nextInt();
		int i, j;
		
		for ( i = 1; i <= brojZ; i++) {
			
			for (j =0; j < i; j++) 
			{System.out.print("*");}
		
		
		System.out.println();
	}
	}
}
