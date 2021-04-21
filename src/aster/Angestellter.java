package aster;

import java.io.Serializable;

public class Angestellter extends Mitarbeiter implements Serializable {

	private static final long serialVersionUID = 2401164484960530319L;
	private double grundgehalt;
	private double ortszuschlag;
	private double zulage;

	public Angestellter() {
		super();
	}

	public Angestellter(double grundgehalt, double ortszuschlag, double zulage) {
		this();
		this.grundgehalt = grundgehalt;
		this.ortszuschlag = ortszuschlag;
		this.zulage = zulage;
	}

	public Angestellter(int id, String name, double grundgehalt, double ortszuschlag, double zulage) {
		super(id, name);
		this.grundgehalt = grundgehalt;
		this.ortszuschlag = ortszuschlag;
		this.zulage = zulage;
	}

	public double getGrundgehalt() {
		return grundgehalt;
	}

	public void setGrundgehalt(double grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	public double getOrtszuschlag() {
		return ortszuschlag;
	}

	public void setOrtszuschlag(double ortszuschlag) {
		this.ortszuschlag = ortszuschlag;
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
		return String.format("%s, %s, grundgehalt= %.1f, ortszuschlag= %.1f, zulage= %.1f, Brutto= %.1f",
				getClass().getSimpleName(), super.toString(), getGrundgehalt(), getOrtszuschlag(), getZulage(),
				berechneBrutto());
	}

	@Override
	public double berechneBrutto() {
		return getGrundgehalt() + getOrtszuschlag() + getZulage();
	}
}
