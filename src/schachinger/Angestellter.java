package schachinger;

public class Angestellter extends Mitarbeiter {

	private double grundgehalt;
	private double zulage;

	public Angestellter() {
		this(0., 0.);
	}

	public Angestellter(double grundgehalt, double zulage) {

		this.grundgehalt = grundgehalt;
		this.zulage = zulage;
	}

	public Angestellter(int id, String name, double grundgehalt, double zulage) {
		super(id, name);
		this.grundgehalt = grundgehalt;
		this.zulage = zulage;
	}

	public double getGrundgehalt() {
		return grundgehalt;
	}

	public void setGrundgehalt(double grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	public double getZulage() {
		return zulage;
	}

	public void setZulage(double zulage) {
		this.zulage = zulage;
	}

	public Angestellter ausgabe() {
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() + " \t ");
		builder.append("Angestellter [Grundgehalt = ");
		builder.append(grundgehalt);
		builder.append(", Zulage = ");
		builder.append(zulage);
		builder.append("]");
		return builder.toString();
	}

}
