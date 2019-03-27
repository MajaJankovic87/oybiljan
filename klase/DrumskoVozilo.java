package klase;

public class DrumskoVozilo extends TransportnoVozilo{

	private String model;
	private int kapacitet;
	private int god;
	
    public static int brD;
	
	public DrumskoVozilo() {
		super();
		this.model="";
		this.kapacitet=0;
		this.god=0;
		brD++;
	}
	public DrumskoVozilo(double gorivo, boolean servis, String model, int kapacitet, int god) {
		super(gorivo, servis);
		this.model=model;
		this.kapacitet=kapacitet;
		this.god=god;
		brD++;
	}
	
	public String ispis() {
		return model+"("+god+")";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKapacitet() {
		return kapacitet;
	}
	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	public int getGod() {
		return god;
	}
	public void setGod(int god) {
		this.god = god;
	}
	
	@Override
	public String toString() {
		return "Drumsko vozilo";
	}
}
