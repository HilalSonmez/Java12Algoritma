package Ders1;

import java.util.Scanner;

public class GitDeneme {

	public static void main(String[] args) {
	int urunFiyat;
	double hamFiyat;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Ürün fiyatı giriniz");
	urunFiyat=scanner.nextInt();
	
	hamFiyat=urunFiyat/(1.18*1.15);
	System.out.println("ham fiyat= " +hamFiyat);

	}

}
