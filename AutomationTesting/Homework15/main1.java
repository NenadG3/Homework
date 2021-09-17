package Homework15;

public class main1 {

	public static void main(String[] args) {

		Automobil automobil1 = new Automobil();

		automobil1.markaAutomobila = "Mazda";
		automobil1.modelAutomobila = "3";
		automobil1.pogonAutomobila = "zadnji";
		automobil1.brojVrata = 5;
		automobil1.godisteAutomobila = 2010;

		automobil1.stampanjePodataka();

		Automobil automobil2 = new Automobil();

		automobil2.markaAutomobila = "Ford";
		automobil2.modelAutomobila = "Fiesta";
		automobil2.pogonAutomobila = "prednji";
		automobil2.brojVrata = 5;
		automobil2.godisteAutomobila = 2006;

		automobil2.stampanjePodataka();

	}

}
