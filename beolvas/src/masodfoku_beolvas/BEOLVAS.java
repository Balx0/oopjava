package masodfoku_beolvas;

import java.util.Scanner;

public class BEOLVAS {

	
	public static void main(String[] args) {
		
		
		int egyutt[] = new int[3];
		
		double discriminant = 0;
		double x1,x2 = 0;
		
		
		Scanner sc = new Scanner(System.in);    /*az sc referencia, lehetne bármi a neve */
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Kérem az 1. együtthatót: ");
		egyutt[0] = sc.nextInt();
		
		System.out.println("Kérem az 2. együtthatót: ");
		egyutt[1] = sc.nextInt();
		
		System.out.println("Kérem az 3. együtthatót: ");
		egyutt[2] = sc.nextInt();
		 
		sc.close();    /*warning elkerülés, befejeztük a beolvasást */
		
		
		a = egyutt[0];
		b = egyutt[1];
		c = egyutt[2];
		
		discriminant = Math.sqrt((b * b) - 4 * a * c);
		System.out.println(discriminant);
		
		 /*NaN=Not a Number*/
		if (discriminant < 0) {
			System.out.println("Nincs valós megoldás");
		}else {
			x1= (b * (-1) + discriminant) /2 * a;
			x2= (b * (-1) - discriminant) /2 * a;
			System.out.println("A megoldasok: x1:" + x1 + " x2:" + x2);
		}
		
	}

}
