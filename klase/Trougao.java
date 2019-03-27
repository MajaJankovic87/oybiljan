package klase;

public class Trougao extends Figura{
	
	private double a;
	private double b;
	private double c;
	
	public Trougao(double a, double b, double c) {
		super();
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public Trougao(double obim, double povrsina, String naziv, double a, double b, double c) {
		  super (obim, povrsina, naziv);
		  this.a=a;
		  this.b=b;
		  this.c=c;
	  }
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public void setA(double a) {
		this.a=a;
	}
	public void setB(double b) {
		this.b=b;
	}
	public void setC(double c) {
		this.c=c;
	}
}
