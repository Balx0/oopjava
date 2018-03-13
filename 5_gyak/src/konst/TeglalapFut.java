package konst;

public class TeglalapFut {


	
	public static void main(String[] args) {
		Teglalap a = new Teglalap (2, 5);
		Teglalap b = new Teglalap (3, 7);		//New miatt példányosított ezért objektum
		
		Teglalap c; //Teglalap tipusu referenica változó van helye a memóriában de nem objektum
		c = a;		//a nak a címére fog mutatni c
		
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());		//cvel bármit teszek olyan mintha a-val tenném
		
		
		System.out.println("");
		
		
		
		a.setAB(4, 10); //megváltoztattuk a oldalait
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());		// c is megváltozott
		
		
		System.out.println("");
		
		a.setAB(3, 7);
		System.out.println("Az a==b: "+ (a==b)); //booleant ad vissza h a két objektum címe megegyezik e---mivel két különböző objektum nem számít h megegyeznek a tagjai, különbözők
		System.out.println("Az a==c: "+ (a==c));
		
		System.out.println("");
		System.out.println("Az a==b metódussal: "+ a.oldalakEgyeznekE(b)); //oldalaik tényleg megyezenek
		
		System.out.println("");
		
		
		
		
	}

}
