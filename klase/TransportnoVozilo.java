package klase;

public class TransportnoVozilo {
	
	//potrebno predefinisati toString metode u izvedenim klasama, dodati toString metodu u TransportnoVozilo 

	//plovno vozilo trosi 3x vise goriva od drumskog

	private double gorivo;
	private boolean servis;
	
	
	public TransportnoVozilo () {
		this.gorivo=0;
		this.servis=false;
	}
	
	public TransportnoVozilo(double gorivo, boolean servis) {
		this.gorivo=gorivo;
		this.servis=servis;
	}

	public double getGorivo() {
		return gorivo;
	}

	public void setGorivo(double gorivo) {
		this.gorivo = gorivo;
	}

	public boolean isServis() {
		return servis;
	}

	public void setServis(boolean servis) {
		this.servis = servis;
	}
	
	public void dodajGorivo(double gorivo) {
		this.gorivo+=gorivo;
	}
	
	public void isprazniGorivo(double gorivo) {
		if(this.gorivo>0 && this.gorivo-gorivo>0) 
		this.gorivo-=gorivo;
		else System.out.println("Nemate dovoljno goriva");
	}
	public void servisiraj() {
		if(servis) System.out.println("Vozilo je vec servisirano");
		else servis=true;
		
	}
	
	public String ispis() {
		return "";
	}
	@Override
	public String toString() {
		return "Transportno vozilo";
	}
}
