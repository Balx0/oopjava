package alk2;

public class Alkalmazott {

	private String name; // Innentől minden adattag private
	private int payment; 



	public String getName(){
		return name;
	}
	
	public void setName(String nameIn){
		name = nameIn;
	}
	
	
	public int getPayment(){
		return payment;
	}
	
	
	public void setPayment(int paymentIn){
		payment = paymentIn;
	}
	
	public void paymentIncrease(int paymentIn) { // fizetés növelő metódus
		payment += paymentIn;
	}

	public String getText() { // stringben visszaadja az adatokat

		return "Nev:" + name + " " + "Fizetés: " + payment; 	// vagy s stringbe bele a
																// nev + fizu és return s
														

	}
	
	
	
	
	
	public boolean fizHatar(int lower, int upper){
		
		if(payment >= lower && payment <= upper)
			return true;
		else return false;
	}
	
	public double getTax(){
		return (double)payment * ((double)16/ (double)100);
	}
	
	public boolean nagyobbE(Alkalmazott a){
		if (payment > a.payment)
			return true;
		else return false;
	}
	
}
