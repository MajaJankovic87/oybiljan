package apstrakt;

public class GlavniTrougao {

	public static void main(String[] args) {
		
		
		//Trougao t=new Trougao(); java ne dozvoljava da se napravi apstraktni trougao
		PravougliTrougao p=new PravougliTrougao();
		p.setA(3);
		p.setB(4);
		p.setC(5);
		
		System.out.println(p.toString());
		System.out.println("Obim pravouglog trougla je: "+p.obim());
		System.out.println("Povrsina prav.trougla je: "+p.povrsina());
		
		JednakostranicniTrougao j=new JednakostranicniTrougao();
		j.setA(5);
		j.setB(5);
		j.setC(5);
		
		System.out.println(j.toString());
		System.out.println("Obim jednakostranicnog trougla je: "+j.obim());
		System.out.println("Povrsina jednakostranicnog trougla je: "+j.povrsina());

	}

}
