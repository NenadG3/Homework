package Homework17;

public class Sisari extends Zivotinje {

	private String krzno;
	private String nacinIshrane;
	private String podela;

	public Sisari(String vrsta, String naziv, String ishrana, String krzno, String nacinIshrane, String podela) {
		super(vrsta, naziv, ishrana);
		this.krzno = krzno;
		this.nacinIshrane = nacinIshrane;
		this.podela = podela;
	}

	public String getKrzno() {
		return krzno;
	}

	public void setKrzno(String krzno) {
		this.krzno = krzno;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}

	public String getPodela() {
		return podela;
	}

	public void setPodela(String podela) {
		this.podela = podela;
	}

	public void stampanje() {
		super.stampanje();
		System.out.println("Boja krzna: " + this.krzno);
		System.out.println("Nacin ishrane: " + this.nacinIshrane);
		System.out.println("Divlja/domaca : " + this.podela);
	}
}
