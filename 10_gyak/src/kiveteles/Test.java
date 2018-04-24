package kiveteles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {


	public static void main(String[] args) {
		int[] array = new int[5];
		//Scanner sc = new Scanner(System.in);
		
		try {
			readNextInt(array);
		} catch (PrimeException e){
			e.printStackTrace();
		}
		writeElements(array);
		
		
		}
	
	public static void writeElements(int[] arrayIn){
		for(int i=0;i<arrayIn.length;i++)
			System.out.println("A tömb " + (i+1) + ". eleme: " + arrayIn[i]);
		
	
	}
	
	//
	
	public static void readNextInt(int[] arrayIn) throws PrimeException{
		Scanner sc= new Scanner(System.in);
		//int number = 0;
		
		
		for(int i=0;i<arrayIn.length;i++){
			System.out.println("Kérem a tömb " +i+ " . elemét: ");
			
			int number =  sc.nextInt();
			
			if(isPrime(number)){
				arrayIn[i]=number;
			}else{
				throw new PrimeException("Nem prím");
			}
			
		}
		sc.close();
		System.out.println("");
		writeElements(arrayIn);
	}
	
	public static void readNextLine(int[] arrayIn){
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<arrayIn.length;i++){
			System.out.println("Kérem a tömb " +i+ " . elemét: ");
			String line = sc.nextLine();
			arrayIn[i] = Integer.parseInt(line);
			
		}
		sc.close();
		System.out.println("");
		writeElements(arrayIn);
	}
	
	
	public static void readBRintValue(int[] arrayIn){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int i=0;i<arrayIn.length;i++){
			System.out.println("Kérem a tömb " + i + ". elemét: ");
			String line = "";
			
		try{
			line = br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		arrayIn[i] = Integer.valueOf(line).intValue();
			
			
			
			
			arrayIn[i] =Integer.valueOf(line).intValue();
			writeElements(arrayIn);
		}
			
		}
		public static void readBRintValue2(int[] arrayIn){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			for(int i=0;i<arrayIn.length;i++){
				System.out.println("Kérem a tömb " + i + ". elemét: ");
				String line = "";
				
			try{
				line = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			} catch(Exception e){
				e.printStackTrace();
			}
				arrayIn[i] =Integer.parseInt(line);	
			}writeElements(arrayIn);}
		
		
		public static boolean isPrime(int number){
			for(int i=2;i<number;i++){
				if(number%i == 0){
					return false;
				}
			}
			return true;
		}
		
		
		}
	

	
	


