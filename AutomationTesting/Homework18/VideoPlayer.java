package Homework18;

public class VideoPlayer {

	private int duzinaVidea;
	private int jacinaZvuka;
	private int kvalitetVidea;
	private int trenutnoVreme;

	public VideoPlayer(int duzinaVidea, int jacinaZvuka, int kvalitetVidea, int trenutnoVreme) {

		this.duzinaVidea = duzinaVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
		this.trenutnoVreme = trenutnoVreme;
	}

	public int getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}

	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}

	public void setTrenutnoVreme(int trenutnoVreme) {
		this.trenutnoVreme = trenutnoVreme;
	}

	public void stampanje() {
		System.out.println("Trenutno vreme videa: " + this.trenutnoVreme);
		System.out.println("Jacina zvuka: " + this.jacinaZvuka);
		System.out.println("Kvalitet videa: " + this.kvalitetVidea);
	}

}
