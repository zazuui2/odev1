package com.odev;

import java.util.Scanner;

public class Carpým_tablosu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Degeri girin;");
		int deger = sc.nextInt();
		
		int deger2=1;
		
		while (deger2<=10) {
			
			System.out.println(deger + " * " + deger2 + " = " + deger*deger2  );
			deger2++;
			System.out.println();
			
		}
		

	}

}
