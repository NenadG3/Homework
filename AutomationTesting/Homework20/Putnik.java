package Homework20;

//Putnik je covek koji poseduje novac.Inicijalno poseduje odredjenu kolicinu 
//novca koja mu se zadaje prilikom kreiranja.
//Odredjena svota novca moze da mu se doda i/ili oduzme.

public class Putnik extends Covek {

	private int novac;

	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public int getNovac() {
		return novac;
	}

	public void setNovac(int novac) {
		this.novac = novac;
	}

	public void dodaj(int dodaj) {
		this.novac += dodaj;
		{
			System.out.println("Uspesno ste dopunili kredit");
		}
	}

	public void oduzmi(int oduzmi) {
		if (this.novac > 0 && this.novac >= oduzmi)
			this.novac -= oduzmi;
		else {
			System.out.println("Nevalidan iznos za oduzimanje");
		}

	}

	public String toString() {
		return "Putnik " + super.toString() + " koji ima " + novac + " dinara.";

	}

}
