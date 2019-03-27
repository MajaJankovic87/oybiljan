package apstrakt;

public class PravougliTrougao extends Trougao{

	@Override
	public double povrsina() {
		return getA()*getB()/2;
	}
	
	@Override
	public String toString() {
		return "P("+getA()+","+getB()+","+getC()+")";
	}
	
}
