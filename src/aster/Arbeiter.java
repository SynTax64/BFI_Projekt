package aster;

public class Arbeiter extends Mitarbeiter {
	private double stundenlohn;
	private double anz_stunden;
	private double schicht_Zulage;

	public Arbeiter() {
		super();
	}

	public Arbeiter(double stundenlohn, double anz_stunden, double schicht_Zulage) {
		this();
		this.stundenlohn = stundenlohn;
		this.anz_stunden = anz_stunden;
		this.schicht_Zulage = schicht_Zulage;
	}

	public Arbeiter(int id, String name, double stundenlohn, double anz_stunden, double schicht_Zulage) {
		super(id, name);
		this.stundenlohn = stundenlohn;
		this.anz_stunden = anz_stunden;
		this.schicht_Zulage = schicht_Zulage;
	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public double getAnz_stunden() {
		return anz_stunden;
	}

	public void setAnz_stunden(double anz_stunden) {
		this.anz_stunden = anz_stunden;
	}

	public double getSchicht_Zulage() {
		return schicht_Zulage;
	}

	public void setSchicht_Zulage(double schicht_Zulage) {
		this.schicht_Zulage = schicht_Zulage;
	}

	@Override
	public String toString() {
		return String.format("Arbeiter, stundenlohn= %.1f, anz_stunden= %.1f, schicht_Zulage= %.1f, %s",
				getStundenlohn(), getAnz_stunden(), getSchicht_Zulage(), super.toString());
	}

	public Arbeiter ausgabe() {
		return this;
	}
}
