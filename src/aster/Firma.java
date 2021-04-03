package aster;

public class Firma {
	Mitarbeiter[] mitarbeiter_Liste;
	Abteilung[] abteilungen_Liste;

	public Firma(Mitarbeiter[] mitarbeiter_Liste, Abteilung[] abteilungen_Liste) {
		this.mitarbeiter_Liste = mitarbeiter_Liste;
		this.abteilungen_Liste = abteilungen_Liste;
	}

	public Mitarbeiter[] getMitarbeiter_Liste() {
		return mitarbeiter_Liste;
	}

	public void setMitarbeiter_Liste(Mitarbeiter[] mitarbeiter_Liste) {
		this.mitarbeiter_Liste = mitarbeiter_Liste;
	}

	public Abteilung[] getAbteilungen_Liste() {
		return abteilungen_Liste;
	}

	public void setAbteilungen_Liste(Abteilung[] abteilungen_Liste) {
		this.abteilungen_Liste = abteilungen_Liste;
	}

	@Override
	public String toString() {
		String outputAbteilungDaten = "";
		for (int i = 0; i < abteilungen_Liste.length; i++) {
			outputAbteilungDaten += abteilungen_Liste[i];
		}
		return String.format("Firma\n%s", outputAbteilungDaten);
	}
}
