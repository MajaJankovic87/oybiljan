package klase;

public class Pacijent {

	public static int uid=0;//nije vezano za objekat vec za klasu
	private int id;
	private String imeP;
	private String brK;
	
	public Pacijent(String brK) { //u konstruktoru nema id, jer se automatski odredjuje
	  id=++uid;  //uzima uid i povecava ga za 1, kad god se napravi novi pacijent.Prvi pacijent ima id1
	  this.imeP="";   //drugi pacijent id2, treci id3 itd..
	  
}

	public int getId() {
	return this.id;
	}

	public String getImeP() {
		return imeP;
	}

	public void setImeP(String imeP) {
		this.imeP = imeP;
	}

	public String getBrK() {
		return brK;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getImeP()+"["+this.getId()+":"+this.getBrK()+"]";
	}
	
	
}
	
