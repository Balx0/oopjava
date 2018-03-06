package alk;

public class AlkFut {

	
	public static void main(String[] args) {
		Alkalmazott alkalmazott1 = new Alkalmazott();
		
		alkalmazott1.name = "Tomi";
		alkalmazott1.payment = 0;
		
		System.out.println(alkalmazott1.getText());
		alkalmazott1.paymentIncrease(300);
		System.out.println(alkalmazott1.getText());

	}

}

