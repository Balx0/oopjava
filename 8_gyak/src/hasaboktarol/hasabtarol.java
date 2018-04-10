package hasaboktarol;

import sajatcsomag.*;


public class hasabtarol {
	private Hasáb[] hasabArray;

	
	public hasabtarol(int size){
		this.hasabArray = new Hasáb[size];
	}
	
	public void setHasabRef(int index, Hasáb h){
		this.hasabArray[index] = h;
		
	}
	
	public int getArraySize(){
		return this.hasabArray.length;
	}
	
	public Hasáb getIndexofHasab(int index){
		return this.hasabArray[index];
	}
	
	
	public int getNotNullElements(){
		int db = 0;
		for(Hasáb h : this.hasabArray){
			if (h != null)
				db++;
		}
		return db;
	}
	
	public double getHasabAverageVolume(){
		double sum = 0;
		
		for(Hasáb h : this.hasabArray)
			if(h != null)
			sum = sum + h.getVolume();
	
		return sum / this.hasabArray.length;
	
	}
	
	public int getHengerHasab(){
		int db = 0;
		
		for(Hasáb h : this.hasabArray){
			if(h instanceof Henger)
				db++;
		}
		return db;
	}
	
	
	
	
	
	
	
	
}
