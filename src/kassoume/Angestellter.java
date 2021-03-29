package kassoume;

public class Angestellter extends Mitarbeiter {

	double grundgehalt;
	double zulage;
	
	// ------------------------------------------------------------------------
	// constructors
	
	public Angestellter() {
		super();
	}
	
	public Angestellter( double grundgehalt, double zulage ) {
		
		this();
		this.grundgehalt = grundgehalt;
		this.zulage = zulage;
	}
	
	public Angestellter(int id, String name, double grundgehalt, double zulage) {
		
		super(id, name);
		this.grundgehalt = grundgehalt;
		this.zulage = zulage;
	}
	
	// -------------------------------------------------------------------------
	// getter / setter

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
	
	// -------------------------------------------------------------------------
	// Konsole 

	@Override
	public String toString() {
		return "Angestellter [grundgehalt=" + grundgehalt + ", zulage=" + zulage 
				+ ", getGrundgehalt()=" + getGrundgehalt() 
				+ ", getZulage()=" + getZulage() + ", ausgabe()=" + ausgabe() 
				+ ", getId()=" + getId() + ", getName()=" + getName() 
				+ ", toString()=" + super.toString() 
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public Angestellter ausgabe() {
		return this;
	}

}
