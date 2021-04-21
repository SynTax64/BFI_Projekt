package aster.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Firma implements Serializable {

	private static final long serialVersionUID = -1327482906855942438L;
	List<Mitarbeiter> mitarbeiter_Liste;
	List<Abteilung> abteilungen_Liste;

	public Firma(List<Mitarbeiter> mitarbeiter_Liste, List<Abteilung> abteilungen_Liste) {
		this.mitarbeiter_Liste = mitarbeiter_Liste;
		this.abteilungen_Liste = abteilungen_Liste;
	}

	public List<Mitarbeiter> getMitarbeiter_Liste() {
		return mitarbeiter_Liste;
	}

	public void setMitarbeiter_Liste(ArrayList<Mitarbeiter> mitarbeiter_Liste) {
		this.mitarbeiter_Liste = mitarbeiter_Liste;
	}

	public List<Abteilung> getAbteilungen_Liste() {
		return abteilungen_Liste;
	}

	public void setAbteilungen_Liste(ArrayList<Abteilung> abteilungen_Liste) {
		this.abteilungen_Liste = abteilungen_Liste;
	}

	public void setMitarbeiter_Liste(List<Mitarbeiter> mitarbeiter_Liste) {
		this.mitarbeiter_Liste = mitarbeiter_Liste;
	}

	public void setAbteilungen_Liste(List<Abteilung> abteilungen_Liste) {
		this.abteilungen_Liste = abteilungen_Liste;
	}

	@Override
	public String toString() {
		String outputAbteilungDaten = "";
		for (int i = 0; i < abteilungen_Liste.size(); i++) {
			outputAbteilungDaten += abteilungen_Liste.get(i);
		}
		return String.format("Firma\n%s", outputAbteilungDaten);
	}
}
