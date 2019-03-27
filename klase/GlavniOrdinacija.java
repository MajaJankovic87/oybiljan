package klase;

public class GlavniOrdinacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ordinacija o1=new Ordinacija("Zubic Majstor", 3);
		Pacijent p1=new Pacijent("01"), p2=new Pacijent("02"), p3=new Pacijent("04");
		p1.setImeP("Mile");
		p2.setImeP("Zile");
		p3.setImeP("Cile");
		
		if(o1.postaviPacijenta(p1, 0)) {
			System.out.println("Pacijent 1 postavljen");
		}
		
		if(o1.postaviPacijenta(p2, 0)) {
			System.out.println("Pacijent 2 postavljen");
		}
		else System.out.println("Pacijent 2 nije postavljen");
		
		if(o1.postaviPacijenta(p3, 2)) {
			System.out.println("Pacijent 3 postavljen");
		}
		else {System.out.println("Pacijent 3 nije postavljen");
		}
		
		
		System.out.println(o1);
		o1.skloniPacijenta(0);
		o1.skloniPacijenta(p3);
		System.out.println(o1);
	}

}
