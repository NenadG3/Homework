package Homework17;

import java.util.ArrayList;

public class Staniste {

	private ArrayList<Zivotinje> lista = new ArrayList<>();

	private String naziv;

	public Staniste(ArrayList<Zivotinje> lista, String naziv) {

		this.lista = lista;
		this.naziv = naziv;
	}

	public void setLista(ArrayList<Zivotinje> lista) {
		Zivotinje clan = null;
		lista.add(clan);
	}

	public ArrayList<Zivotinje> getLista() {
		return lista;
	}

	public String getNaziv() {
		return naziv;
	}

	public void stampanje() {
		System.out.println("Naziv: " + naziv);
		System.out.println("Zivotinje: " + lista);
	}
}
