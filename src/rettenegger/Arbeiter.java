package rettenegger;

public class Arbeiter extends Mitarbeiter {

	double stundenlohn;
	double anz_stunden;
	double schicht_Zulage;
	
	public Arbeiter() {
		
	}
	
	public Arbeiter(int id, String name, double stundenlohn, double anz_stunden, double schicht_Zulage) {
		this.id=id;
		this.name=name;
		this.stundenlohn=stundenlohn;
		this.anz_stunden=anz_stunden;
		this.schicht_Zulage=schicht_Zulage;
	}

	
	public void ausgabe() {
		System.out.println(this.id+" "+this.name+" StdL: "+this.stundenlohn+" Zul: "+this.schicht_Zulage+" "+this.anz_stunden);
		
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

	public double getSchicht_Zulage() {
		return schicht_Zulage;
	}

	public void setSchicht_Zulage(double schicht_Zulage) {
		this.schicht_Zulage = schicht_Zulage;
	}
	
	
	
}
