package Homework20;

//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

public class Vozac extends Covek {

	private String zvanje;

	public Vozac(String ime, String prezime, String zvanje) {
		super(ime, prezime);
		this.zvanje = zvanje;
	}

	@Override
	public String toString() {
		return super.toString() + " zanimanje: " + zvanje;

	}

}
