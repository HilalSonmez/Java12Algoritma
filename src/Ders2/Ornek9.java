package Ders2;

import java.util.Scanner;

public class Ornek9 {

	public static void main(String[] args) { //dairenin çevresi ve alanmı
		Scanner scanner=new Scanner(System.in);
		double yaricap,cevre,alan;
	    final double pi=3.14;
		System.out.println("yarı çap giriniz");
		yaricap=scanner.nextInt();
		if(yaricap<=0) {
			System.out.println("Doğru değer gir");
		}
		else {
		cevre=2*(pi)*yaricap;
		alan=pi*yaricap*yaricap;
		System.out.println("alan= "+alan+" "+ "çevre= "+cevre);
		
		}
}}
