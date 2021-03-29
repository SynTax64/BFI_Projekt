package schachinger;

public class Arbeiter extends Mitarbeiter {

	private double stundenlohn;
	private double anz_stunden;
	private double schicht_Zulage;

	public Arbeiter() {
		this(0., 0., 0.);
	}

	public Arbeiter(double stundenlohn, double anz_stunden, double schicht_Zulage) {

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

	public Arbeiter ausgabe() {
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() + " \t ");
		builder.append("Arbeiter [Stundenlohn=");
		builder.append(stundenlohn);
		builder.append(", Stundenanzahl=");
		builder.append(anz_stunden);
		builder.append(", Schichtzulage=");
		builder.append(schicht_Zulage);
		builder.append("]");
		return builder.toString();
	}

}
