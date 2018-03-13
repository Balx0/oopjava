package konst;

public class Teglalap {

	
	private int a;
	private int b;

	
	public Teglalap(int aIn, int bIn) {			//Konstruktor neve = Osztály neve!!! ha nem akkor nem konstruktor
	
		a = aIn;
		b = bIn;
	}
	
	public Teglalap(int sideIn){		//másik konstruktor ami 4zetet ad
		a = sideIn;
		b = sideIn;
	}
	
	
	public int getTerulet(){			// tudja kezelni a fent megadott adattagokat
		return a * b;
	}
	
	public String getAdatok(){
		return "A oldal:" + a + " B oldal:" + b + " Terulet:" + getTerulet();
	}
	
	public void setAB(int aIn,int  bIn){
		a = aIn;
		b = bIn;
	}
	
	public void setAA(int sideIn){
		a = sideIn;
		b = sideIn;
	}
	
	public int getA(){
		return a;
	}
	

	public int getB(){
		return b;
	}
	
	public boolean nagyobb_e(Teglalap other){
		if(getTerulet() > other.getTerulet() )
			return true;
		else return false;
		
	}
	
	public boolean oldalakEgyeznekE(Teglalap other){
		if(a == other.getA() && b == other.getB())	// itt lehetne other.a és other.b mert ugyan azon osztályban vagyunk ott kéne a getA() getB()
			return true;
		
		return false;
	}
	
	
	
	

}
