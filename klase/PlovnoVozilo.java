package klase;

public class PlovnoVozilo extends TransportnoVozilo{

	private String imeV;
	private String imeK;
	private int brojClanova;
	private int god;
	public static int brP=0;
	
	public PlovnoVozilo () {
		super();
		this.imeV="";
		this.imeK="";
		this.brojClanova=0;
		this.god=0;
		brP++;
	}
	public PlovnoVozilo (double gorivo, boolean servis, String imeV, String imeK, int brojClanova,int god) {
		super(gorivo, servis);
		this.imeV=imeV;
		this.imeK=imeK;
		this.brojClanova=brojClanova;
		this.god=god;
		brP++;
	}
	
	public String ispis() {
		return imeV+"("+god+")";
	}
	
	public String getImeV() {
		return imeV;
	}
	public void setImeV(String imeV) {
		this.imeV = imeV;
	}
	public String getImeK() {
		return imeK;
	}
	public void setImeK(String imeK) {
		this.imeK = imeK;
	}
	public int getBrojClanova() {
		return brojClanova;
	}
	public void setBrojClanova(int brojClanova) {
		this.brojClanova = brojClanova;
	}
	public int getGod() {
		return god;
	}
	public void setGod(int god) {
		this.god = god;
	}
	@Override
	public void isprazniGorivo(double gorivo) {
		if(getGorivo()>0 && getGorivo()-3*gorivo>0) 
		setGorivo(getGorivo()-3*gorivo);//menjamo gorivo pa moramo set da stavimo
		else System.out.println("Nemate dovoljno goriva");
		//kod Drumskog vozila ne moramo da pisemo ovu metodu i Override jer je ista kao i za transportno vozilo
	}
	@Override
	public String toString() {
		return "Plovno vozilo";
	}
}
