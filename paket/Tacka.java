package paket;

public class Tacka implements IObjekatUprostoru{//tacka je objekat koji se pomera, na osnovu interfejsa za pomeranje
	
	public double x,y;

	@Override
	public void printLocation() {
		System.out.println(this.toString());//pozivamo kreirani toString
		
	}

	@Override
	public void moveUp(double value) {
		y+=value;
		
	}

	@Override
	public void moveDown(double value) {
		y-=value;
		
	}

	@Override
	public void moveLeft(double value) {
		x-=value;
		
	}

	@Override
	public void moveRight(double value) {
		x+=value;
		
	}

	@Override
	public String toString() {
		
		return "T["+x+","+y+"]";//kreiramo toString
	}
	
	

}
