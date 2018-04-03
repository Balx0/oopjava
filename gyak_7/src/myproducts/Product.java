package myproducts;

public class Product {
	
	private String name;
	private int netprice;
	private int percentage;
	

public Product(String name,int netprice, int percentage){
	this.name=name;
	this.netprice=netprice;
	this.percentage=percentage;
	}

public int getGrossPrice(){
	return (this.netprice + (netprice * (int)(this.percentage/100)));
}

public String toString(){
	return "Product név: " + name + "Bruttó ár: " + getGrossPrice();
}

public void netPriceIncrease(int percentageIn){
	this.netprice = this.netprice + (this.netprice * (percentageIn/100));
}


public int compare(Product other){
	if (this.getGrossPrice() > other.getGrossPrice())
	return 1;
	else if (this.getGrossPrice() < other.getGrossPrice())
	return -1;
	else{
		return 0;
	}
	
	
	
	
}







}


