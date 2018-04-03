package myproductsproba;



import myproducts.Bread;
import myproducts.Product;

public class productfut {

	
	

	public static void main(String[] args) {
		Product p1 = new Product("Product1", 100, 27);
		Bread b1 = new Bread("Bread1", 200, 27, 2);
		
		
		
		System.out.println("A p1 adatai: " + p1.toString());
		System.out.println("A b1 adatai: " + b1.toString());
		
		System.out.println(" ");
		
		
	int compare = p1.compare(b1);
	if(compare == 1)
		System.out.println("A p1 ára a nagyobb.");
	else if(compare == -1)
		System.out.println("A b1 ára a nagyobb.");
	else
		System.out.println("A p1 és b1 ára megyegyezik");
	
	System.out.println(" ");
	
	Bread b2 = new Bread("b2", 150, 24, 3);
	Product product2 = b2;
	System.out.println("A b2 adatai:" + product2.toString());
	
	}

	
	
	
	
}
