package alk;

public class Alkalmazott {

	String name; // Félnyílvános adattagok
	int payment; // mert nincs módosító(sérti az adatrejtést)

	public void paymentIncrease(int paymentIn) { // fizetés növelő metódus
		payment = +paymentIn;
	}

	public String getText() { // stringben visszaadja az adatokat

		return "Nev:" + name + " " + "Fizetés: " + payment; // vagy s stringbe bele a
														// nev + fizu és return s
														

	}

}
