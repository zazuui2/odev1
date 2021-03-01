package com.odev;

import java.util.Scanner;

public class Asal_sayi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deger araligini girin;");
		
		System.out.println("Ilk deger;");
		double deger1 = sc.nextInt();
		System.out.println("Ikýncý deger;");
		double deger2 = sc.nextInt();
		
		if (deger1<deger2) {
			
			while (deger1<=deger2) {
									
				double asaldeger = (Math.pow(2, deger1))%(deger1);
				
				if (asaldeger == 2)System.out.println(deger1);
				deger1++;
														
			}
			
		}else System.out.println("ilk deger ikinci degerden kucuk olmalidir");
		
	}

}
