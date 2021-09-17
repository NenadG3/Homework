package p_3;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();
		
		if (r > 0) {
			System.out.println(r * r * 3.14);
		} else {
			System.out.println("Greska u unosu!");
		}
		sc.close();
	}

}
