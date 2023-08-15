package Ders2;

import java.util.Scanner;

public class Ornek6 {

	public static void main(String[] args) { //kenarları verılen ucgenın nasıl ucgen
		Scanner scanner=new Scanner(System.in);
		int kenar1,kenar2,kenar3;
		System.out.println("1.kenar  giriniz");
		kenar1=scanner.nextInt();
		System.out.println("2.kenar  giriniz");
		kenar2=scanner.nextInt();
		System.out.println("3.kenar  giriniz");
		kenar3=scanner.nextInt();
		if(kenar1>0 && kenar2>0 && kenar3>0) {
			if(kenar1==kenar2 || kenar1==kenar3 ||kenar2==kenar3) {
				System.out.println("ikiz kenar");
			}
			else if(kenar1==kenar2 && kenar1==kenar3 ) {
				System.out.println("eşkenar");
			}
			else {
				System.out.println("çeşit kenar");
			}
			else {
				System.out.println("kenarlar pozitif olmalı");
			}
		}
		
		
}
	}


