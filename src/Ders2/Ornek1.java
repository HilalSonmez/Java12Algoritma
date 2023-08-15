package Ders2;

import java.util.Scanner;

public class Ornek1 {
public static void main(String[] args)  { //verilen 2 sayıdan büyük olanını bulan
	Scanner scanner=new Scanner(System.in);
	int sayi1,sayi2;
	System.out.println("Sayı 1 giriniz");
	sayi1=scanner.nextInt();
	System.out.println("Sayı 2 giriniz");
	sayi2=scanner.nextInt();
	if(sayi1>sayi2) {
		System.out.println("1.sayi büyük sayi = "+sayi1);
	}
	else if(sayi1==sayi2) {
		System.out.println("Sayilar eşit  "+sayi1);
	}
	else {
	System.out.println("2.sayi büyük sayi = "+sayi2 );
}}
}
