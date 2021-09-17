package Homework15;

public class Automobil {

	public String markaAutomobila;
	public String modelAutomobila;
	public String pogonAutomobila;
	public int brojVrata;
	public int godisteAutomobila;
	private int predjeniKm;
	private int potrosnjaGoriva;
	private int kubikaza;
	public double ukupnaCenaGoriva;

	public Automobil(String marka, String model, String pogon, int vrata, int godiste) {

		this.markaAutomobila = marka;
		this.modelAutomobila = model;
		this.pogonAutomobila = pogon;
		this.brojVrata = vrata;
		this.godisteAutomobila = godiste;

	}

	public Automobil() {

	}

	public void stampanjePodataka() {

		System.out.println("Marka automobila je " + markaAutomobila + ", model je " + modelAutomobila + ", ima "
				+ pogonAutomobila + " pogon, ima " + brojVrata + " vrata i " + godisteAutomobila
				+ " je godiste i presao je " + getPredjeniKm() + " kilometara. Potrosnja na 100km je " + getPotrosnja()
				+ " litara a ukupna cena potrosenog goriva je " + getUkupnaCenagoriva() + " dinara");
	}

	public void setPredjeniKm(int km) {
		this.predjeniKm = km;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;
	}

	public void setKubikaza(int cm3) {
		this.kubikaza = cm3;

	}

	public int getKubikaza() {
		return this.kubikaza;

	}

	public int getPotrosnja() {
		if (this.kubikaza > 1000) {
			return this.potrosnjaGoriva = 10;
		} else {
			return this.potrosnjaGoriva = 8;
		}
	}
	
	
	public double getUkupnaCenagoriva() {
		return this.ukupnaCenaGoriva = ((this.potrosnjaGoriva / 100.0) * 120) * this.predjeniKm;
		
	}
}
