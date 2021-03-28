package rettenegger;

public class Angestellter extends Mitarbeiter{
   double grundgehalt;
   double zulage;
   
   public Angestellter() {
	   
   }
   
   public Angestellter(int id, String name, double grundgehalt, double zulage) {
	   this.id=id;
	   this.name=name;
	   this.grundgehalt=grundgehalt;
	   this.zulage=zulage;
   }
   
   
   public void ausgabe() {
	   System.out.println(this.id+" "+this.name+" GG: "+this.grundgehalt+" Zu: "+this.zulage);
	   
   }
   
}
