package klase;

	public class Krug extends Figura{ //moze samo jedna klasa da se nasledi, ovde je Figura
	
  private double poluprecnik;
  
  public Krug(double poluprecnik) {
	  super();   //mora biti na prvom mestu na pocetku konstruktora. Uzeli smo prvi, prazan konstruktor
	  this.poluprecnik=poluprecnik;
  }
  
  public Krug(double obim, double povrsina, String naziv, double poluprecnik) {
	  super(obim, povrsina, naziv);//uzeli smo drugi konstruktor iz klase Figura
	  this.poluprecnik=poluprecnik;	  
  }

  public double getPoluprecnik() {
	return poluprecnik;
}

  public void setPoluprecnik(double poluprecnik) {
	this.poluprecnik = poluprecnik;
}
  
  
}
