package aster.model;

import java.io.Serializable;

public class Arbeiter extends Mitarbeiter implements Serializable {
	private double stundenlohn;
	private double anz_stunden;
	private double ortszuschlag;
	private double schicht_Zulage;

	public Arbeiter() {
		super();
	}

	public Arbeiter(double stundenlohn, double anz_stunden, double ortszuschlag, double schicht_Zulage) {
		this();
		this.stundenlohn = stundenlohn;
		this.anz_stunden = anz_stunden;
		this.ortszuschlag = ortszuschlag;
		this.schicht_Zulage = schicht_Zulage;
	}

	public Arbeiter(int id, String name, double stundenlohn, double anz_stunden, double ortszuschlag,
			double schicht_Zulage) {
		super(id, name);
		this.stundenlohn = stundenlohn;
		this.anz_stunden = anz_stunden;
		this.ortszuschlag = ortszuschlag;
		this.schicht_Zulage = schicht_Zulage;
	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public double getAnz_stunden() {
		return anz_stunden;
	}

	public void setAnz_stunden(double anz_stunden) {
		this.anz_stunden = anz_stunden;
	}

	public double getGetOrtszuschlag() {
		return ortszuschlag;
	}

	public void setGetOrtszuschlag(double ortszuschlag) {
		this.ortszuschlag = ortszuschlag;
	}

	public double getSchicht_Zulage() {
		return schicht_Zulage;
	}

	public void setSchicht_Zulage(double schicht_Zulage) {
		this.schicht_Zulage = schicht_Zulage;
	}

	@Override
	public String toString() {
		return String.format(
				"%s, %s, stundenlohn= %.1f, anz_stunden= %.1f, ortszuschlag= %.1f, schicht_Zulage= %.1f, Brutto= %.1f",
				getClass().getSimpleName(), super.toString(), getStundenlohn(), getAnz_stunden(), getGetOrtszuschlag(),
				getSchicht_Zulage(), berechneBrutto());
	}

	public Arbeiter ausgabe() {
		return this;
	}

	@Override
	public double berechneBrutto() {
		return (getStundenlohn() * getAnz_stunden()) + getGetOrtszuschlag() + getSchicht_Zulage();
	}
}
