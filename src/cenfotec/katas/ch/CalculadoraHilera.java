package cenfotec.katas.ch;

import java.util.Scanner;

public class CalculadoraHilera {
	
	public CalculadoraHilera(String num) {
		Add(num);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String Numero;
		do {
			System.out.print("Ingrese una hilera de números: ");
			Numero = sc.next(); 
			System.out.println("El total de la suma es = " + Add(Numero));
			} while (Numero != null);
		    	
		  }
	
	public static int Add(String numbers) {
		String num = numbers;
		int sumaNum = 0;
		String [] arrayNums = num.split("[,\\;]");
	
		//if (num.split(",") != null){
		//	System.out.println("Error"); 
		//} 	
			if (arrayNums.length == 0) {
				System.out.println("0"); 
			
			} 
			//else if (arrayNums.length > 3) {		
			//	System.out.println("Error, excede la cantidad de números "); 
					
			//} 
			else {
				for (int i = 0; i < arrayNums.length; i++) {						
				sumaNum = sumaNum + Integer.parseInt(arrayNums[i]);
				}			
			}		
			return sumaNum;		
	}
	
}	

