package aster.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Abteilung implements Serializable {

	private static final long serialVersionUID = -5315047731778856455L;
	private int id;
	private String name;
	private String abt_leiter;
	private ArrayList<Mitarbeiter> mitarbeiter_liste;

	public Abteilung() {
	}

	public Abteilung(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Abteilung(int id, String name, ArrayList<Mitarbeiter> mitarbeiter_liste) {
		this.id = id;
		this.name = name;
		this.mitarbeiter_liste = mitarbeiter_liste;
	}

	public Abteilung(int id, String name, String abt_leiter, ArrayList<Mitarbeiter> mitarbeiter_liste) {
		this.id = id;
		this.name = name;
		this.abt_leiter = abt_leiter;
		this.mitarbeiter_liste = mitarbeiter_liste;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbt_leiter() {
		return abt_leiter;
	}

	public void setAbt_leiter(String abt_leiter) {
		this.abt_leiter = abt_leiter;
	}

	public ArrayList<Mitarbeiter> getMitarbeiter_liste() {
		return mitarbeiter_liste;
	}

	public void setMitarbeiter_liste(ArrayList<Mitarbeiter> mitarbeiter_liste) {
		this.mitarbeiter_liste = mitarbeiter_liste;
	}

	@Override
	public String toString() {
		String ausgabeMitarbeiter = "";
		for (int i = 0; i < getMitarbeiter_liste().size(); i++) {
			ausgabeMitarbeiter += mitarbeiter_liste.get(i) + "\n";
		}

		ausgabeMitarbeiter += "\n";
		return String.format("Abteilung [id=%s, name=%s, abt_leiter=%s]\nMitarbeiter Liste:\n%s", id, name, abt_leiter,
				ausgabeMitarbeiter);
	}

	public Abteilung ausgabe() {
		return this;
	}
}