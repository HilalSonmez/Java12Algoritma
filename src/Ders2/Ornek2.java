package Ders2;

import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) { // girilen tl yi dolara çevirme
		Scanner scanner=new Scanner(System.in);
		int tl;
		double cevir;
		System.out.println("Tl miktarı gir giriniz");
		tl=scanner.nextInt();
		cevir=tl/(27.06);
		System.out.println("Dolar miktarı"+cevir);
		
		
	}

	}
