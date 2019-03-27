package apstrakt;

public abstract class Trougao {

	private double a;
	private double b;
	private double c;
	
	public double obim() {
		return a+b+c;
	} //apstraktna metoda

	public abstract double povrsina(); //apstraktna metoda
		
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
		@Override
		public String toString() {
			return "Trougao ("+a+","+b+","+c+")";
		}
}
