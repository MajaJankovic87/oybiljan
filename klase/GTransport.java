package klase;

public class GTransport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrumskoVozilo d1=new DrumskoVozilo(26, false, "auto", 5, 2001 );
		PlovnoVozilo p1=new PlovnoVozilo(100, false, "brod", "Misa", 10, 1987);
		p1.servisiraj();
		System.out.println(p1.isServis());
		System.out.println(d1.ispis());
		System.out.println(d1.getGorivo());
		d1.dodajGorivo(26);
		d1.isprazniGorivo(90);
		System.out.println(d1.getGorivo());
		System.out.println(DrumskoVozilo.brD);
		System.out.println(PlovnoVozilo.brP);
	}

}
