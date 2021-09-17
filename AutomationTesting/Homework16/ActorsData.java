package Homework16;

public class ActorsData {

	/*
	 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
	 * rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
	 * prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
	 * odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
	 * godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
	 * da se doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array
	 * listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
	 * napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
	 * ocenjenog filma od tih pet (preko getera i setera).
	 */

	public String fullName;
	public int birthYear;
	public char gender;
	private String martialStatus;
	private double avgSalary;
	private int movies;
	private String prefix;

	public ActorsData(String fullName, int birthYear, char gender, String martialStatus, double avgSalary, int movies) {
		this.fullName = fullName;
		this.birthYear = birthYear;
		this.gender = gender;
		this.martialStatus = martialStatus;
		this.avgSalary = avgSalary;
		this.movies = movies;

	}

	private boolean married() {
		if (this.martialStatus.equalsIgnoreCase("married")) {
			return true;
		} else {
			return false;
		}

	}

	public double totalSalary() {
		return this.avgSalary * this.movies;

	}

	public int ageIn2022() {
		return 2022 - this.birthYear;

	}

	public String prefix() {
		String mr = "Mr. ";
		String mrs = "Mrs. ";
		switch (this.gender) {
		case 'm':
			return mr;
		case 'f':
			return mrs;
		}
		return this.prefix;
	}

	public void print() {
		System.out.println(this.prefix() + fullName + " was born in " + birthYear + ", married: " + this.married()
				+ ",  average salary per movie is " + avgSalary + "$" + ", recorded " + movies
				+ " movies with total earnings of " + this.totalSalary() + "$" + ", next year will be "
				+ this.ageIn2022() + " years old.");
	}

}
