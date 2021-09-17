package Homework18;

public class AudioControl extends Control {

	private boolean volume;

	public AudioControl(boolean volume) {
		super();
		this.volume = volume;

	}

	public boolean isPojacavanje() {
		return volume;
	}

	public void setPojacavanje(boolean volume) {
		this.volume = volume;
	}

	public void izvrsiAkciju(VideoPlayer vp) {
		if (volume) {
			if (vp.getJacinaZvuka() < 100) {
				vp.setJacinaZvuka(vp.getJacinaZvuka() + 1);
			} else {
				vp.setJacinaZvuka(100);
			}
		} else {
			if (vp.getJacinaZvuka() > 0) {
				vp.setJacinaZvuka(vp.getJacinaZvuka() - 1);
			} else {
				vp.setJacinaZvuka(0);
			}
		}
	}

}
