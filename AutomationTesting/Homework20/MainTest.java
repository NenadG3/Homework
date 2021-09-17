package Homework20;

public class MainTest {

	public static void main(String[] args) {

		Vozac v1 = new Vozac("Mika", "Mikic", "sofer");
//		System.out.println(v1);
//		
//		Putnik p1 = new Putnik ("Zika", "Zikic", 100);
//		System.out.println(p1);
//		p1.oduzmi(50);
//		System.out.println(p1);
//		p1.dodaj(100);
//		System.out.println(p1);
	
		
		
		Autobus a1 = new Autobus("Resava Reisen", v1, 150);
		Vozac v2 = a1.dodajVozaca("Peka", "Pekovic", "sofer");
		a1.setVozac(v2);
		System.out.println(a1);
		Putnik p2 = a1.dodajPutnika("Nenad", "Nenadovic", 200);
		System.out.println(a1);
		Putnik p3 = a1.dodajPutnika("Dzo", "Dzoic", 250);
		System.out.println(a1);
		a1.ukloniPutnika(p2);
//		Putnik p2 = a1.dodajPutnika("Raka", "Rakic", 100);
//		a1.setPutnik(p2);
		System.out.println(a1);

//		a1.ukloniVozaca();
//		System.out.println(a1);
	}

}
