package com.odev;

import java.util.Scanner;

public class yildiz_icibos_kare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Degeri girin;");
		int deger = sc.nextInt();
		
		for (int a = 0; a < deger; a++) {
			
            System.out.print("* ");
            
        }
		
        System.out.println();
        
            for (int b = 0; b < deger - 2; b++) {
            	
                System.out.print("* ");
                
                for (int c = 0; c < deger - 2; c++) {
                	
                    System.out.print("  ");
                    
                 }
                
                System.out.println("*");
                
              }

                for (int d = 0; d < deger; d++) {
                	
                	 System.out.print("* ");
                	
                }

	}

}
