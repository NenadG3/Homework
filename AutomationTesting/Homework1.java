package primer_01;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		String ime="Nenad";
		String pre="Gojkovic";
		char pol='M';
		
		
		System.out.println("Vaše ime i prezime je " + ime + " " + pre);
		System.out.println("Vaš pol je: " + pol);
				
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("Unesite ukupan broj svih medalja: ");
		
		double m= s.nextDouble();
		
		System.out.print("Unesite ukupan broj zlatnih medalja: ");
		
		double z= s.nextDouble();
		
		double p = (z/m)*100; 

		System.out.println("Procenat osvojenih zlatnih medalja je: " + p);
		
		s.close();
		
		
	}

}
