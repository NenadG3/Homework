package Homework17;

public class Ribe extends Zivotinje {

	private String tipVode;
	private int brojPeraja;
	private String vrstaPeraja;

	public Ribe(String vrsta, String naziv, String ishrana, String tipVode, int brojPeraja, String vrstaPeraja) {
		super(vrsta, naziv, ishrana);
		this.tipVode = tipVode;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getTipVode() {
		return tipVode;
	}

	public void setTipVode(String tipVode) {
		this.tipVode = tipVode;
	}

	public int getBrojPeraja() {
		return brojPeraja;
	}

	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}

	public void stampanje() {
		super.stampanje();
		System.out.println("Tip vode: " + this.tipVode);
		System.out.println("Broj peraja: " + this.brojPeraja);
		System.out.println("Vrsta peraja: " + this.vrstaPeraja);
	}
}
