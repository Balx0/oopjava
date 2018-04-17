package bwe;

import java.util.Scanner;

import bwe.BookWithEnum.style;

public class Test {

	
	public static void main(String[] args) {
		BookWithEnum[] bweArray;
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Kérem az adatok számát: ");
		int length = sc.nextInt();
		
		
		bweArray = new BookWithEnum[length];
		
		for(int i = 0; i < bweArray.length; i++){
		
		System.out.println("Kérem a(z)" + i  + " címet: ");
		String title = sc.next();
		System.out.println("Kérem a(z)" + i  + " szerzőt: ");
		String author = sc.next();
		System.out.println("Kérem a(z)" + i  + " kiadás évét: ");
		int dateOfissue = sc.nextInt();
		System.out.println("Kérem a(z)" + i + " árat: ");
		int price = sc.nextInt();
		
		System.out.println("Kérem a stílust: ");
		String styleString = sc.next();
		style bookStyle =style.ROMANCE;
		
		if(styleString.contains("cook"))
			bookStyle = style.COOK;
		if(styleString.contains("romance"))
			bookStyle = style.ROMANCE;
		if(styleString.contains("other"))
			bookStyle = style.OTHER;
		if(styleString.contains("scifi"))
			bookStyle = style.SCIFI;
		
		bweArray[i] = new BookWithEnum(title, author, dateOfissue , price, bookStyle);
		
		
		
			
		}
		sc.close();

		bookDataWrite(bweArray);
		BookWithEnum[] bweArray2 = getBWE(bweArray, style.SCIFI);
		bookDataWrite(bweArray2);
				
	
		
		
	}
	
	public static void bookDataWrite(Konyv[] bookArray){
		System.out.println("");
		for(Konyv b : bookArray)
			System.out.println(b.toString());
	}
	
	
	public static BookWithEnum[] getBWE(BookWithEnum[] bweArray, style bookStyle){
		
		BookWithEnum[] bweTemp = new BookWithEnum[bweArray.length];
		
		for(int i = 0;i < bweArray.length; i++){
			if(bweArray[i].getBookStyle() == bookStyle){
				bweTemp[i] = bweArray[i];
			}
		}
		return bweTemp;
	}

}
