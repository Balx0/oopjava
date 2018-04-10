package sajatcsomag;

public class Henger extends Hasáb {
	private double radius;
	
	public Henger(int radius, int height){
		super(height);					//kötelező a supernek elsönek lennie
		this.radius = radius;
		
	}

	public double baseArea(){
		
		return this.radius * this.radius * Math.PI;
		//return Math.pow(radius, 2) * Math.PI;
	}
	
	public String toString(){
		return "A henger adatai: [sugár: " + this.radius + " magasság: " + super.getHeight() + "]";
	}
	
	
	
	
	
}
