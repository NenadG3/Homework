package Homework18;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		VideoPlayer v1 = new VideoPlayer(300, 50, 240, 150);
		v1.stampanje();

		AudioControl a1 = new AudioControl(false);
		// a1.izvrsiAkciju(v1);
		// v1.stampanje();

		TimeControl t1 = new TimeControl(true);
		// t1.izvrsiAkciju(v1);
		// v1.stampanje();

		QualityOptimizerControl q1 = new QualityOptimizerControl(20);
		// q1.izvrsiAkciju(v1);
		// v1.stampanje();

		AudioControl a2 = new AudioControl(true);

		TimeControl t2 = new TimeControl(false);

		QualityOptimizerControl q2 = new QualityOptimizerControl(40);

		ArrayList<Control> kontrole = new ArrayList<Control>();
		kontrole.add(a2);
		kontrole.add(t2);
		kontrole.add(q2);

		for (int i = 0; i < kontrole.size(); i++) {
			kontrole.get(i).izvrsiAkciju(v1);

		}

		v1.stampanje();

	}

}
