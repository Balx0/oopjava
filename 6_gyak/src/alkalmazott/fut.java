package alkalmazott;

import java.util.Scanner;

public class fut {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Kérem az alkalmazottak számát:");
		int numberOfEmp = sc.nextInt();
		
		
		
		
		Alkalmazott [] alkok = new Alkalmazott [numberOfEmp];
		
		for(int i = 0; i < alkok.length; i++){
			int j=i+1;
			System.out.println("Kérem az " + j + ".alkalmazott nevét: ");
			String name = sc.next();
			
		
			
			System.out.println("Kérem az " + j + ".alkalmazott korát: ");
			int age = sc.nextInt();
			
		
			
			
			System.out.println("Kérem az " + j + ".alkalmazott fizetését:");
			int payment = sc.nextInt(); 
			
			
			
			alkok[i] = new Alkalmazott(name, age, payment);
			System.out.println(" ");
			
		}
		
	
		
		for (int i = 0; i < alkok.length; i++) {
			System.out.println(alkok[i].toString());
		}
		
		Alkalmazott.setRetirementAge(72);
		
		System.out.println("----");
		
		
		System.out.println("5555555: ");
		
		 
		for(int j = 0; j< alkok.length; j++) {
		}
		
		for(int j = 0; j< alkok.length; j++) {
			if(alkok[j].getYearsTillRetirement() < 5)
				System.out.println(alkok[j].toString());
		}
		
		
		System.out.println("-----");
		
		
		
		int sum = 0;
		double average = 0.0;
		
		
		for (int i = 0; i< alkok.length; i++){
			
		sum = sum + alkok[i].getYearsTillRetirement();
		}
		
		average = (double)sum / (double)alkok.length;
		
		
		for (int i = 0; i< alkok.length; i++){
			if(alkok[i].getYearsTillRetirement() > average)
				System.out.println(alkok[i].toString());
			}
		
		
		System.out.println("-----");
		
		
		Alkalmazott[] sortedArray = new Alkalmazott[alkok.length];
		Alkalmazott temp;
		for (int j=0; j < alkok.length-1 ; j++){
			for(int i = 0; i < alkok.length-1; i++){
				if(alkok[i].getYearsTillRetirement() > alkok[i+1].getYearsTillRetirement()){
					temp = alkok[i];
					alkok[i]=alkok[i+1];
					alkok[i+1]=temp;
					sortedArray = alkok;
				}
			}
		}
		
		for(int i = 0; i < sortedArray.length; i++){
			System.out.println(sortedArray[i].toString());
		}
		
		
		
		sc.close();
		
		
		
		

	}

}