package calc;

import java.util.Scanner;

public class CALC {


	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		String oper = "";
		Scanner sc = new Scanner(System.in);
		
		String array[] = new String[10];
		
		
		/*MÁSODIK MEGOLDÁS , Nextline*/
		
		System.out.println("Kérem a műveletet!");
		array = sc.nextLine().split(" ");
		
		number1 = Integer.parseInt(array[0]);
		oper = array[1];
		number2 = Integer.parseInt(array[2]);
		
int result = 0;
		
		switch (oper){
		case "+":
			result = number1 + number2;break;
		case "-":
			result = number1 - number2;break;
		case "*":
			result = number1 * number2;break;
		case "/":
			if(number2 != 0){
			result = number1 / number2;break;
			}
			else System.out.println("0-val nem oszthatunk");
		}
		
		System.out.println("Az eredmény : " + result);
		
		
		
		
		/*ELSŐ MEGOLDÁS,elemenként*/

		/*
		System.out.println("Kérem az elso szamot: ");
		number1 = sc.nextInt();
		
		System.out.println("Kérem az operandust: ");
		oper = sc.next();
		
		System.out.println("Kérem a masodik szamot: ");
		number2 = sc.nextInt();
		
		sc.close();
		
		System.out.println(number1 + " " + oper + " " + number2);
		
		int result = 0;
		
		switch (oper){
		case "+":
			result = number1 + number2;break;
		case "-":
			result = number1 - number2;break;
		case "*":
			result = number1 * number2;break;
		case "/":
			if(number2 != 0){
			result = number1 / number2;break;
			}
			else System.out.println("0-val nem oszthatunk");
		}
		
		System.out.println("Az eredmény : " + result);
		
		*/
		
	}

}
