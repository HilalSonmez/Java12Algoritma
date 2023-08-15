package Ders2;

import java.util.Scanner;

public class Ornek8 {

	public static void main(String[] args) { //girilen 3 sayıdan en buyugu
		Scanner scanner=new Scanner(System.in);
		int sayi1,sayi2,sayi3;
		System.out.println("1. sayı  giriniz");
		sayi1=scanner.nextInt();
		System.out.println("2. sayı  giriniz");
		sayi2=scanner.nextInt();
		System.out.println("3. sayı  giriniz");
		sayi3=scanner.nextInt();
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En büyük 1. sayı= "+sayi1);
		
	}
		else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En büyük 2. sayı = "+sayi2); }
		else {
		
				System.out.println("En büyük 3. sayı = "+sayi3);
		}

}}
