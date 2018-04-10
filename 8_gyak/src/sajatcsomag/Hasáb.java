package sajatcsomag;

public abstract class Hasáb {
	private int height;
	
	
	public Hasáb(int height){
		this.height = height;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public abstract double baseArea();
	
	public double getVolume(){
		return baseArea() * this.height;
	}
	
	public boolean hasabCompare(Hasáb other){
		if(this.getVolume() > other.getVolume())
			return true;
		
		return false;

	}
	
	
	
	
	
	
	
}
