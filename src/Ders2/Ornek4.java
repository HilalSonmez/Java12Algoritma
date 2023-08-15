package Ders2;

import java.util.Scanner;

public class Ornek4 {

	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		
		int vize,finalnot;
		double ortalama;
		
		
		System.out.println("Vize giriniz");
		vize=scanner.nextInt();
		
		System.out.println("Final giriniz");
		finalnot=scanner.nextInt();	
		
		if(vize<0 || finalnot<0 || vize>100 || finalnot>100) {			
			System.out.println("0 dan büyük 100 den küçük bir değer girin");}
			
			
			else  
				ortalama=((vize*(0.4))+(finalnot)*(0.6));
			
				if(ortalama>=50) {
					System.out.println("Geçtiniz");
				}
				else {
					System.out.println("kaldınız");
				}
		
}
		
		
	}

}
