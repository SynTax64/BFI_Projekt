package kassoume;

public class Arbeiter extends Mitarbeiter {
	
	double stundenlohn;
	int anz_stunden;
	double schicht_zulage;
	
	// ----------------------------------------------------------------------------
	// constructors

	public Arbeiter() {
		super();
	}
	
	public Arbeiter( double stundenlohn, int anz_stunden, double schicht_zulage ) {
		
		this();
		this.stundenlohn = stundenlohn;
		this.anz_stunden = anz_stunden;
		this.schicht_zulage = schicht_zulage;
	}
	
	public Arbeiter(int id, String name, double stundenlohn, int anz_stunden, 
					double schicht_zulage) {
		
		super(id, name);
		this.stundenlohn = stundenlohn;
		this.anz_stunden = anz_stunden;
		this.schicht_zulage = schicht_zulage;
	}
	
	// ----------------------------------------------------------------------------
	// getter & setter

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

	public double getSchicht_zulage() {
		return schicht_zulage;
	}

	public void setSchicht_zulage(double schicht_zulage) {
		this.schicht_zulage = schicht_zulage;
	}
	
	// ---------------------------------------------------------------------------
	// Terminal
	
	@Override
	public String toString() {
		return "Arbeiter [stundenlohn=" + stundenlohn + ", anz_stunden=" + anz_stunden 
				+ ", schicht_zulage=" + schicht_zulage 
				+ ", getStundenlohn()=" + getStundenlohn() 
				+ ", getAnz_stunden()=" + getAnz_stunden()
				+ ", getSchicht_zulage()=" + getSchicht_zulage() 
				+ ", ausgabe()=" + ausgabe() + "]";
	}

	public Arbeiter ausgabe() {
		return this;
	} 

}
