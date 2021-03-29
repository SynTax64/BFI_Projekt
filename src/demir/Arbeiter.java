package demir;

public class Arbeiter extends Mitarbeiter {

	private double stundenlohn;
	private int anz_stunden;
	private double schicht_Zulage;

	public Arbeiter() {
		super();
	}

	public Arbeiter(double stundenlohn, int anz_stunden, double schicht_Zulage) {
		this();
		this.stundenlohn = stundenlohn;
		this.anz_stunden = anz_stunden;
		this.schicht_Zulage = schicht_Zulage;
	}
	
	public Arbeiter(int id, String name, double stundenlohn, int anz_stunden, double schicht_Zulage) {
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

	public int getAnz_stunden() {
		return anz_stunden;
	}

	public void setAnz_stunden(int anz_stunden) {
		this.anz_stunden = anz_stunden;
	}

	public double getSchicht_Zulage() {
		return schicht_Zulage;
	}

	public void setSchicht_Zulage(double schicht_Zulage) {
		this.schicht_Zulage = schicht_Zulage;
	}
	
	public Arbeiter ausgabe() {
		return this;
	}

}
