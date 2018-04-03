package myproducts;

public class Bread extends Product {
		private double amount;
		
		
		
public Bread(String name , int netprice,int percentage, double amount){
	super(name, netprice, percentage);
	this.amount=amount;
	}


public double getPricePerItem(){
	return this.getGrossPrice()/this.amount;
}

public String toString(){
	return super.toString() + "Egységár: " + getPricePerItem();
}


public double getAmount(){
	return this.amount;
}


public static boolean BreadPriceCompare(Bread b1, Bread b2){        //static szócska miatt osztályszintű
	if(b1.getPricePerItem() > b2.getPricePerItem())
		return true;
	else return false;
}









}
