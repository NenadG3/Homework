package p_3;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj:");
		
		int x = s.nextInt();
		//int i=0;
		while (0<x) {
			System.out.println("Laku noc");
			
			x--;
		}
		
		s.close();
	}

}
