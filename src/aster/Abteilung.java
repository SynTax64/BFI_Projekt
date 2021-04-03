package aster;

public class Abteilung {
	private int id;
	private String name;
	private String abt_leiter;
	private Mitarbeiter[] mitarbeiter_liste;

	public Abteilung() {
	}

	public Abteilung(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Abteilung(int id, String name, Mitarbeiter[] mitarbeiter_liste) {
		this.id = id;
		this.name = name;
		this.mitarbeiter_liste = mitarbeiter_liste;
	}

	public Abteilung(int id, String name, String abt_leiter, Mitarbeiter[] mitarbeiter_liste) {
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

	public Mitarbeiter[] getMitarbeiter_liste() {
		return mitarbeiter_liste;
	}

	public void setMitarbeiter_liste(Mitarbeiter[] mitarbeiter_liste) {
		this.mitarbeiter_liste = mitarbeiter_liste;
	}

	@Override
	public String toString() {
		String ausgabeMitarbeiter = "";
		for (int i = 0; i < getMitarbeiter_liste().length; i++) {
			ausgabeMitarbeiter += mitarbeiter_liste[i] + "\n";
		}

		ausgabeMitarbeiter += "\n";
		return String.format("Abteilung [id=%s, name=%s, abt_leiter=%s]\nMitarbeiter Liste:\n%s", id, name, abt_leiter,
				ausgabeMitarbeiter);
	}

	public Abteilung ausgabe() {
		return this;
	}
}