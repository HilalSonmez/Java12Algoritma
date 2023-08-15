package Ders2;

import java.util.Scanner;

public class Ornek3 {

	public static void main(String[] args) { // kullanıcıdan alınan notlarını hesaplayarak gecıp gecme
		                                     //gecmedıgını hesaplayan fınnal 60 vize 40 gecme 50
		Scanner scanner=new Scanner(System.in);
	
		double vize,finalnot,ortalama;
		System.out.println("Vize giriniz");
		vize=scanner.nextInt();
		System.out.println("Final giriniz");
		finalnot=scanner.nextInt();
		ortalama=((vize*(0.4))+(finalnot)*(0.6));
		if(ortalama>=50) {
			System.out.println("Geçtiniz");
		}
		else {
			System.out.println("kaldınız");
		}
		
	}

}
