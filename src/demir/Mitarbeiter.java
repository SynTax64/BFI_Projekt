package demir;

public class Mitarbeiter {

	private int id;
	private String name;

	public Mitarbeiter() {
		this(0, "Unbekannter Mitarbeiter");
	}

	public Mitarbeiter(int id) {
		this.id = id;
	}

	public Mitarbeiter(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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
	
	public Mitarbeiter ausgabe() {
		return this;
	}

}
