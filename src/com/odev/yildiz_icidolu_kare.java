package com.odev;

import java.util.Scanner;

public class yildiz_icidolu_kare {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Degeri girin");
		
		int deger = sc.nextInt();
		for (int i = 0 ; i < deger; i++) {
			for (int j = 0; j < deger; j++) {
				System.out.print("* ");
			}
		System.out.println();
		}

	}

}
