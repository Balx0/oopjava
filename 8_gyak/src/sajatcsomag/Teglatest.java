package sajatcsomag;

public class Teglatest extends Hasáb {
	private double a;
	private double b;


public Teglatest(double a, double b, int height){
	super(height);
	this.a = a;
	this.b = b;
	
}
@Override
public double baseArea(){
	return a * b;
}

public String toString(){
	return "A téglatest adatai:[a oldal:" + this.a + " b oldal:" + this.b + " magasság:" + super.getHeight() + "]";
}
}