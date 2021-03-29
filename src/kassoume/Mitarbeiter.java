package kassoume;

public class Mitarbeiter {

	private int id;
	private String name;
	
	public static final int SIZE = 12;
	
	// ---------------------------------------------------------------
	// constructors
	
	public Mitarbeiter() {
		this(0, "unbekannt");
	}
	
	public Mitarbeiter( int id) {
		this.id = id;
	}
	
	public Mitarbeiter( int id, String name) {
		this.id = id;
		this.name = name;
	}

	// ---------------------------------------------------------------
	// setter / getter
	
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
	
	// ----------------------------------------------------------------
	
	@Override
	public String toString() {
		return "Mitarbeiter [id=" + id + ", name=" + name 
				+ ", getId()=" + getId() 
				+ ", getName()=" + getName()
				+ ", ausgabe()=" + ausgabe() + "]";
	}

	public Mitarbeiter ausgabe() {
		return this;
	}
	

}
