package random;

import java.util.Random;

public class RAND {

	
	public static void main(String[] args) {
		
		int array[] = new int [10];
		Random rnd = new Random();
		
		
		for(int i=0;i<array.length;i++){
			array[i] = rnd.nextInt(50) + 1;
			System.out.println(array[i]);
			/*array[i] = (int)(Math.random() * 50) + 1;
			System.out.println(array[i]);*/
		}
		
		
		/*for(int e : array){
			System.out.println(e);
		}*/
		
		System.out.println("\n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[9-i] + " ");
		}
		
		
		//MAXKERESÉS
		int maxindex = 0;
		for(int i = 0;i < array.length; i++){
			if(array[i] > array[maxindex])
				maxindex=i;
		}
		System.out.println("A legnagyobb elem:" + array[maxindex]);
		
		
		

		//MAXKERESÉS PÁROS
		int maxindexp = 0;
		for(int i = 0;i < array.length; i++){
			if(array[i] > array[maxindexp] && array[i]%2==0)
				maxindexp=i;
		}
		System.out.println("A legnagyobb páros elem:" + array[maxindexp]);
	}

}
