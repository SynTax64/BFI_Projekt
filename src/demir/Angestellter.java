package demir;

public class Angestellter extends Mitarbeiter {

	private double grundgehalt;
	private double zulage;

	public Angestellter() {
		super();
	}

	public Angestellter(double grundgehalt, double zulage) {
		this();
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

}
