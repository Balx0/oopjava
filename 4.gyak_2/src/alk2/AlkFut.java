package alk2;

import alk2.Alkalmazott;

public class AlkFut {

	
	public static void main(String[] args) {
		
		Alkalmazott[] alkok = new Alkalmazott[5];
		
		alkok[0] = new Alkalmazott();			//mindegyiket példányosítom
		alkok[0].setName("Senki");
		alkok[0].setPayment(30);
		
		alkok[1] = new Alkalmazott();
		alkok[1].setName("Házi");
		alkok[1].setPayment(18);
		
		alkok[2] = new Alkalmazott();
		alkok[2].setName("Alat");
		alkok[2].setPayment(72);
		
		alkok[3] = new Alkalmazott();
		alkok[3].setName("Tomos");
		alkok[3].setPayment(12);
		
		alkok[4] = new Alkalmazott();
		alkok[4].setName("Alfréd");
		alkok[4].setPayment(4);
	
		for(Alkalmazott a : alkok)				//foreach
		System.out.println(a.getText());
		
		
		int max = alkok[0].getPayment();
		for(int i=0; i < alkok.length ; i++){
			if (alkok[i].getPayment() > max){
				max = alkok[i].getPayment();
			}
		}
		
		System.out.println("A legnagyobb fizetésü alkalmazott: " + max);
		
		
		
		
		
		
		Alkalmazott alkalmazott1 = new Alkalmazott();
		
		
		
		alkalmazott1.setName("Tomi");
		alkalmazott1.setPayment(8);
		
		System.out.println(alkalmazott1.getText());
		alkalmazott1.paymentIncrease(10);
		System.out.println(alkalmazott1.getText());
		
		boolean isTrue = alkalmazott1.fizHatar(10, 20);	//vagy isTrue változó nélkül alkalmazott1.fizHatar(...)van az ifben
		if(isTrue)
		System.out.println("A megadott határok közé esik a fizu");
		else
		System.out.println("Nem esik a megadott határok közé a fizu");
	
		
		
		System.out.println("Az adó értéke: " + alkalmazott1.getTax());
		
		
		
		
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		
		alkalmazott2.setName("Peti");
		alkalmazott2.setPayment(9);
		System.out.println(alkalmazott2.getText());
		alkalmazott2.paymentIncrease(10);
		System.out.println(alkalmazott2.getText());
		
		
		if(alkalmazott1.nagyobbE(alkalmazott2)){
			System.out.println("Az alk1 fizuja több");
		}else System.out.println("Az alk2 fizuja több");
	
	
	}
	

}

