package Ders2;

import java.util.Scanner;

public class Ornek7 {

	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		double ortalama;
		System.out.println("Ortalama  giriniz");
		ortalama=scanner.nextDouble();
		if(ortalama>100 || ortalama<0) {
			System.out.println("Doğru değer gir");
	
		}
		else {if(ortalama>=90 && ortalama<101) {
			System.out.println("AA");
		}
		else if(ortalama<90 && ortalama>=80) {
			System.out.println("BB");
			
}
		else if(ortalama<80 && ortalama>=70) {
			System.out.println("CC");
			

	}
		else if(ortalama<70 && ortalama>=60 ) {
			System.out.println("DD");}
			
		else {
			System.out.println("FF");}
		}
		
}}
