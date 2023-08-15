package Ders2;

import java.util.Scanner;

public class Ornek5 {
	public static void main(String[] args)  { //verilen  sayı çift mi tek mi
		Scanner scanner=new Scanner(System.in);
		int sayi;
		System.out.println("Sayı  giriniz");
		sayi=scanner.nextInt();
		
		if(sayi%2==0) {
			System.out.println("Çift");
		}
		else
			System.out.println("tek");
}
}