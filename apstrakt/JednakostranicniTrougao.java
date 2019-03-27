package apstrakt;

public class JednakostranicniTrougao extends Trougao {

	@Override
	public double povrsina() {
		return getA()*getA()*Math.sqrt(3)/2;
	}
	
	@Override
	public String toString() {
		return "J("+getA()+","+getB()+","+getC()+")";//primer za ispis, iako je jednakostranicni
	}
}
