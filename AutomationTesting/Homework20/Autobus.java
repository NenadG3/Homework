package Homework20;

import java.util.ArrayList;

//Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze.
//Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.
//Moguce je naplatiti kartu putnicima samo ako je vozac prisutan.

public class Autobus {

	private String naziv;
	private Vozac voz;
	private int cenaKarte;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, Vozac voz, int cenaKarte) {

		this.naziv = naziv;
		this.voz = voz;
		this.cenaKarte = cenaKarte;
		this.putnici = new ArrayList<Putnik>();
	}

	public Vozac getVozac() {
		return voz;
	}

	public void setVozac(Vozac voz) {
		this.voz = voz;
	}

	public Putnik dodajPutnika(String ime, String prezime, int novac) {
		Putnik p = new Putnik(ime, prezime, novac);
		putnici.add(p);
		return p;
	}

	public void ukloniPutnika(Putnik p) {
		putnici.remove(p);
	}

	public ArrayList<Putnik> getPutnici() {
		return putnici;
	}

	public Vozac dodajVozaca(String ime, String prezime, String zvanje) {
		Vozac v = new Vozac(ime, prezime, zvanje);
		return v;
	}

	public void ukloniVozaca() {
		this.voz = null;
	}

	@Override
	public String toString() {
		return "Autobus "  +naziv + " ima vozaca " + voz + " gde je cena karte " + cenaKarte + " i u njemu se vozi "
				+ putnici;

	}

}
