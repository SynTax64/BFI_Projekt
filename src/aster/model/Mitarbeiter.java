package aster.model;

import java.io.Serializable;

public abstract class Mitarbeiter implements Serializable {

	private static final long serialVersionUID = 5246599947086653567L;
	private int id;
	private String name;

	public Mitarbeiter() {
		this(0, "unbekannt");
	}

	public Mitarbeiter(int id) {
		this.id = id;
	}

	public Mitarbeiter(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public abstract double berechneBrutto();

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
		return String.format("id= %d, name= %s", getId(), getName());
	}
}
