package schachinger;

public class Mitarbeiter {

	protected int id;
	protected String name;

	public Mitarbeiter() {
		this(0, "default");
	}

	public Mitarbeiter(int id) {

		this.id = id;
	}

	public Mitarbeiter(int id, String name) {

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mitarbeiter [ID = ");
		builder.append(id);
		builder.append(", Name = ");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
