package Homework18;

public class QualityOptimizerControl extends Control {

	private double brzina;

	public QualityOptimizerControl(double brzina) {
		super();
		this.brzina = brzina;
	}

	public double getBrzina() {
		return brzina;
	}

	public void setBrzina(double brzina) {
		this.brzina = brzina;
	}

	public void izvrsiAkciju(VideoPlayer vp) {
		double kvalitet = brzina * 10.1;
		if (kvalitet >= 1080) {
			vp.setKvalitetVidea(1080);
		} else if (kvalitet <= 720) {
			vp.setKvalitetVidea(720);
		} else if (kvalitet <= 480) {
			vp.setKvalitetVidea(480);
		} else if (kvalitet <= 240) {
			vp.setKvalitetVidea(240);
		} else
			vp.setKvalitetVidea(144);

	}

}
