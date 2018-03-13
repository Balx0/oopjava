package konst;



import java.util.Random;
import java.util.Scanner;




public class TeglalapFut2 {

	
	
	
	public static void main(String[] args) {
		
		Teglalap rectangles[] = new Teglalap[10];
		

		
		int mini = 0;
		for(int i = 0; i < rectangles.length; i++){
			rectangles[i] = new Teglalap((int)(Math.random()*9) + 2,(int)(Math.random()*9) + 2); // math.random()*felso-also+1 + alsohatar
			
			System.out.println(rectangles[i].getAdatok());
			if(rectangles[i].getTerulet() < rectangles[mini].getTerulet())
				mini = i;
			
			
			
		}
		
		System.out.println("A legkisebb területü téglalap adatain: " + rectangles[mini].getAdatok());
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kérem a téglalap a oldalát");
		int NewA = sc.nextInt();
		System.out.println("Kérem a téglalap b oldalát");
		int NewB = sc.nextInt();
		
		
		Teglalap newRectangle = new Teglalap(NewA, NewB);
		
		
		int db = 0;
		for(Teglalap t : rectangles){
			if(t.getTerulet() < newRectangle.getTerulet())
				db++;
		}
		System.out.println("A megadott új téglalaptól kisebb területü téglalapok száma: " + db);
		
		
		boolean isTrue = false;
		int index = 0;
		for(int i = 0; i < rectangles.length; i++){
			if(rectangles[i].oldalakEgyeznekE(newRectangle)){
				
				isTrue=true;
				index = i;
				break;
		}
		}
		if(isTrue)
		System.out.println("Az egyező oldalú téglalap objektum indexe: " + index);
		else
		System.out.println("Nem volt egyező téglalap");
		
		
		

		
	}

}
