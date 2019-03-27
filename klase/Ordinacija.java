package klase;

public class Ordinacija {

	private String naziv;
	private Pacijent[] stolice;//niz pacijenata na stolicama
	
	public Ordinacija(String naziv, int k) {
		this.naziv=naziv;
		this.stolice=new Pacijent [k];//ovo kreira prazan niz dok ga ne popunimo pacijentom
	}
	
	public String getNaziv() {
		return this.naziv;
	}
		
	public int getBrStolica() {
		return this.stolice.length; //ovo vraca duzinu niza stolica, odnosno k
		
	}
	
	public boolean postaviPacijenta(Pacijent p, int i) {//i nam je brojac, umesto k-broja stolica
		if(i>=this.stolice.length || i<0) //ako je stolica -1 ili stolica veca od broja stolica vrati false
			return false;
		if(stolice[i]!=null) return false;//ako je stolica zauzeta
		/*for (int j=0;j<=stolice.length;j++) {
			if(stolice[j]!=null) {
				if(stolice[j]==p) {
					stolice[j]=null;
					return;
				}
			}
		}*/
		stolice[i]=p; //ako su ispunjeni uslovi smestamo pacijenta na stolicu
		return true;
	}
	
	public void skloniPacijenta(int i) {
		if(i>=this.stolice.length || i<0) return;
		if(stolice[i]==null) return;
		stolice [i]=null;//skloni pacijenta sa stolice 2 npr.
	}
	
	public void skloniPacijenta(Pacijent p) {
		for (int i=0;i<=stolice.length;i++) {
			if(stolice[i]!=null) {
				if(stolice[i]==p) {
					stolice[i]=null;
					return;
				}
			}
		}
	}

	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder(this.getNaziv());
		sb.append("(");
		sb.append(this.getBrStolica());
		sb.append(":");
		for(int i=0; i<stolice.length; i++) {
			if(stolice[i]!=null) sb.append(stolice[i]);
		}
		sb.append("]");
		return sb.toString();			
	}	
	
}
