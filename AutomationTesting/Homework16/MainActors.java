package Homework16;

import java.util.ArrayList;

public class MainActors {

	public static void main(String[] args) {

		ActorsData a1 = new ActorsData("Christopher Walken", 1943, 'm', "married", 56560.54, 25);
		a1.print();
		ActorsData a2 = new ActorsData("Emily Blunt", 1983, 'f', "single", 76546.67, 11);
		a2.print();

		System.out.println();

		ArrayList<Object> films = new ArrayList();
		films.add("The House Next Door (3.6)");
		films.add("Pig (7.0)");
		films.add("Luca (7.5)");
		films.add("Till Death (5.4)");
		films.add("Those Who Wish Me Dead (6.0)");

		Object alt = films.get(0);
		films.set(0, films.get(2));
		films.set(2, alt);
		alt = films.get(4);
		films.set(4, films.get(2));
		films.set(2, alt);

		for (int i = 0; i < films.size(); i++) {
			System.out.println((i + 1) + ". " + films.get(i));
		}

	}

}
