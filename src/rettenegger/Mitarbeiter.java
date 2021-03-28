package rettenegger;

public class Mitarbeiter {

	int id;
	String name;
	
	public Mitarbeiter() {
		
	}
	
	public Mitarbeiter(int id) {
		this.id=id;
	}
	
	public Mitarbeiter(int id, String name) {
		this.id=id;
		this.name=name;
	}

	
	public void ausgabe() {
		System.out.println(this.id +" "+this.name);
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
	
	
	
}
