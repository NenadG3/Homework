package Homework17;

public class GlavnaKlasa {

	public static void main(String[] args) {

		Sisari s1 = new Sisari("kicmenjak", "lav", " meso", "zuta", "mesojedi", "divlja");
		s1.stampanje();

		System.out.println();

		Ribe r1 = new Ribe("kicmenjak", "tuna", "morska", "slana", 5, "dupla");
		r1.stampanje();

		System.out.println();

		//Staniste st1 = new Staniste(+"savana");

		System.out.println();

		s1.setPodela("domaca");
		s1.stampanje();
	}

}
